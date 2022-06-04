package com.sdk;

/**
 * Created by f06266 on 2019/8/21.
 */

public class NETDEV_EVENT_INFO_S {
    public int                     dwSize;                                     /* 资源数量 */
    public NETDEV_EVENT_RES_S[]      astEventRes;     /* 事件资源信息 */
    public int                   dwEventActionType;                          /* 事件类型，参见枚举#NETDEV_EVENT_ACTION_TYPE_E */
    public NETDEV_EVENT_RES_S[]    pstEventRes;                                /* 超过NETDEV_MAX_EVENT_RES_SIZE的事件资源信息 需要动态申请*/


    public NETDEV_EVENT_INFO_S() {
        astEventRes = new NETDEV_EVENT_RES_S[1024];
    }

    public void setAstEventRes(NETDEV_EVENT_RES_S[] astEventRes) {
        this.astEventRes = astEventRes;
    }
}
