package com.sdk;

/**
 * Created by f06266 on 2019/8/6.
 */

public class NETDEV_NON_MOTOR_VEH_INFO_S {
    public int udwID;                                         /* 非机动车ID */
    public String   szPosition;                               /* 非机动车位置信息 */
    public int udwSmallPicAttachIndex;                        /* 非机动车对应的小图在图像列表中的索引 */
    public int udwLargePicAttachIndex;                        /* 非机动对应的大图在图像列表中的索引 */
    public NETDEV_NO_MOTOR_VEH_ATTR_S stNoMotorVehAttr;       /* 非机动车属性信息 */
    public int udwPersonOnNoVehiNum;                          /* 驾乘人员数目 */
    public NETDEV_PERSON_ATTR_S[] pstPersonAttr;              /* 人员属性 需动态申请内存 */

    public void setPersonAttrList(NETDEV_PERSON_ATTR_S[] pstPersonAttr) {
        this.pstPersonAttr = pstPersonAttr;
    }
}
