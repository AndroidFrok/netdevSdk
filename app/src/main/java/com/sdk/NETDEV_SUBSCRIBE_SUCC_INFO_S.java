package com.sdk;

/**
 * Created by f06266 on 2019/8/6.
 */

public class NETDEV_SUBSCRIBE_SUCC_INFO_S {
    public int udwID;         	/* 订阅ID */
    public int udwCurrrntTime;      /* 当前时间，UTC格式，从1970年1月1日0点开始的秒数 */
    public int udwTerminationTime;/* 结束时间，UTC格式，从1970年1月1日0点开始的秒数 */
    public int udwSupportAlarmType;        /* 请求消息携带订阅告警类型时返回值需携带此参数，返回0说明响应未携带该数据 */
    public String   szReference;/* 订阅者描述信息 以URL格式体现 */

    public NETDEV_SUBSCRIBE_SUCC_INFO_S() {
        udwID = 0;
        udwCurrrntTime = 0;
        udwTerminationTime = 0;
        udwSupportAlarmType = 0;
    }
}
