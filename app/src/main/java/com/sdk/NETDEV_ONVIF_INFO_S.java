package com.sdk;

/**
 * Created by f06266 on 2019/8/1.
 */

public class NETDEV_ONVIF_INFO_S {
    public int udwTransportMode;                          /* 传输模式，参见枚举NETDEV_TRANS_PROTOCOL_E */

    public class NETDEV_TRANS_PROTOCOL_E
    {
        public static final int NETDEV_TRANS_PROTOCOL_TCP = 0;              /* TCP */
        public static final int NETDEV_TRANS_PROTOCOL_UDP = 1;              /* UDP */
    }
}
