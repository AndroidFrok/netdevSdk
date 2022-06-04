package com.sdk;

/**
 * Created by f06266 on 2019/8/1.
 */

public class NETDEV_DEV_BASIC_INFO_S {
    public NETDEV_IPADDR_INFO_S stDevAddr;                         /* 设备IP地址信息 */
    public NETDEV_USER_SIMPLE_INFO_S stDevUserInfo;                /* 设备用户名、密码 */
    public String szDevName;                                       /* 设备名称 */
    public String szDevDesc;                                       /* 设备描述 */
    public String szDevModel;                                      /* 设备型号 */
    public int dwDevID;                                            /* 设备ID */
    public int dwDevStatus;                                        /* 设备状态, 参考# NETDEV_DEVICE_STATUS_E */
    public int dwDevType;                                          /* 设备类型，参考# NETDEV_DEVICE_MAIN_TYPE_E */
    public int dwDevSubType;                                       /* 设备子类型，参考# NETDEV_DEVICE_SUB_TYPE_E */
    public int dwOrgID;                                            /* 组织编号 */
    public int dwAccessProtocol;                                   /* 接入协议 */
    public int dwAccessMode;                                       /* 接入方式 参考# NETDEV_DEVICE_ACCESS_MODE_E*/
    public int dwServerID;                                         /* 所属服务器ID */
    public int dwAudioResID;                                       /* 音频通道ID */
    public String  szVIIDCode;                                     /* 视图库编码,仅卡口设备时有效 */
    public int dwVIIDStatus;                                       /* 视图库状态，用来标识当前设备是否已通过视图库协议连接，0：离线 1：在线 */
    public String szSerialNum;                                     /* 设备序列号*/
    public String szSoftVersion;                                   /* 软件版本号*/
    public String szMacAddr;                                       /* MAC地址*/
    public int dwStoreStatus;                                      /* 设备存储状态。0: 空闲 1: 未格式化 2: 格式化中3: 运行中*/
    public NETDEV_ONVIF_INFO_S stOnvifInfo;                        /* onvif信息 */
    public NETDEV_GBINFO_S stGBInfo;                               /* 国标信息 当AccessProtocol值为3时该节点必选，其他可选*/

    public NETDEV_DEV_BASIC_INFO_S() {
        stDevAddr = new NETDEV_IPADDR_INFO_S();
        stDevUserInfo = new NETDEV_USER_SIMPLE_INFO_S();
        stOnvifInfo = new NETDEV_ONVIF_INFO_S();
        stGBInfo = new NETDEV_GBINFO_S();
    }

    public class NETDEV_DEVICE_STATUS_E
    {
        public static final int NETDEV_DEV_STATUS_OFFLINE                   = 0;                /* 离线 */
        public static final int NETDEV_DEV_STATUS_ONLINE                    = 1;                /* 在线 */
        public static final int NETDEV_DEV_STATUS_CONNECTING                = 2;                /* 连接中 */
        public static final int NETDEV_DEV_STATUS_PWD_ERROR                 = 3;                /* 用户名或密码错误 */
        public static final int NETDEV_DEV_STATUS_NOT_SUPPORT               = 4;                /* 设备不支持 */
        public static final int NETDEV_DEV_STATUS_TIMEOUT                   = 5;                /* 设备连接超时 */
        public static final int NETDEV_DEV_STATUS_WEAK_PWD_ERROR            = 6;                /* 远程用户弱密码错误 */
        public static final int NETDEV_DEV_STATUS_NO_DYNAMIC_PWD            = 7;                /* 设备不支持动态密码 */

        public static final int NETDEV_DEV_STATUS_INVALID                   = 0XFF;              /* 无效值 */
    }

    public class NETDEV_DEVICE_MAIN_TYPE_E
    {
        public static final int NETDEV_DTYPE_MAIN_ENCODE            = 0;                /* 编码设备 */
        public static final int NETDEV_DTYPE_MAIN_DECODE            = 1;                /* 解码设备 */
        public static final int NETDEV_DTYPE_MAIN_VMS               = 2;                /* 一体机设备 */
        public static final int NETDEV_DTYPE_MAIN_DA                = 3;                /* 代理设备 */
        public static final int NETDEV_DTYPE_MAIN_CLOUD             = 4;                /* 云端编码设备  */
        public static final int NETDEV_DTYPE_MAIN_BAYONET           = 5;                /* 卡口设备 */
        public static final int NETDEV_DTYPE_MAIN_ACS               = 6;                /* 门禁主机设备 */
        public static final int NETDEV_DTYPE_MAIN_ALARMHOST         = 7;                /* 报警主机设备 */

        public static final int NETDEV_DTYPE_MAIN_UNKNOWN           = 0XFF;              /* 未知设备 */
    }

    public class NETDEV_DEVICE_SUB_TYPE_E
    {
        public static final int NETDEV_DTYPE_SUB_NVR                = 0;                /* NVR */
        public static final int NETDEV_DTYPE_SUB_IPC                = 1;                /* IPC */
        public static final int NETDEV_DTYPE_SUB_DC_INNER           = 2;                /* 内置DC */
        public static final int NETDEV_DTYPE_SUB_DC_EXT             = 3;                /* 外置DC */
        public static final int NETDEV_DTYPE_SUB_EC                 = 4;                /* EC */
        public static final int NETDEV_DTYPE_SUB_VMS                = 5;                /* 一体机 */
        public static final int NETDEV_DTYPE_SUB_DA                 = 6;                /* 代理设备 */
        public static final int NETDEV_DTYPE_SUB_ADU                = 7;                /* ADU拼控设备 */
        public static final int NETDEV_DTYPE_SUB_FISHEYE_IPC        = 8;                /* 鱼眼设备 */
        public static final int NETDEV_DTYPE_SUB_DECARD             = 9;                /* 解码卡设备 */
        public static final int NETDEV_DTYPE_SUB_FACE_IPC           = 10;               /* 人脸识别相机 */
        public static final int NETDEV_DTYPE_SUB_ALARMHOST          = 11;               /* 报警主机设备 */
        public static final int NETDEV_DTYPE_SUB_ACS                = 12;               /* 门禁主机设备 */

        public static final int NETDEV_DTYPE_SUB_UNKNOW             = 0xFF;              /* 未知设备 */
    }

    public class NETDEV_DEVICE_ACCESS_MODE_E
    {
        public static final int NETDEV_DEV_ACCESS_MODE_IP_DOMAIN            = 0;                /* IP、域名接入 */
        public static final int NETDEV_DEV_ACCESS_MODE_P2P                  = 1;                /* P2P接入 */
        public static final int NETDEV_DEV_ACCESS_MODE_UNP                  = 2;                /* UNP接入 */

        public static final int NETDEV_DEV_ACCESS_MODE_INVALID              = 0XFF;              /* 无效值 */
    }
}
