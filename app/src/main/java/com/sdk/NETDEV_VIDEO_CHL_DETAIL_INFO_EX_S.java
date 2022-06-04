package com.sdk;

/**
 * Created by f06266 on 2019/8/1.
 */

public class NETDEV_VIDEO_CHL_DETAIL_INFO_EX_S {
    public int                         dwChannelID;                        /* 通道ID  Channel ID */
    public int                         bPtzSupported;                      /* 是否支持云台 Whether ptz is supported */
    public int                         enStatus;                           /* 通道状态  Channel status NETDEV_CHANNEL_STATUS_E */
    public int                         dwStreamNum;                        /* 流个数  Number of streams 当enStatus为NETDEV_CHL_STATUS_UNBIND时，此值无效*/
    public int                         enChannelType;                      /* 通道类型，(note: 该字段仅对混合NVR有效) */
    public int                         enVideoFormat;                      /* 视频输入制式，当ChannelType为NETDEV_CHL_TYPE_DIGITAL时，此值无效 (note: 该字段仅对混合NVR有效) */
    public int                         enAddressType;                      /* IP地址类型 */
    public String                      szIPAddr;                           /* IP地址 IP address*/
    public int                         dwPort;                             /* 端口号 */
    public String                      szChnName;                          /* 通道名称 Channel Name */
    public int                         allowDistribution;                  /* 是否允许流分发*/
    public int                         dwDeviceType;                       /* 通道接入的设备类型，参见枚举NETDEV_CHANNEL_CAMERA_TYPE_E. Channel device Type see#NETDEV_CHANNEL_CAMERA_TYPE_E */
    public String                      szManufacturer;                     /* 厂商，范围[0,31] */
    public String                      szDeviceModel;                      /* 设备型号，范围[0,31]  */

    public class NETDEV_CHANNEL_CAMERA_TYPE_E
    {
        public static final int NETDEV_CHL_CAMERA_TYPE_FIXED        = 0;        /* 固定摄像机  fixed camera */
        public static final int NETDEV_CHL_CAMERA_TYPE_PTZ          = 1;        /* 云台摄像机  PTZ camera */
        public static final int NETDEV_CHL_CAMERA_TYPE_FISH_EYE     = 2;        /* 鱼眼相机（鱼眼镜头+自身矫正功能）fish-eye camera */
        public static final int NETDEV_CHL_CAMERA_TYPE_WIDE_ANGLE   = 3;        /* 超广角相机（包含鱼眼镜头、大视角的镜头的相机  但是不具备自身矫正功能）wide-Angle camera*/

        public static final int NETDEV_CHL_CAMERA_TYPE_INVALID      = 0xff;
    }

    public class NETDEV_CHANNEL_STATUS_E
    {
        public static final int NETDEV_CHL_STATUS_OFFLINE   = 0;            /* 通道离线  Channel offline */
        public static final int NETDEV_CHL_STATUS_ONLINE    = 1;             /* 通道在线  Channel online */
        public static final int NETDEV_CHL_STATUS_UNBIND    = 2;             /* 通道空闲  Channel unbind */
        public static final int NETDEV_CHL_STATUS_INVALID   = 0xff;
    }
}
