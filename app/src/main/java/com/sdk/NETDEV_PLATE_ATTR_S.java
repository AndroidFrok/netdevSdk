package com.sdk;

/**
 * Created by f06266 on 2019/8/7.
 */

public class NETDEV_PLATE_ATTR_S {
    public String   szPlateNo;                      /* 车牌号码 */
    public int udwColor;                            /* 车牌颜色 详见 NETDEV_PLATE_COLOR_E */
    public int udwType;                             /* 车牌类型 详见 NETDEV_PLATE_TYPE_E */

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

    public class NETDEV_PLATE_TYPE_E
    {
        public static final int NETDEV_PLATE_TYPE_BIG_CAR_E = 0;                     /* 大型汽车号牌 */
        public static final int NETDEV_PLATE_TYPE_MINI_CAR_E = 1;                    /* 小型汽车号牌 */
        public static final int NETDEV_PLATE_TYPE_EMBASSY_CAR_E = 2;                 /* 使馆汽车号牌 */
        public static final int NETDEV_PLATE_TYPE_CONSULATE_CAR_E = 3;               /* 领馆汽车号牌 */
        public static final int NETDEV_PLATE_TYPE_OVERSEAS_CAR_E = 4;                /* 境外汽车号牌 */
        public static final int NETDEV_PLATE_TYPE_FOREIGN_CAR_E = 5;                 /* 外籍汽车号牌 */
        public static final int NETDEV_PLATE_TYPE_COMMON_MOTORBIKE_E = 6;            /* 普通摩托车号牌 */
        public static final int NETDEV_PLATE_TYPE_HANDINESS_MOTORBIKE_E = 7;         /* 轻便摩托车号牌 */
        public static final int NETDEV_PLATE_TYPE_EMBASSY_MOTORBIKE_E = 8;           /* 使馆摩托车号牌 */
        public static final int NETDEV_PLATE_TYPE_CONSULATE_MOTORBIKE_E = 9;         /* 领馆摩托车号牌 */
        public static final int NETDEV_PLATE_TYPE_OVERSEAS_MOTORBIKE_E = 10;         /* 境外摩托车号牌 */
        public static final int NETDEV_PLATE_TYPE_FOREIGN_MOTORBIKE_E = 11;          /* 外籍摩托车号牌 */
        public static final int NETDEV_PLATE_TYPE_LOW_SPEED_CAR_E = 12;              /* 低速车号牌 */
        public static final int NETDEV_PLATE_TYPE_TRACTOR_E = 13;                    /* 拖拉机号牌 */
        public static final int NETDEV_PLATE_TYPE_TRAILER_E = 14;                    /* 挂车号牌 */
        public static final int NETDEV_PLATE_TYPE_COACH_CAR_E = 15;                  /* 教练汽车号牌 */
        public static final int NETDEV_PLATE_TYPE_COACH_MOTORBIKE_E = 16;            /* 教练摩托车号牌 */
        public static final int NETDEV_PLATE_TYPE_TEMPORARY_ENTRY_CAR_E = 17;        /* 临时入境汽车号牌 */
        public static final int NETDEV_PLATE_TYPE_TEMPORARY_ENTRY_MOTORBIKE_E = 18;  /* 临时入境摩托车号牌 */
        public static final int NETDEV_PLATE_TYPE_TEMPORARY_DRIVING_E = 19;          /* 临时行驶车号牌 */
        public static final int NETDEV_PLATE_TYPE_POLICE_CAR_E = 20;                 /* 警用汽车号牌 */
        public static final int NETDEV_PLATE_TYPE_POLICE_MOTORBIKE_E = 21;           /* 警用摩托车号牌 */
        public static final int NETDEV_PLATE_TYPE_AGRICULTURAL_E = 22;               /* 原农机号牌 */
        public static final int NETDEV_PLATE_TYPE_HONGKONG_ENTRY_EXIT_E = 23;        /* 香港入出境号牌 */
        public static final int NETDEV_PLATE_TYPE_MACAO_ENTRY_EXIT_E = 24;           /* 澳门入出境号牌 */
        public static final int NETDEV_PLATE_TYPE_ARMED_POLICE_E = 25;               /* 武警号牌 */
        public static final int NETDEV_PLATE_TYPE_ARMY_E = 26;                       /* 军队号牌 */

        public static final int NETDEV_PLATE_TYPE_OTHER_E = 99;                     /* 其他号牌 */

        public static final int NETDEV_PLATE_TYPE_INVALID = 0xFF;                     /* 无效值  Invalid value */
    }
}
