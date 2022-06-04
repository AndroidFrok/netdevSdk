package com.sdk;

/**
 * Created by f06266 on 2019/8/1.
 */

public class NETDEV_DEV_CHN_ENCODE_INFO_S {
    public NETDEV_DEV_CHN_BASE_INFO_S  stChnBaseInfo;  /* 通道基本信息 */
    public int                         dwMaxStream;    /* 支持的最大流个数 */
    public int                         bSupportPTZ;    /* 是否支持云台 */
    public int                         dwAudioResID;   /* 音频资源ID */

    public NETDEV_DEV_CHN_ENCODE_INFO_S() {
        stChnBaseInfo = new NETDEV_DEV_CHN_BASE_INFO_S();
    }
}
