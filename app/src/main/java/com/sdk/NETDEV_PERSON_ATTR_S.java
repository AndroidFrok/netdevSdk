package com.sdk;

/**
 * Created by f06266 on 2019/8/6.
 */

public class NETDEV_PERSON_ATTR_S {
    public int udwGender;                                     /* 性别 详见 NETDEV_GENDER_TYPE_E */
    public int udwAgeRange;                                   /* 年龄段 详见 NETDEV_AGE_RANGE_E */
    public int udwSleevesLength;                              /* 上衣长短款式 详见 NETDEV_SLEEVES_LENGTH_E */
    public int udwCoatColor;                                  /* 上衣颜色 详见 NETDEV_CLOTHES_COLOR_E */
    public int udwTrousersLength;                              /* 下衣长短款式 详见 NETDEV_TROUSERS_LENGTH_E */
    public int udwTrousersColor;                              /* 下衣颜色 详见 NETDEV_CLOTHES_COLOR_E */
    public int udwBodyToward;                                 /* 身体抓怕朝向 详见 NETDEV_BODY_TOWARD_E */
    public int udwShoesTubeLength;                            /* 鞋子长短款式 详见 NETDEV_SHOES_TUBE_LENGTH_E */
    public int udwHairLength;                                 /* 发型长短 详见 NETDEV_HAIR_LENGTH_E */
    public int udwBagFlag;                                    /* 是否携包标志 详见 NETDEV_BAG_FLAG_E */

    public class NETDEV_GENDER_TYPE_E
    {
        public static final int NETDEV_GENDER_TYPE_UNKNOW       = 0;        /* 0-未知的性别 */
        public static final int NETDEV_GENDER_TYPE_MAN          = 1;        /* 1-男 */
        public static final int NETDEV_GENDER_TYPE_WOMAN        = 2;        /* 2-女 */
        public static final int NETDEV_GENDER_TYPE_UNEXPLAINED  = 9;        /* 9-未说明的性别 */
        public static final int NETDEV_GENDER_TYPE_INVALID      = 0xFF;      /* 无效值 */
    }

    public class NETDEV_AGE_RANGE_E
    {
        public static final int NETDEV_AGE_RANGE_UNKNOW                                = 0;                /* 未知 */
        public static final int NETDEV_AGE_RANGE_CHILD                                 = 1;                /* 儿童 */
        public static final int NETDEV_AGE_RANGE_JUVENILE                              = 2;                /* 少年 */
        public static final int NETDEV_AGE_RANGE_Youth                                 = 3;                /* 青年 */
        public static final int NETDEV_AGE_RANGE_MIDDLEAGE                             = 4;                /* 中年 */
        public static final int NETDEV_AGE_RANGE_OLDAGE                                = 5;                /* 老年 */
        public static final int NETDEV_AGE_RANGE_INVALID                               = 0xFF;              /* 无效年龄段 */
    }
    public class NETDEV_SLEEVES_LENGTH_E
    {
        public static final int NETDEV_SLEEVES_LENGTH_UNKNOW                           = 0;                 /* 未知 */
        public static final int NETDEV_SLEEVES_LENGTH_SHORT                            = 1;                 /* 短袖 */
        public static final int NETDEV_SLEEVES_LENGTH_LONG                             = 2;                 /* 长袖 */
        public static final int NETDEV_SLEEVES_LENGTH_INVALID                          = 0xFF;               /* 无效值 */
    }

