package com.sdk;

public class NETDEV_WAVE_DATA_S {
    public byte[]  pcData = new byte[5000];                      /* 音频数据指针  Audio data pointer */
    public int dwDataLen;                    /* 音频数据长度  Audio data length */
    public int dwWaveFormat;                 /* 解码后音频格式  Format of decoded audio*/
}
