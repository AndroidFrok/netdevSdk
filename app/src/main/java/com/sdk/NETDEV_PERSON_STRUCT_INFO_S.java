package com.sdk;

/**
 * Created by f06266 on 2019/8/6.
 */

public class NETDEV_PERSON_STRUCT_INFO_S {
    public int udwPersonID;                                   /* 人员ID */
    public int udwPersonDoforFaceID;                          /* 人员所属人脸ID */
    public String   szPosition;                               /* 人员位置信息 */
    public int udwSmallPicAttachIndex;                        /* 人员对应的小图在图像列表中的索引 */
    public int udwLargePicAttachIndex;                        /* 人员对应的大图在图像列表中的索引 */
    public String   szFeaturVersion;                          /* 半结构化特征厂商类型版本号 */
    public String   szFeature;                                /* 半结构化特征厂商类型版本号 采用base64编码 加密前512 Bytes */
    NETDEV_PERSON_ATTR_S stPersonAttr;                        /* 人员信息 */
}
