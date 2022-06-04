package com.sdk;

/**
 * Created by f06266 on 2019/8/6.
 */

public class NETDEV_NO_MOTOR_VEH_ATTR_S {
    public int udwSpeedType;                                  /* 结构化场景中非机动车速度类型 详见 NETDEV_SPEED_TYPE_E */
    public int udwImageDirection;                             /* 结构化场景中非机动车相对画面运动方向 详见 NETDEV_IMAGE_DIRECTION_E */
    public int udwNonVehicleType ;                            /* 非机动车类型 详见 NETDEV_NON_VEH_TYPE_E */

    public class NETDEV_SPEED_TYPE_E
    {
        public static final int NETDEV_SPEED_TYPE_UNKNOW                             = 0;                   /* 未知 */
        public static final int NETDEV_SPEED_TYPE_STATIC                             = 1;                   /* 静止 */
        public static final int NETDEV_SPEED_TYPE_SLOW                               = 2;                   /* 慢速 */
        public static final int NETDEV_SPEED_TYPE_MEDIUM                             = 3;                   /* 中速 */
        public static final int NETDEV_SPEED_TYPE_FAST                               = 4;                   /* 快速 */
        public static final int NETDEV_SPEED_TYPE_INVALID                            = 0xFF;                 /* 无效值 */
    }

    public class NETDEV_IMAGE_DIRECTION_E
    {
        public static final int NETDEV_IMAGE_DIRECTION_UNKNOW                        = 0;                   /* 未知 */
        public static final int NETDEV_IMAGE_DIRECTION_STATIC                        = 1;                   /* 静止 */
        public static final int NETDEV_IMAGE_DIRECTION_UP                            = 2;                   /* 向上 */
        public static final int NETDEV_IMAGE_DIRECTION_DOWN                          = 3;                   /* 向下 */
        public static final int NETDEV_IMAGE_DIRECTION_LEFT                          = 4;                   /* 向左 */
        public static final int NETDEV_IMAGE_DIRECTION_RIGHT                         = 5;                   /* 向右 */
        public static final int NETDEV_IMAGE_DIRECTION_LEFTUP                        = 6;                   /* 左上 */
        public static final int NETDEV_IMAGE_DIRECTION_LEFTDOWN                      = 7;                   /* 左下 */
        public static final int NETDEV_IMAGE_DIRECTION_RIGHTUP                       = 8;                   /* 右上 */
        public static final int NETDEV_IMAGE_DIRECTION_RIGHTDOWN                     = 9;                   /* 右下 */
        public static final int NETDEV_IMAGE_DIRECTION_INVALID                       = 0xFF;                 /* 无效值 */
    }

    public class NETDEV_NON_VEH_TYPE_E
    {
        public static final int NETDEV_NON_VEH_TYPE_UNKNOW                           = 0;                   /* 未知 */
        public static final int NETDEV_NON_VEH_TYPE_BICYCLE                          = 1;                   /* 人力自行车 */
        public static final int NETDEV_NON_VEH_TYPE_TRIYCLE                          = 2;                   /* 三轮车 */
        public static final int NETDEV_NON_VEH_TYPE_MOTORCYCLE                       = 3;                   /* 摩托车 */
        public static final int NETDEV_NON_VEH_TYPE_ELECTRIC_BICYCLE                 = 4;                   /* 电动自行车 */
        public static final int NETDEV_NON_VEH_TYPE_TWOWHEEL_VEHICLE                 = 5;                   /* 二轮车（摩托车/人力自行车/电动自行车) */
        public static final int NETDEV_NON_VEH_TYPE_INVALID                          = 0xFF;                 /* 无效值 */
    }
}
