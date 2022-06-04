package com.sdk;

/**
 * Created by f06266 on 2019/8/6.
 */

public class NETDEV_STRUCT_IMAGE_INFO_S {
    public int udwIndex;                                      /* 图像索引 */
    public int udwType;                                       /* 图像类型 */
    public int udwFormat;                                     /* 图像格式 详见 NETDEV_IMAGE_FORMAT_E*/
    public int udwWidth;                                      /* 图像的宽度 */
    public int udwHeight;                                     /* 图像的高度 */
    public int udwCaptureTime;                                /* 图片采集时刻 */
    public String   szUrl;                                    /* 图片URL */
    public int udwSize;                                       /* 图像经过base64编码之后的长度 最大3M */
    public byte[] pszData = new byte[1048576];                                   /* 图像的base64编码数据 */

    public class NETDEV_IMAGE_FORMAT_E {
        public static final int NETDEV_IMAGE_FORMAT_JPG                              = 0;                   /* JPG */
        public static final int NETDEV_IMAGE_FORMAT_BMP                              = 1;                   /* BMP */
        public static final int NETDEV_IMAGE_FORMAT_PNG                              = 2;                   /* PNG */
        public static final int NETDEV_IMAGE_FORMAT_GIF                              = 3;                   /* GIF */
        public static final int NETDEV_IMAGE_FORMAT_TIFF                             = 4;                   /* TIFF */
        public static final int NETDEV_IMAGE_FORMAT_INVALID                          = 0xFF;                /* 无效值 */
    }
}
