package com.sdk;

/**
 * Created by f06266 on 2019/8/21.
 */

public class NETDEV_EVENT_RES_S {
    public int   dwResType;                          /* 资源类型，参见枚举#NETDEV_EVENT_RES_TYPE_E */
    public int   dwResID;                            /* 资源ID */
    public int   dwFirstSubResID;                    /* 第一子资源ID */
    public int   dwSecondSubResID;                   /* 第二子资源ID 不同资源类型对应意义不同。如：电视墙分屏资源的资源ID是电视墙ID，第一子资源ID是窗口ID，第二子资源ID就是分屏ID*/
}
