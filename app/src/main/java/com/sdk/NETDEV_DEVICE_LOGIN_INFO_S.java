package com.sdk;

/**
 * Created by f06266 on 2019/8/1.
 */

public class NETDEV_DEVICE_LOGIN_INFO_S {
    public String szIPAddr;                       /* IP地址/域名 */
    public int dwPort;                            /* 端口号 */
    public String szUserName;                     /* 用户名 */
    public String szPassword;                     /* 密码 */
    public int dwLoginProto;                      /* 登录协议, 参见NETDEV_LOGIN_PROTO_E */
    public int dwDeviceType;                      /* 设备类型, 参见NETDEV_DEVICE_TYPE_E */

    public class NETDEV_LOGIN_PROTO_E
    {
        public static final int NETDEV_LOGIN_PROTO_ONVIF             = 0;           /* 以ONVIF协议接入 */
        public static final int NETDEV_LOGIN_PROTO_PRIVATE           = 1;            /* 以私有协议接入 */
    }

    public class NETDEV_DEVICE_TYPE_E
    {
        public static final int NETDEV_DTYPE_UNKNOWN                        = 0;            /* Unknown type */
        public static final int NETDEV_DTYPE_IPC                            = 1;            /* IPC range */
        public static final int NETDEV_DTYPE_IPC_FISHEYE                    = 2;            /* 非经济型鱼眼IPC Certain fisheye camera models*/
        public static final int NETDEV_DTYPE_IPC_ECONOMIC_FISHEYE           = 3;            /* 经济型鱼眼IPC Certain fisheye camera models*/
        public static final int NETDEV_DTYPE_NVR                            = 101;          /* NVR range */
        public static final int NETDEV_DTYPE_NVR_BACKUP                     = 102;          /* NVR备份服务器  NVR back up */
        public static final int NETDEV_DTYPE_HNVR                           = 103;          /* 混合NVR */
        public static final int NETDEV_DTYPE_DC                             = 201;          /* DC range */
        public static final int NETDEV_DTYPE_DC_ADU                         = 202;          /* ADU range */
        public static final int NETDEV_DTYPE_EC                             = 301;          /* EC range */
        public static final int NETDEV_DTYPE_VMS                            = 501;          /* VMS range */
        public static final int NETDEV_DTYPE_FG                             = 601;          /* FG range */
        public static final int NETDEV_DTYPE_INVALID                        = 0xFFFF;        /* 无效值  Invalid value */
    }
}
