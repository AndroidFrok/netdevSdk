package com.sdk;

/**
 * Created by f06266 on 2019/8/6.
 */

public class NETDEV_FACE_STRUCT_INFO_S {
    public int udwFaceID;                                     /* 人脸ID */
    public int udwFaceDoforPersonID;                          /* 人脸所属人员ID */
    public String   szPosition;                               /* 人脸位置信息 */
    public int udwSmallPicAttachIndex;                        /* 人脸对应的小图在图像列表中的索引 */
    public int udwLargePicAttachIndex;                        /* 人脸对应的大图在图像列表中的索引 */
    public String   szFeaturVersion;                          /* 半结构化特征厂商类型版本号 */
    public String   szFeature;                                /* 基于人脸提取出来的特征信息 采用base64编码 前加密前512 Bytes */
    public NETDEV_FACE_ATTR_S stFaceAttr;                     /* 人脸属性信息 */
}
