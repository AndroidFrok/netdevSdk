package com.sdk;

/**
 * Created by f06266 on 2019/8/1.
 */

public class NETDEV_CLOUD_DEV_LOGIN_INFO_S {
    public String szDeviceName;        /* 设备名称 Device name */
    public String szDevicePassword;    /* 设备登录密码 (可选) Device login password (optional) */
    public int dwT2UTimeout;          /* P2P超时时间, 默认为15s P2P timeout (default: 15s) */
    public int dwConnectMode;        /* 连接模式 Connect Mode  参见枚举NETDEV_CLOUD_CONNECT_MODE  传NETDEV_CLOUD_CONNECT_MODE_ALL时无法准确获取最终登陆成的模式时打洞还是转发*/
    public int dwLoginProto;      	/* 登录协议, 参见NETDEV_LOGIN_PROTO_E */

    public class NETDEV_CLOUD_CONNECT_MODE_E
    {
        public static final int NETDEV_CLOUD_CONNECT_MODE_ALL       = 0;         /* 本地直连->广域网直连->打洞->转发 */
        public static final int NETDEV_CLOUD_CONNECT_MODE_P2P_TURN  = 1;         /* 本地直连->广域网直连->打洞+转发(转发延迟500ms) */
        public static final int NETDEV_CLOUD_CONNECT_MODE_P2P       = 2;         /* 直接打洞 */
        public static final int NETDEV_CLOUD_CONNECT_MODE_TURN      = 3;         /* 直接转发 */
    }

    public class NETDEV_LOGIN_PROTO_E
    {
        public static final int NETDEV_LOGIN_PROTO_ONVIF             = 0;           /* 以ONVIF协议接入 */
        public static final int NETDEV_LOGIN_PROTO_PRIVATE           = 1;            /* 以私有协议接入 */
    }
}