    public class NETDEV_CLOTHES_COLOR_E
    {
        public static final int NETDEV_CLOTHES_COLOR_BLACK_E          = 0;            /* 黑色 */
        public static final int NETDEV_CLOTHES_COLOR_WHITE_E           = 1;           /* 白色 */
        public static final int NETDEV_CLOTHES_COLOR_GRAY_E            = 2;           /* 灰色 */
        public static final int NETDEV_CLOTHES_COLOR_RED_E             = 3;           /* 红色 */
        public static final int NETDEV_CLOTHES_COLOR_BLUE_E            = 4;           /* 蓝色 */
        public static final int NETDEV_CLOTHES_COLOR_YELLOW_E          = 5;           /* 黄色 */
        public static final int NETDEV_CLOTHES_COLOR_ORANGE_E          = 6;           /* 橙色 */
        public static final int NETDEV_CLOTHES_COLOR_BROWN_E           = 7;           /* 棕色 */
        public static final int NETDEV_CLOTHES_COLOR_GREEN_E           = 8;           /* 绿色 */
        public static final int NETDEV_CLOTHES_COLOR_PURPLE_E          = 9;           /* 紫色 */
        public static final int NETDEV_CLOTHES_COLOR_CYAN_E            = 10;          /* 青色 */
        public static final int NETDEV_CLOTHES_COLOR_PINK_E            = 11;          /* 粉色 */
        public static final int NETDEV_CLOTHES_COLOR_TRANSPARENT_E     = 12;          /* 透明 */
        public static final int NETDEV_CLOTHES_COLOR_SILVERYWHITE_E    = 13;          /* 银白 */
        public static final int NETDEV_CLOTHES_COLOR_DARK_E            = 14;          /* 深色 */
        public static final int NETDEV_CLOTHES_COLOR_LIGHT_E           = 15;          /* 浅色 */
        public static final int NETDEV_CLOTHES_COLOR_COLOURLESS        = 16;          /* 无色 */
        public static final int NETDEV_CLOTHES_COLOR_YELLOWGREEN       = 17;          /* 黄绿双色 */
        public static final int NETDEV_CLOTHES_COLOR_GRADUALGREEN      = 18;          /* 渐变绿色 */
        public static final int NETDEV_CLOTHES_COLOR_OTHER_E           = 99;          /* 其他 */
        public static final int NETDEV_CLOTHES_COLOR_UNKNOW_E          = 100;         /* 未知 */
        public static final int NETDEV_CLOTHES_COLOR_INVALID           = 0xFF;         /* 无效值  Invalid value */
    }

    public class NETDEV_TROUSERS_LENGTH_E
    {
        public static final int NETDEV_TROUSERS_LENGTH_UNKNOW                           = 0;                 /* 未知 */
        public static final int NETDEV_TROUSERS_LENGTH_SHORT                            = 1;                 /* 短裤 */
        public static final int NETDEV_TROUSERS_LENGTH_LONG                             = 2;                 /* 长裤 */
        public static final int NETDEV_TROUSERS_LENGTH_INVALID                          = 0xFF;               /* 无效值 */
    }

    public class NETDEV_BODY_TOWARD_E
    {
        public static final int NETDEV_BODY_TOWARD_UNKNOW                              = 0;                 /* 未知 */
        public static final int NETDEV_BODY_TOWARD_POSITIVE                            = 1;                 /* 正面 */
        public static final int NETDEV_BODY_TOWARD_SIDE                                = 2;                 /* 侧面 */
        public static final int NETDEV_BODY_TOWARD_BACK                                = 3;                 /* 背面 */
        public static final int NETDEV_BODY_TOWARD_INVALID                             = 0xFF;               /* 无效值 */
    }

    public class NETDEV_SHOES_TUBE_LENGTH_E
    {
        public static final int NETDEV_SHOES_TUBE_LENGTH_UNKNOW                       = 0;                  /* 未知 */
        public static final int NETDEV_SHOES_TUBE_LENGTH_LONG                         = 1;                  /* 长筒靴 */
        public static final int NETDEV_SHOES_TUBE_LENGTH_SHORT                        = 2;                  /* 短筒靴/普通鞋 */
        public static final int NETDEV_SHOES_TUBE_LENGTH_INVALID                      = 0xFF;                /* 无效值 */
    }

    public class NETDEV_HAIR_LENGTH_E
    {
        public static final int NETDEV_HAIR_LENGTH_UNKNOW                            = 0;                   /* 未知 */
        public static final int NETDEV_HAIR_LENGTH_LONG                              = 1;                   /* 长发 */
        public static final int NETDEV_HAIR_LENGTH_SHORT                             = 2;                   /* 短发 */
        public static final int NETDEV_HAIR_LENGTH_INVALID                           = 0xFF;                 /* 无效值 */
    }

    public class NETDEV_BAG_FLAG_E
    {
        public static final int NETDEV_BAG_FLAG_NO                                   = 0;                   /* 未带包 */
        public static final int NETDEV_BAG_FLAG_CARRY                                = 1;                   /* 拎包 */
        public static final int NETDEV_BAG_FLAG_BACK                                 = 2;                   /* 背包 */
        public static final int NETDEV_BAG_FLAG_INVALID                              = 0xFF;                 /* 无效值 */
    }
}
