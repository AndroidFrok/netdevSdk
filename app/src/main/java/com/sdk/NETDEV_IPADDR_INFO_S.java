package com.sdk;

/**
 * Created by f06266 on 2019/8/1.
 */

public class NETDEV_IPADDR_INFO_S {
    public int dwType;                            /* 地址类型，参见枚举NETDEV_IP_ADDRESS_TYPE_E */
    public String szIPAddr;                       /* IP地址/域名 */
    public int dwPort;                            /* 端口号 */

    public class NETDEV_IP_ADDRESS_TYPE_E
    {
        public static final int NETDEV_IP_TYPE_IPV4 = 0;          /* IPV4 */
        public static final int NETDEV_IP_TYPE_IPV6 = 1;          /* IPV6 */
        public static final int NETDEV_IP_TYPE_DOMAIN = 2;        /* 域名 */
        public static final int NETDEV_IP_TYPE_IPV4_AND_IPV6 = 3; /* IPV4和IPV6 */
    }
}
