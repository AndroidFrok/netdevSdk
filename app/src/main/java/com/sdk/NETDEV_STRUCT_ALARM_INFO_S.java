package com.sdk;

/**
 * Created by f06266 on 2019/8/6.
 */

public class NETDEV_STRUCT_ALARM_INFO_S {
    public String   szReference;                              /* 描述信息 */
    public int udwTimeStamp;                                  /* 告警时间 从1970年1月1日0点开始的秒数 */
    public int udwSeq;                                        /* 告警序号 */
    public int udwSrcID;                                      /* 告警源ID */
    public String   szSrcName;                                /* 告警源名称 */
    public int udwNotificationType;                           /* 通知类型 0：实时通知 1：历史通知 */
}
