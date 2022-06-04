package com.sdk;

public class NETDEV_TRAFFIC_STATISTICS_INFO_S {
    public int   bIsSuccess;                                    /* 查询是否成功 */
    public int   dwChannelID;                                   /* 通道号 */
    public int   udwSize;                                       /* 时间段个数 */
    public int[] audwEnterCount;                                /* 进入人数统计 */
    public int[] audwExitCount;                                 /* 离开人数统计 */


    public NETDEV_TRAFFIC_STATISTICS_INFO_S() {
        audwEnterCount = new int[60];
        audwExitCount = new int[60];
    }
}
