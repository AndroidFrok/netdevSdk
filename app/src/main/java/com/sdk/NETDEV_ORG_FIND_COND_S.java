package com.sdk;

/**
 * Created by f06266 on 2019/8/1.
 */

public class NETDEV_ORG_FIND_COND_S {
    public int                           udwOrgType;              /* 组织类型 参见NETDEV_ORG_TYPE_E */
    public int                           udwRootOrgID;            /* 根节点组织ID */
    public int                           udwFindType;             /* 查找模式，参见NETDEV_ORG_FIND_MODE_E */

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

    public class NETDEV_ORG_FIND_MODE_E
    {
        public static final int NETDEV_ORG_FIND_MODE_ID          = 0;            /* 组织ID */
        public static final int NETDEV_ORG_FIND_MODE_TYPE        = 1;            /* 组织类型 */

        public static final int NETDEV_ORG_FIND_MODE_INVALID            = 0XFF;       /* 无效值 */
    }
}
