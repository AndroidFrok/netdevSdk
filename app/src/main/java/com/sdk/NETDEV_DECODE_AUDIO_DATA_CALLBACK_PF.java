package com.sdk;

import android.media.AudioFormat;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class NETDEV_DECODE_AUDIO_DATA_CALLBACK_PF {

    MyAudioTrack audioTrack = null;
    boolean flag = false;
    Thread myThread = null;
    private BlockingQueue<NETDEV_WAVE_DATA_S> WaveDataQue = new LinkedBlockingQueue<NETDEV_WAVE_DATA_S>(100);

    public NETDEV_DECODE_AUDIO_DATA_CALLBACK_PF()
    {
//        audioTrack = new MyAudioTrack(8000, AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_16BIT);
//        audioTrack.init();
    }

    public void release()
    {
        audioTrack.release();
        audioTrack = null;
    }

    /**
     * 解码后音频流数据回调函数的指针类型  Type of pointer to callback function for decoded audio stream data
     * @param [IN] lpPlayHandle   当前的实况播放句柄 Current live playing handle
     * @param [IN] pstWaveData    存放解码后音频流数据信息缓冲区指针 Pointer to buffer that stores decoded audio stream data
     * @param [IN] lpUserParam    用户设置参数,即用户在调用#NDPlayer_SetDecodeAudioDataCB函数时指定的用户参数 User-set parameters, specified by users when they call the #NDPlayer_SetDecodeAudioDataCB function
     * @return 无. None.
     * @note
     * -     用户应及时处理输出的音频流数据,确保函数尽快返回,否则会影响播放器内的媒体流处理.
     * -     Users should handle output stream data in a timely manner so that functions can be returned quickly. Otherwise, stream processing in the player will be affected.
     */
    void NETDEV_DECODE_AUDIO_DATA_CALLBACK_PF(long lpPlayHandle, NETDEV_WAVE_DATA_S pstWaveData, long lpUserParam)
    {
        WaveDataQue.add(pstWaveData);

        if (myThread==null){
            myThread = new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            while (true)
                            {
                                if(WaveDataQue.size() > 0)
                                {
                                    NETDEV_WAVE_DATA_S stWaveData = WaveDataQue.peek();
                                    if(stWaveData.dwWaveFormat == 0 && flag ==false)
                                    {
                                        audioTrack = new MyAudioTrack(8000, AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_16BIT);
                                        audioTrack.init();
                                        flag = true;
                                    }
                                    else if(stWaveData.dwWaveFormat == 1  && flag ==false)
                                    {
                                        audioTrack = new MyAudioTrack(16000, AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_16BIT);
                                        audioTrack.init();
                                        flag = true;
                                    }
                                    else if(stWaveData.dwWaveFormat == 6  && flag ==false)
                                    {
                                        audioTrack = new MyAudioTrack(48000, AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_16BIT);
                                        audioTrack.init();
                                        flag = true;
                                    }
                                    if( audioTrack != null && stWaveData.dwDataLen > 0)
                                    {
                                        audioTrack.playAudioTrack(stWaveData.pcData,0,stWaveData.dwDataLen);
                                    }
                                    WaveDataQue.remove();
                                }
                                else
                                {
                                    try {
                                        Thread.sleep(20);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }
                    }
            );
            myThread.start();
        }
    }
}