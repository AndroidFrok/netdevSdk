package com.sdk;

/**
 * Created by f06266 on 2019/8/6.
 */

public class NETDEV_FACE_ATTR_S {
    public int udwGender;                                     /* 性别 详见 NETDEV_GENDER_TYPE_E */
    public int udwAgeRange;                                   /* 年龄段 详见 NETDEV_AGE_RANGE_E */
    public int udwEthicCode;                                  /* 民族代码 详见 NETDEV_ETHIC_CODE_E */
    public int udwGlassFlag;                                  /* 是否戴眼镜标志 详见 NETDEV_GLASS_FLAG_E */
    public int udwGlassesStyle;                               /* 眼镜款式 详见 NETDEV_GLASSES_STYLE_E */

    public class NETDEV_GENDER_TYPE_E {
        public static final int NETDEV_GENDER_TYPE_UNKNOW       = 0;        /* 0-未知的性别 */
        public static final int NETDEV_GENDER_TYPE_MAN          = 1;        /* 1-男 */
        public static final int NETDEV_GENDER_TYPE_WOMAN        = 2;        /* 2-女 */
        public static final int NETDEV_GENDER_TYPE_UNEXPLAINED  = 9;        /* 9-未说明的性别 */
        public static final int NETDEV_GENDER_TYPE_INVALID      = 0xFF;      /* 无效值 */
    }

    public class NETDEV_AGE_RANGE_E {
        public static final int NETDEV_AGE_RANGE_UNKNOW                                = 0;                /* 未知 */
        public static final int NETDEV_AGE_RANGE_CHILD                                 = 1;                /* 儿童 */
        public static final int NETDEV_AGE_RANGE_JUVENILE                              = 2;                /* 少年 */
        public static final int NETDEV_AGE_RANGE_Youth                                 = 3;                /* 青年 */
        public static final int NETDEV_AGE_RANGE_MIDDLEAGE                             = 4;                /* 中年 */
        public static final int NETDEV_AGE_RANGE_OLDAGE                                = 5;                /* 老年 */
        public static final int NETDEV_AGE_RANGE_INVALID                               = 0xFF;              /* 无效年龄段 */
    }

    public class NETDEV_ETHIC_CODE_E {
        public static final int NETDEV_ETHIC_CODE_UNKNOW                               = 0;                /* 未知 */
        public static final int NETDEV_ETHIC_CODE_UYGUR                                = 1;                /* 维吾尔族 */
        public static final int NETDEV_ETHIC_CODE_OTHER                                = 2;                /* 其它 */
        public static final int NETDEV_ETHIC_CODE_INVALID                              = 0xFF;              /* 无效值 */
    }

    public class NETDEV_GLASS_FLAG_E {
        public static final int NETDEV_GLASS_FLAG_UNKNOW                              = 0;                 /* 未知 */
        public static final int NETDEV_GLASS_FLAG_NO                                  = 1;                 /* 不戴 */
        public static final int NETDEV_GLASS_FLAG_YES                                 = 2;                 /* 戴 */
        public static final int NETDEV_GLASS_FLAG_INVALID                             = 0xFF;               /* 无效值 */
    }

    public class NETDEV_GLASSES_STYLE_E {
        public static final int NETDEV_GLASSES_STYLE_UNKNOW                            = 0;                 /* 未知 */
        public static final int NETDEV_GLASSES_STYLE_GENERAL                           = 1;                 /* 普通眼镜 */
        public static final int NETDEV_GLASSES_STYLE_SUNLIGHT                          = 2;                 /* 太阳眼镜 */
        public static final int NETDEV_GLASSES_STYLE_OTHER                             = 99;                /* 其它 */
        public static final int NETDEV_GLASSES_STYLE_INVALID                           = 0xFF;               /* 无效值 */
    }
}
