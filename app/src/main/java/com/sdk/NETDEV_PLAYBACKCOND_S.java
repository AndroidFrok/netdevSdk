package com.sdk;

public class NETDEV_PLAYBACKCOND_S {
    public int   	dwChannelID;                /* Playback channel */
    public long   	tBeginTime;                 /* Playback start time */
    public long   	tEndTime;                   /* Playback end time */
    public int   	dwLinkMode;                 /* Transport protocol, see enumeration #NETDEV_PROTOCAL_E */
    public int  	hPlayWnd;                   /* Play window handle */
    public int   	dwFileType;                 /* Recording storage type, see enumeration #NETDEV_PLAN_STORE_TYPE_E */
    public int   	dwDownloadSpeed;            /* NETDEV_E_DOWNLOAD_SPEED_E */
    public int      dwPlaySpeed;                /* Playback speed, see enumeration #NETDEV_VOD_PLAY_STATUS_E*/

    public class NETDEV_PROTOCAL_E
    {
        public static final int NETDEV_TRANSPROTOCAL_RTPUDP     = 0;    /* UDP */
        public static final int NETDEV_TRANSPROTOCAL_RTPTCP     = 1;    /* TCP */
    }

    public class NETDEV_PLAN_STORE_TYPE_E
    {
        public static final int NETDEV_TYPE_STORE_TYPE_ALL                  = 0;            /* 常规存储  All */

        public static final int NETDEV_EVENT_STORE_TYPE_MOTIONDETECTION     = 4;            /* 运动检测事件存储  Motion detection */
        public static final int NETDEV_EVENT_STORE_TYPE_DIGITALINPUT        = 5;            /* 数字输入事件存储  Digital input */
        public static final int NETDEV_EVENT_STORE_TYPE_VIDEOLOSS           = 7;            /* 视频丢失事件存储  Video loss */

        public static final int NETDEV_TYPE_STORE_TYPE_INVALID              = 0xFF;          /* 无效值  Invalid value */
    }

    public class NETDEV_E_DOWNLOAD_SPEED_E
    {
        public static final int NETDEV_DOWNLOAD_SPEED_ONE           = 0;            /* 一倍速 */
        public static final int NETDEV_DOWNLOAD_SPEED_TWO           = 1;            /* 二倍速 */
        public static final int NETDEV_DOWNLOAD_SPEED_FOUR          = 2;            /* 四倍速 */
        public static final int NETDEV_DOWNLOAD_SPEED_EIGHT         = 3;            /* 八倍速 */
        public static final int NETDEV_DOWNLOAD_SPEED_TWO_IFRAME    = 4;            /* 二倍速I帧 */
        public static final int NETDEV_DOWNLOAD_SPEED_FOUR_IFRAME   = 5;            /* 四倍速I帧 */
        public static final int NETDEV_DOWNLOAD_SPEED_EIGHT_IFRAME  = 6;            /* 八倍速I帧 */
        public static final int NETDEV_DOWNLOAD_SPEED_HALF          = 7;            /* 1/2倍速  1/2x */
        public static final int NETDEV_DOWNLOAD_SPEED_FORTY         = 8;            /* 40倍速 40x */

        public static final int NETDEV_DOWNLOAD_SPEED_INVALID       = 0xFF;          /* 无效值 */
    }

