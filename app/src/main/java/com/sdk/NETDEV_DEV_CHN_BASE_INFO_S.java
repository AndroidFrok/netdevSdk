package com.sdk;

/**
 * Created by f06266 on 2019/8/1.
 */

public class NETDEV_DEV_CHN_BASE_INFO_S {
    public int dwChannelID;                                      /* 通道ID */
    public int dwDevID;                                          /* 设备ID */
    public int dwOrgID;                                          /* 组织ID */
    public int dwChnType;                                        /* 通道类型，参见 NETDEV_CHN_TYPE_E */
    public int dwChnStatus;                                      /* 通道状态, 参见 NETDEV_CHN_STATUS_E */
    public int dwChnIndex;                                       /* 通道索引 */
    public String szChnName;                                     /* 通道名称 */
    public int udwRight;                                         /* 通道权限 */

    public class NETDEV_CHN_TYPE_E
    {
        public static final int NETDEV_CHN_TYPE_ENCODE              = 0;                /* 编码通道, 通道状态参见NETDEV_CHN_STATUS_E */
        public static final int NETDEV_CHN_TYPE_ALARMIN             = 1;                /* 告警输入通道, 通道状态参见NETDEV_ALARM_RUNMODE_E */
        public static final int NETDEV_CHN_TYPE_ALARMOUT            = 2;                /* 告警输出通道, 通道状态参见NETDEV_ALARMOUT_CHN_STATUS_E */
        public static final int NETDEV_CHN_TYPE_DECODE              = 3;                /* 解码通道 */
        public static final int NETDEV_CHN_TYPE_AUDIO               = 4;                /* 音频通道 */
        public static final int NETDEV_CHN_TYPE_NIC                 = 5;                /* 网卡通道 */
        public static final int NETDEV_CHN_TYPE_ALARMPOINT          = 6;                /* 报警点 */
        public static final int NETDEV_CHN_TYPE_DOOR                = 7;                /* 门 */
        public static final int NETDEV_CHN_TYPE_ADU_ENCODE          = 8;                /* ADU本地编码通道, 通道状态参见NETDEV_CHN_STATUS_E 获取详细信息见#NETDEV_DEV_CHN_XW_ENCODE_INFO_S */
        public static final int NETDEV_CHN_TYPE_EMERGENCY           = 9;                /* 紧急铃通道 */

        public static final int NETDEV_CHN_TYPE_INVALID             = 0xFF;              /* 无效值 */
    }

    public class NETDEV_CHN_STATUS_E
    {
        public static final int NETDEV_CHN_STATUS_OFFLINE          = 0;                /* 离线 offline */
        public static final int NETDEV_CHN_STATUS_ONLINE           = 1;                /* 在线 online */
        public static final int NETDEV_CHN_STATUS_VIDEO_LOSE       = 2;                /* 视频丢失 video lose */

        public static final int NETDEV_CHN_STATUS_INVALID       = 0xFF;
    }
}
