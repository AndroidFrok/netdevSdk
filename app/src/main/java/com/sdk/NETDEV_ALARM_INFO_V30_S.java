package com.sdk;

/**
 * Created by f06266 on 2019/8/21.
 */

public class NETDEV_ALARM_INFO_V30_S {
    public int dwAlarmType;                                  /* 告警类型，参见枚举#NETDEV_ALARM_TYPE_E  Alarm type, see enumeration #NETDEV_ALARM_TYPE_E */
    public int dwAlarmSubType;                               /* 告警子类型，参见NETDEV_ALARM_SUBTYPE_E */
    public int dwAlarmLevel;                                 /* 告警等级，1到5级，1级最严重 */
    public long tAlarmTimeStamp;                             /* 告警发生时间  Alarm occurrence time */
    public int dwChannelID;                                  /* 通道ID,非一体机设备使用  Channel ID */
    public int dwAlarmID;                                    /* 告警ID，一体机设备使用 */
    public int dwAlarmSrcID;                                 /* 告警源ID 参见枚举#NETDEV_ALARM_SRC_TYPE_E
                                                        note:
                                                        1. dwAlarmSrcType为NETDEV_ALARM_SRC_LOCAL_HARD_DISK到NETDEV_ALARM_SRC_SD_STORAGE_DISK之间，dwAlarmID代表存储盘索引；
                                                        2. dwAlarmSrcType为8，dwAlarmID代表视频通道号；
                                                        3. dwAlarmSrcType为9，dwAlarmID代表报警输入通道号，报警源见dwInputSwitchID字段。
                                                        4. dwAlarmSrcType为10,dwAlarmID默认为0,代表系统本身
                                                        */
    public String  szAlarmSrc;                               /* 告警源信息（名称） */
    public int IsAlarmSnapExisted;                           /* 告警是否有抓图 0没有抓图 1有抓图  vms使用*/
    public int  wIndex;                                      /* 索引号  Index number, index number */
    public int   dwTotalBandWidth;                           /* 当前带宽总量,单位为MBps  Current total bandwidth (in MBps) */
    public int   dwUnusedBandwidth;                          /* 未使用的带宽,单位为MBps  Bandwidth left (in MBps)*/
    public int   dwTotalStreamNum;                           /* 总路数 Total cameras*/
    public int   dwFreeStreamNum;                            /* 未使用路数 Cameras left */
    public int   dwMediaMode;                                /* 流类型,参见枚举#NETDEV_MEDIA_MODE_E Stream type. For enumerations, see#NETDEV_MEDIA_MODE_E*/

}
