package com.sdk;

public class NETDEV_OPERATE_LIST_S {
    public int   dwSize;                                 /* 批量处理数量 */
    public NETDEV_OPERATE_INFO_S[]   pstOperateInfo;       /* 批量处理信息 */

    public void setPstOperateInfo(NETDEV_OPERATE_INFO_S[] pstOperateInfo) {
        this.pstOperateInfo = pstOperateInfo;
    }

    public NETDEV_OPERATE_INFO_S[] getPstOperateInfo() {
        return pstOperateInfo;
    }
}
