package com.sdk;

public class NETDEV_TIME_CFG_S {
    public int dwTimeZone;              /*   Time zone,See NETDEV_TIME_ZONE_E */
    public NETDEV_TIME_S stTime;        /* 时间  Time */
    public int  bEnableDST;             /* 夏令时使能 DST enable */
    public NETDEV_TIME_DST_CFG_S  stTimeDSTCfg;           /* 夏令时配置 DST time config*/
    public int udwDateFormat;           /* 日期格式 0：YYYY-MM-DD 年月日 1：MM-DD-YYYY 月日年 2：DD-MM-YYYY 日月年*/
    public int udwHourFormat;           /* 时间格式 0 ：12小时制  1:24 小时制*/
}
