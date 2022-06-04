package com.sdk;

/**
 * Created by f06266 on 2019/8/6.
 */

public class NETDEV_VEH_INFO_S {
    public int udwID;                                         /* 车辆ID */
    public String   szPosition;                     /* 车辆位置信息 */
    public int udwSmallPicAttachIndex ;                       /* 车辆对应的小图在图像列表中的索引 */
    public int udwLargePicAttachIndex;                        /* 车辆对应的大图在图像列表中的索引 */
    public int udwPlatePicAttachIndex;                        /* 车牌对应的小图在图像列表中的索引 */
    public String   szFeatureVersion;               /* 半结构化特征厂商类型版本号 */
    public String   szFeature;                    /* 基于人脸提取出来的特征信息 采用base64编码 加密前512 Bytes */
    public NETDEV_VEH_ATTR_S stVehAttr;                          /* 车辆属性信息 */
    public NETDEV_PLATE_ATTR_S stPlateAttr;                      /* 车牌属性信息 */

    public NETDEV_VEH_INFO_S() {
        this.stVehAttr = new NETDEV_VEH_ATTR_S();
        this.stPlateAttr = new NETDEV_PLATE_ATTR_S();
    }
}
