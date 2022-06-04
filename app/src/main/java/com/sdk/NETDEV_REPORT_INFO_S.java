package com.sdk;

/**
 * Created by f06266 on 2019/8/21.
 */

public class NETDEV_REPORT_INFO_S {
    public int                         dwReportType;       /* 上报类型，参见枚举#NETDEV_REPORT_TYPE_E */
    public NETDEV_ALARM_INFO_V30_S     stAlarmInfo;        /* 告警信息，当dwReportType为NETDEV_REPORT_TYPE_ALARM时有效 */
    public NETDEV_EVENT_INFO_S         stEventInfo;        /* 事件信息，当dwReportType为NETDEV_REPORT_TYPE_EVENT时有效 */

    public NETDEV_REPORT_INFO_S() {
        stAlarmInfo = new NETDEV_ALARM_INFO_V30_S();
        stEventInfo = new NETDEV_EVENT_INFO_S();
    }

    public class NETDEV_GENDER_TYPE_E
    {
        public static final int NETDEV_REPORT_TYPE_ALARM            = 0;                /* 上报类型：告警 */
        public static final int NETDEV_REPORT_TYPE_EVENT            = 1;                /* 上报类型：事件 */

        public static final int NETDEV_REPORT_TYPE_INVALID          = 0xFF;              /* 无效值 */
    }
}
