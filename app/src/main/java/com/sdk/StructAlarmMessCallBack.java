package com.sdk;

/**
 * Created by f06266 on 2019/8/6.
 */

public class StructAlarmMessCallBack {
    /**
    * 接收结构化告警消息的回调函数        Callback function to receive alarm information
    * @param [IN] lpUserID                用户登录句柄 User login ID
    * @param [IN] pstAlarmInfo            告警信息 Alarm information
    * @param [IN] pstAlarmData            告警数据 Alarm data
    * @param [IN] lpUserData              用户数据 User data
    * @note
    */
    public void StructAlarmMessCallBack(long iUserID,NETDEV_STRUCT_ALARM_INFO_S stAlarmInfo,NETDEV_STRUCT_DATA_INFO_S stAlarmData, long lpUserData)
    {
        System.out.println("StructAlarmMessCallBack");
    }
}
