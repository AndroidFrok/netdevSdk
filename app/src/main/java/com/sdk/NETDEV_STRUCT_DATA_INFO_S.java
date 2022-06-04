package com.sdk;

/**
 * Created by f06266 on 2019/8/6.
 */

public class NETDEV_STRUCT_DATA_INFO_S {
    public NETDEV_OBJECT_INFO_S stObjectInfo;                    /* 目标信息 */
    public int udwImageNum;                                      /* 图像个数 */
    public NETDEV_STRUCT_IMAGE_INFO_S[] pstImageInfo;            /* 图像相关信息 需动态申请内存 */

    public void setStructImageInfoList(NETDEV_STRUCT_IMAGE_INFO_S[] stImageInfo){
        this.pstImageInfo = stImageInfo;
    }
}
