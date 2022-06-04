package com.sdk;

public class NETDEV_TIME_DST_CFG_S {
    public NETDEV_TIME_DST_S   stBeginTime;        /* 夏令时开始时间 */
    public NETDEV_TIME_DST_S   stEndTime;          /* 夏令时结束时间 */
    public int  dwOffsetTime;       /* 夏令时节约时间 参见枚举# NETDEV_DST_OFFSET_TIME  DST saving time see enumeration NETDEV_DST_OFFSET_TIME */
}
