package com.sdk;

/**
 * Created by f06266 on 2019/8/7.
 */

public class NETDEV_VEH_ATTR_S {
    public int udwType;                                       /* 车辆类型 详见 NETDEV_VEHICLE_TYPE_E */
    public int udwColor;                                      /* 车身颜色 详见 NETDEV_PLATE_COLOR_E */
    public int udwSpeedUnit;                                  /* 车辆速度单位 0：公里/每小时 1：英里/每小时 */
    public float  fSpeedValue;                                /* 车辆速度 */
    public int udwSpeedType;                                  /* 结构化场景中的机动车车辆速度类型 详见 NETDEV_SPEED_TYPE_E */
    public String   szVehicleBrand;                           /* 车辆车标编码（自行编码) */
    public int udwImageDirection;                             /* 结构化场景中的机动车在画面坐标系中的行驶方向 详见 NETDEV_IMAGE_DIRECTION_E */

    public class NETDEV_VEHICLE_TYPE_E
    {
        public static final int NETDEV_VEHICLE_TYPE_TRICYCLE_E     = 0;                /* 三轮车 */
        public static final int NETDEV_VEHICLE_TYPE_MOTOR_BUS_E    = 1;                /* 大客车 */
        public static final int NETDEV_VEHICLE_TYPE_MIDDLE_E       = 2;                /* 中型车 */
        public static final int NETDEV_VEHICLE_TYPE_SMALL_E        = 3;                /* 小型车 */
        public static final int NETDEV_VEHICLE_TYPE_BIG_E          = 4;                /* 大型车 */
        public static final int NETDEV_VEHICLE_TYPE_TWOWHEELVEH    = 5;                /* 二轮车 */
        public static final int NETDEV_VEHICLE_TYPE_MOTORCYCLE_E   = 6;                /* 摩托车 */
        public static final int NETDEV_VEHICLE_TYPE_TRACTOR_E      = 7;                /* 拖拉机 */
        public static final int NETDEV_VEHICLE_TYPE_AGRICULTURAL_E = 8;                /* 农用货车 */
        public static final int NETDEV_VEHICLE_TYPE_SEADAN         = 9;                /* 轿车 */
        public static final int NETDEV_VEHICLE_TYPE_SUV_E          = 10;               /* SUV */
        public static final int NETDEV_VEHICLE_TYPE_VAN_E          = 11;               /* 面包车 */
        public static final int NETDEV_VEHICLE_TYPE_SMALLTRUCK_E   = 12;               /* 小货车 */
        public static final int NETDEV_VEHICLE_TYPE_MEDIUMCAR_E    = 13;               /* 中巴车/中型客车 */
        public static final int NETDEV_VEHICLE_TYPE_LARGEBUS_E     = 14;               /* 大客车/大型客车 */
        public static final int NETDEV_VEHICLE_TYPE_LARGETRUCK_E   = 15;               /* 大货车/大型货车 */
        public static final int NETDEV_VEHICLE_TYPE_PICKUPTRUCK_E  = 16;               /* 皮卡车 */
        public static final int NETDEV_VEHICLE_TYPE_BUSINESSVEH_E  = 17;               /* MPV 商务车 */
        public static final int NETDEV_VEHICLE_TYPE_SPORTSCAR_E    = 18;               /* 跑车 */
        public static final int NETDEV_VEHICLE_TYPE_MINICAR_E      = 19;               /* 微型轿车 */
        public static final int NETDEV_VEHICLE_TYPE_HATCHBACKCAR_E = 20;               /* 两厢轿车 */
        public static final int NETDEV_VEHICLE_TYPE_THREEBOX_E     = 21;               /* 三厢轿车 */
        public static final int NETDEV_VEHICLE_TYPE_LIGHTBUS_E     = 22;               /* 轻型客车 */
        public static final int NETDEV_VEHICLE_TYPE_MEDIUNTRUCK_E  = 23;               /* 中型货车 */
        public static final int NETDEV_VEHICLE_TYPE_TRAILER_E      = 24;               /* 挂车 */
        public static final int NETDEV_VEHICLE_TYPE_TANK_E         = 25;               /* 槽罐车 */
        public static final int NETDEV_VEHICLE_TYPE_WATERCAR_E     = 26;               /* 洒水车 */
        public static final int NETDEV_VEHICLE_TYPE_OTHER_E        = 998;              /* 其他 */
        public static final int NETDEV_VEHICLE_TYPE_UNKNOW_E       = 999;              /* 未知 */
        public static final int NETDEV_VEHICLE_TYPE_INVALID        = 0xFFFF;            /* 无效值  Invalid value */
    }

    public class NETDEV_PLATE_COLOR_E
    {
        public static final int NETDEV_PLATE_COLOR_BLACK_E           = 0;           /* 黑色 */
        public static final int NETDEV_PLATE_COLOR_WHITE_E           = 1;           /* 白色 */
        public static final int NETDEV_PLATE_COLOR_GRAY_E            = 2;           /* 灰色 */
        public static final int NETDEV_PLATE_COLOR_RED_E             = 3;           /* 红色 */
        public static final int NETDEV_PLATE_COLOR_BLUE_E            = 4;           /* 蓝色 */
        public static final int NETDEV_PLATE_COLOR_YELLOW_E          = 5;           /* 黄色 */
        public static final int NETDEV_PLATE_COLOR_ORANGE_E          = 6;           /* 橙色 */
        public static final int NETDEV_PLATE_COLOR_BROWN_E           = 7;           /* 棕色 */
        public static final int NETDEV_PLATE_COLOR_GREEN_E           = 8;           /* 绿色 */
        public static final int NETDEV_PLATE_COLOR_PURPLE_E          = 9;           /* 紫色 */
        public static final int NETDEV_PLATE_COLOR_CYAN_E            = 10;          /* 青色 */
        public static final int NETDEV_PLATE_COLOR_PINK_E            = 11;          /* 粉色 */
        public static final int NETDEV_PLATE_COLOR_TRANSPARENT_E     = 12;          /* 透明 */
        public static final int NETDEV_PLATE_COLOR_SILVERYWHITE_E    = 13;          /* 银白 */
        public static final int NETDEV_PLATE_COLOR_DARK_E            = 14;          /* 深色 */
        public static final int NETDEV_PLATE_COLOR_LIGHT_E           = 15;          /* 浅色 */
        public static final int NETDEV_PLATE_COLOR_COLOURLESS        = 16;          /* 无色 */
        public static final int NETDEV_PLATE_COLOR_YELLOWGREEN       = 17;          /* 黄绿双色 */
        public static final int NETDEV_PLATE_COLOR_GRADUALGREEN      = 18;          /* 渐变绿色 */
        public static final int NETDEV_PLATE_COLOR_OTHER_E           = 99;          /* 其他 */
        public static final int NETDEV_PLATE_COLOR_UNKNOW_E          = 100;         /* 未知 */
        public static final int NETDEV_PLATE_COLOR_INVALID           = 0xFF;         /* 无效值  Invalid value */
    }

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
}