    public class NETDEV_VOD_PLAY_STATUS_E
    {
        /** 播放状态  Play status */
        public static final int NETDEV_PLAY_STATUS_16_BACKWARD          = 0;            /* 16倍速后退播放  Backward at 16x speed */
        public static final int NETDEV_PLAY_STATUS_8_BACKWARD           = 1;            /* 8倍速后退播放  Backward at 8x speed */
        public static final int NETDEV_PLAY_STATUS_4_BACKWARD           = 2;            /* 4倍速后退播放  Backward at 4x speed */
        public static final int NETDEV_PLAY_STATUS_2_BACKWARD           = 3;            /* 2倍速后退播放  Backward at 2x speed */
        public static final int NETDEV_PLAY_STATUS_1_BACKWARD           = 4;            /* 正常速度后退播放  Backward at normal speed */
        public static final int NETDEV_PLAY_STATUS_HALF_BACKWARD        = 5;            /* 1/2倍速后退播放  Backward at 1/2 speed */
        public static final int NETDEV_PLAY_STATUS_QUARTER_BACKWARD     = 6;            /* 1/4倍速后退播放  Backward at 1/4 speed */
        public static final int NETDEV_PLAY_STATUS_QUARTER_FORWARD      = 7;            /* 1/4倍速播放  Play at 1/4 speed */
        public static final int NETDEV_PLAY_STATUS_HALF_FORWARD         = 8;            /* 1/2倍速播放  Play at 1/2 speed */
        public static final int NETDEV_PLAY_STATUS_1_FORWARD            = 9;            /* 正常速度前进播放  Forward at normal speed */
        public static final int NETDEV_PLAY_STATUS_2_FORWARD            = 10;           /* 2倍速前进播放  Forward at 2x speed */
        public static final int NETDEV_PLAY_STATUS_4_FORWARD            = 11;           /* 4倍速前进播放  Forward at 4x speed */
        public static final int NETDEV_PLAY_STATUS_8_FORWARD            = 12;           /* 8倍速前进播放  Forward at 8x speed */
        public static final int NETDEV_PLAY_STATUS_16_FORWARD           = 13;           /* 16倍速前进播放  Forward at 16x speed */
        public static final int NETDEV_PLAY_STATUS_2_FORWARD_IFRAME     = 14;           /* 2倍速前进播放(I帧) Forward at 2x speed(I frame) */
        public static final int NETDEV_PLAY_STATUS_4_FORWARD_IFRAME     = 15;           /* 4倍速前进播放(I帧) Forward at 4x speed(I frame) */
        public static final int NETDEV_PLAY_STATUS_8_FORWARD_IFRAME     = 16;           /* 8倍速前进播放(I帧) Forward at 8x speed(I frame) */
        public static final int NETDEV_PLAY_STATUS_16_FORWARD_IFRAME    = 17;           /* 16倍速前进播放(I帧) Forward at 16x speed(I frame) */
        public static final int NETDEV_PLAY_STATUS_2_BACKWARD_IFRAME    = 18;           /* 2倍速后退播放(I帧) Backward at 2x speed(I frame) */
        public static final int NETDEV_PLAY_STATUS_4_BACKWARD_IFRAME    = 19;           /* 4倍速后退播放(I帧) Backward at 4x speed(I frame) */
        public static final int NETDEV_PLAY_STATUS_8_BACKWARD_IFRAME    = 20;           /* 8倍速后退播放(I帧) Backward at 8x speed(I frame) */
        public static final int NETDEV_PLAY_STATUS_16_BACKWARD_IFRAME   = 21;           /* 16倍速后退播放(I帧) Backward at 16x speed(I frame) */
        public static final int NETDEV_PLAY_STATUS_INTELLIGENT_FORWARD  = 22;           /* 智能播放 Intelligent forward */
        public static final int NETDEV_PLAY_STATUS_1_FRAME_FORWD        = 23;           /* 单帧前进播放  Forward at 1 frame speed */
        public static final int NETDEV_PLAY_STATUS_1_FRAME_BACK         = 24;           /* 单帧后退播放 Backward at 1 frame speed */

        public static final int NETDEV_PLAY_STATUS_40_FORWARD           = 25;           /* 40倍速前进播放 Forward at 40x speed*/

        public static final int NETDEV_PLAY_STATUS_32_FORWARD_IFRAME    = 26;           /* 32倍速抽帧前进播放 Forward at 32x speed(I frame)*/
        public static final int NETDEV_PLAY_STATUS_32_BACKWARD_IFRAME   = 27;           /* 32倍速抽帧后退播放 Backward at 32x speed(I frame)*/
        public static final int NETDEV_PLAY_STATUS_64_FORWARD_IFRAME    = 28;           /* 64倍速抽帧前进播放 Forward at 64x speed(I frame)*/
        public static final int NETDEV_PLAY_STATUS_64_BACKWARD_IFRAME   = 29;           /* 64倍速抽帧后退播放 Backward at 64x speed(I frame)*/
        public static final int NETDEV_PLAY_STATUS_128_FORWARD_IFRAME   = 30;           /* 128倍速抽帧前进播放 Forward at 128x speed(I frame)*/
        public static final int NETDEV_PLAY_STATUS_128_BACKWARD_IFRAME  = 31;           /* 128倍速抽帧后退播放 Backward at 128x speed(I frame)*/
        public static final int NETDEV_PLAY_STATUS_256_FORWARD_IFRAME   = 32;           /* 256倍速抽帧前进播放 Forward at 256x speed(I frame)*/
        public static final int NETDEV_PLAY_STATUS_256_BACKWARD_IFRAME  = 33;           /* 256倍速抽帧后退播放 Backward at 256x speed(I frame)*/

        public static final int NETDEV_PLAY_STATUS_32_FORWARD           = 34;           /* 32倍速前进播放 */
        public static final int NETDEV_PLAY_STATUS_32_BACKWARD          = 35;           /* 32倍速后退播放 */
    }
}
