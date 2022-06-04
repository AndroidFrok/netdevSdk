package com.sdk;

public class NETDEV_MULTI_TRAFFIC_STATISTICS_COND_S {
    public NETDEV_OPERATE_LIST_S    stChannelIDs;               /* 通道ID列表 */
    public int                     udwStatisticsType;          /* 参见 NETDEV_TRAFFIC_STATISTICS_TYPE_E */
    public int                     udwFormType;                /* 参见 NETDEV_TRAFFIC_STATIC_FORM_TYPE_E */
    public long                    tBeginTime;                 /* 起始时间 */
    public long                    tEndTime;                   /* 结束时间 */



    public NETDEV_MULTI_TRAFFIC_STATISTICS_COND_S() {
        stChannelIDs = new NETDEV_OPERATE_LIST_S();
    }

    public class NETDEV_TRAFFIC_STATISTICS_TYPE_E
    {
        public static final int NETDEV_TRAFFIC_STATISTICS_TYPE_IN   = 0;        /* 统计类型：进入 Statistics type : Enter */
        public static final int NETDEV_TRAFFIC_STATISTICS_TYPE_OUT  = 1;        /* 统计类型：离开 Statistics type : Exit */
        public static final int NETDEV_TRAFFIC_STATISTICS_TYPE_ALL  = 2;        /* 统计类型：所有 Statistics type : All */
        public static final int NETDEV_TRAFFIC_STATISTICS_TYPE_BUTT = 3;
    }

    public class NETDEV_TRAFFIC_STATIC_FORM_TYPE_E
    {
        public static final int NETDEV_TRAFFIC_STAT_FORM_BY_MINUTE = 0;                  /* 按分钟*/
        public static final int NETDEV_TRAFFIC_STAT_FORM_BY_HOUR = 1;                    /* 按小时*/
        public static final int NETDEV_TRAFFIC_STAT_FORM_BY_DAY = 2;                     /* 按天*/
        public static final int NETDEV_TRAFFIC_STAT_FORM_BY_MONTH = 3;                   /* 按月*/
        public static final int NETDEV_TRAFFIC_STAT_FORM_BY_BUTT = 4;
    }
}
