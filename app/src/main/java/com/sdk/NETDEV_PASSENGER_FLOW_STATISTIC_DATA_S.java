package com.sdk;

public class NETDEV_PASSENGER_FLOW_STATISTIC_DATA_S {
    public int   dwChannelID;            /* 通道号 Channel ID */
    public long  tReportTime;            /* 上报时间（unix时间戳） Report time */
    public int   tInterval;              /* 间隔时间 Interval time */
    public int   dwEnterNum;             /* 进入人数 Enter num */
    public int   dwExitNum;              /* 离开人数 Exit num */
    public int   dwTotalEnterNum;        /* 所有进入人数 Total enter num */
    public int   dwTotalExitNum;         /* 所有离开人数 Total exit num */

    @Override
    public String toString() {
        return "NETDEV_PASSENGER_FLOW_STATISTIC_DATA_S{" +
                "dwChannelID=" + dwChannelID +
                ", tReportTime=" + tReportTime +
                ", tInterval=" + tInterval +
                ", dwEnterNum=" + dwEnterNum +
                ", dwExitNum=" + dwExitNum +
                ", dwTotalEnterNum=" + dwTotalEnterNum +
                ", dwTotalExitNum=" + dwTotalExitNum +
                '}';
    }
}
