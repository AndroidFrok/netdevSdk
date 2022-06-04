package com.sdk;

/**
 * Created by f06266 on 2019/8/1.
 */

public class NETDEV_ORG_INFO_S {
    public int dwOrgID;                              /* 组织ID */
    public int dwParentID;                           /* 组织父节点ID */
    public int dwType;                               /* 类型 参见 NETDEV_ORG_TYPE_E */
    public String szNodeName;                        /* 节点名称 */
    public String  szDesc;                           /* 备注 */

    public class NETDEV_ORG_TYPE_E
    {
        public static final int NETDEV_ORG_TYPE_GENERAL            = 0;            /* 普通组织 */
        public static final int NETDEV_ORG_TYPE_CLOUD              = 1;            /* 云端组织 */
        public static final int NETDEV_ORG_TYPE_VIRTUAL            = 2;            /* 逻辑组织 */
        public static final int NETDEV_ORG_TYPE_FAVORITES          = 3;            /* 收藏夹 */
        public static final int NETDEV_ORG_TYPE_DOMAIN             = 4;            /* 域名组织 */
        public static final int NETDEV_ORG_TYPE_DOORGROUP          = 5;            /* 门组 */
        public static final int NETDEV_ORG_TYPE_DEPT               = 6;            /* 部门组织 */

        public static final int NETDEV_ORG_TYPE_INVALID            = 0XFF;          /* 无效值 */
    }
}
