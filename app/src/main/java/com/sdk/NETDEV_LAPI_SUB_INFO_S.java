package com.sdk;

/**
 * Created by f06266 on 2019/8/6.
 */

public class NETDEV_LAPI_SUB_INFO_S {
    public int udwType; 		/* 订阅类型 按位表示
                                   Bit0：设备状态类型告警
                                   Bit1：监控业务类告警
                                   Bit2：泛智能告警
                                   Bit3：智能类告警
                                   Bit4：人脸识别
                                   Bit5：结构化数据 下发0则全部订阅*/
    public int udwLibIDNum; 	/* 订阅的库ID数目 LibIDNum为0xffff时 表示订阅所有库 */
    public int[] audwLibIDList;	/* 订阅的库ID列表,最大32个 */

    public NETDEV_LAPI_SUB_INFO_S(){
        audwLibIDList = new int[32];
    }
}
