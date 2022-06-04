package com.sdk;

/**
 * Created by f06266 on 2019/8/6.
 */

public class NETDEV_OBJECT_INFO_S {
    public int udwFaceNum;                                     /* 人脸数量 */
    public NETDEV_FACE_STRUCT_INFO_S[] pstFaceInfo;              /* 人脸信息 需动态申请内存 */
    public int udwPersonNum;                                   /* 人员数量 */
    public NETDEV_PERSON_STRUCT_INFO_S[] pstPersonInfo;          /* 人员信息 需动态申请内存 */
    public int udwNonMotorVehNum;                              /* 非机动车数量 */
    public NETDEV_NON_MOTOR_VEH_INFO_S[] pstNonMotorVehInfo;     /* 非机动车信息 需动态申请内存 */
    public int udwVehicleNum;                                  /* 车辆数量 */
    public NETDEV_VEH_INFO_S[] pstVehInfo;                       /* 车辆信息 需动态申请内存 */

    public void setPstFaceInfo(NETDEV_FACE_STRUCT_INFO_S[] pstFaceInfo) {
        this.pstFaceInfo = pstFaceInfo;
    }

    public void setPstPersonInfo(NETDEV_PERSON_STRUCT_INFO_S[] pstPersonInfo) {
        this.pstPersonInfo = pstPersonInfo;
    }

    public void setPstNonMotorVehInfo(NETDEV_NON_MOTOR_VEH_INFO_S[] pstNonMotorVehInfo) {
        this.pstNonMotorVehInfo = pstNonMotorVehInfo;
    }

    public void setPstVehInfo(NETDEV_VEH_INFO_S[] pstVehInfo) {
        this.pstVehInfo = pstVehInfo;
    }
}
