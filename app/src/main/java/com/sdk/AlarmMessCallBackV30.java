package com.sdk;

import com.example.netsdk_demo.CAlarmReport;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by f06266 on 2019/8/21.
 */

public class AlarmMessCallBackV30 {

    MapAlarmType[] alarmTypeMap = {
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_MOVE_DETECT,"move detect"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_MOVE_DETECT_RECOVER,"Motion detection alarm recover"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_VIDEO_LOST,"video lost"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_VIDEO_LOST_RECOVER,"Video loss alarm recover"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_VIDEO_TAMPER_DETECT,"video tamper detect"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_VIDEO_TAMPER_RECOVER,"Tampering detection alarm recover"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_INPUT_SWITCH,"input switch"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_INPUT_SWITCH_RECOVER,"Boolean input alarm recover"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_TEMPERATURE_HIGH,"temperature high"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_TEMPERATURE_LOW,"temperature low"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_TEMPERATURE_RECOVER,"Temperature alarm recover"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_AUDIO_DETECT,"audio detect"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_AUDIO_DETECT_RECOVER,"Audio detection alarm recover"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SERVER_FAULT,"server failure"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SERVER_NORMAL,"server failure recover"),

            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_REPORT_DEV_ONLINE,"device online"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_REPORT_DEV_OFFLINE,"device offline"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_REPORT_DEV_REBOOT,"device reboot"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_REPORT_DEV_SERVICE_REBOOT,"device service reboot"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_REPORT_DEV_CHL_ONLINE,"device chn online"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_REPORT_DEV_CHL_OFFLINE,"device chl offline"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_REPORT_DEV_DELETE_CHL,"device delete chl"),

            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_NET_FAILED,"network failed"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_NET_TIMEOUT,"network timeout"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SHAKE_FAILED,"shake failed"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_STREAMNUM_FULL,"stream num full"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_STREAM_THIRDSTOP,"stream third stop"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_FILE_END,"File ended"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_RTMP_CONNECT_FAIL,"RTMP connect fail"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_RTMP_INIT_FAIL,"RTMP init fail"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_STREAM_DOWNLOAD_OVER,"vms gb stream download finished"),

            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_DISK_ERROR,"device disk error"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SYS_DISK_ERROR,"system disk error"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_DISK_ONLINE,"device disk online"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SYS_DISK_ONLINE,"system disk online"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_DISK_OFFLINE,"device disk offline"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SYS_DISK_OFFLINE,"system disk offline"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_DISK_ABNORMAL,"disk abnormal"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_DISK_ABNORMAL_RECOVER,"disk abnormal recover"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_DISK_STORAGE_WILL_FULL,"disk storage will pull"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_DISK_STORAGE_WILL_FULL_RECOVER,"disk storage will full recover"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_DISK_STORAGE_IS_FULL,"device disk storage is full"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SYS_DISK_STORAGE_IS_FULL,"system disk storage is full"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_DISK_STORAGE_IS_FULL_RECOVER,"disk storage is full recover"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_DISK_RAID_DISABLED_RECOVER,"disk raid disabled recover"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_DISK_RAID_DEGRADED,"device disk raid degraded"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SYS_DISK_RAID_DEGRADED,"system disk raid degraded"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_DISK_RAID_DISABLED,"device disk raid disabled"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SYS_DISK_RAID_DISABLED,"system raid disabled"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_DISK_RAID_DEGRADED_RECOVER,"disk raid degraded recover"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_STOR_GO_FULL,"device storage full"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SYS_STOR_GO_FULL,"system storage full"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_ARRAY_NORMAL,"device disk raid normal"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SYS_ARRAY_NORMAL,"system disk raid normal"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_DISK_RAID_RECOVERED,"disk raid recovered"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_STOR_ERR,"device store error"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SYS_STOR_ERR,"system storage error recover"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_STOR_ERR_RECOVER,"storage error recover"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_STOR_DISOBEY_PLAN,"store error "),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_STOR_DISOBEY_PLAN_RECOVER,"storage disobey plan recover"),

            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_BANDWITH_CHANGE,"device export bandwidth change"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_VIDEOENCODER_CHANGE,"device stream config change"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_IP_CONFLICT,"ip conflict"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_IP_CONFLICT_CLEARED,"ip conflict cleared"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_NET_OFF,"network disconnect"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_NET_RESUME_ON,"network disconnect recover"),

            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_ILLEGAL_ACCESS,"device illegal access"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SYS_ILLEGAL_ACCESS,"system illegal access"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_LINE_CROSS,"line cross"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_OBJECTS_INSIDE,"inside"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_FACE_RECOGNIZE,"face recognize"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_IMAGE_BLURRY,"image blurry"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SCENE_CHANGE,"scene change"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_TRACK,"smart track"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_LOITERING_DETECTOR,"loitering detector"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_BANDWIDTH_CHANGE,"Bandwidth change"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_ALLTIME_FLAG_END,"all time falg end"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_MEDIA_CONFIG_CHANGE,"meida config change"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_REMAIN_ARTICLE,"remain article"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_PEOPLE_GATHER,"people gather"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_ENTER_AREA,"enter area"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_LEAVE_AREA,"leave area"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_ARTICLE_MOVE,"article move"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_FACE_MATCH_LIST,"face recognize blacklist"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_FACE_MATCH_LIST_RECOVER,"face recognize blacklist recovery"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_FACE_MISMATCH_LIST,"face recognize unmatch"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_FACE_MISMATCH_LIST_RECOVER,"face recognize unmatch recovery"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_VEHICLE_MATCH_LIST,"vehicle recognize match"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_VEHICLE_MATCH_LIST_RECOVER,"vehicle recognize match recovery"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_VEHICLE_MISMATCH_LIST,"vehicle recognize unmatch"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_VEHICLE_MISMATCH_LIST_RECOVER,"vehicle recognize unmatch recovery"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_IMAGE_BLURRY_RECOVER,"image blurry recover"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_TRACK_RECOVER,"smart track recover"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_READ_ERROR_RATE,"smart read error rate"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_SPIN_UP_TIME,"smart spin up time"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_START_STOP_COUNT,"smart start stop count"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_REALLOCATED_SECTOR_COUNT,"smart reallocated sector count"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_SEEK_ERROR_RATE,"smart seek error rate"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_POWER_ON_HOURS,"smart power on hours"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_SPIN_RETRY_COUNT,"smart spin retry count"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_CALIBRATION_RETRY_COUNT,"smart calibration replay count"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_POWER_CYCLE_COUNT,"smart power cycle count"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_POWEROFF_RETRACT_COUNT,"smart power off retract count"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_LOAD_CYCLE_COUNT,"smart load cycle count"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_TEMPERATURE_CELSIUS,"smart temperature celsius"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_REALLOCATED_EVENT_COUNT,"smart reallocated event count"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_CURRENT_PENDING_SECTOR,"smart current pending sector"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_OFFLINE_UNCORRECTABLE,"smart offline uncorrectable"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_UDMA_CRC_ERROR_COUNT,"smart udma crc error count"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_SMART_MULTI_ZONE_ERROR_RATE,"smart multi zone error rate"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_RESOLUTION_CHANGE,"resolution change"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_MANUAL,"manual"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_ALARMHOST_COMMON,"alarm host commmon"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_DOORHOST_COMMON,"door host commmon"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_FACE_NOT_MATCH,"face not match"),
            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_FACE_MATCH_SUCCEED,"face match succeed"),

            new MapAlarmType(NetDEVSDK.NETDEV_ALARM_TYPE_E.NETDEV_ALARM_VEHICLE_BLACK_LIST,"vehicle blacklist"),
    };

    public static List<String> mAlarmlist = new ArrayList<String>();
    public static int mAlarmcnt = 0;

    public void AlarmMessCallBackV30(long lpUserID, NETDEV_REPORT_INFO_S stReportInfo, long lpBuf, int dwBufLen, long lpUserData)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long timeLong = Long.valueOf(stReportInfo.stAlarmInfo.tAlarmTimeStamp);
        String  strTime =  sdf.format(new Date(timeLong * 1000L));

        String strAlarmInfo = "";
        for (MapAlarmType st : alarmTypeMap) {
            if(stReportInfo.stAlarmInfo.dwAlarmType == st.dwAlarmType)
            {
                strAlarmInfo = st.strAlarmType;
            }
        }

        if(strAlarmInfo == "")
        {
            return;
        }

        mAlarmlist.add(0, strTime + " \r\n ChannelID : " + stReportInfo.stAlarmInfo.dwChannelID  + " : " + strAlarmInfo + " " + stReportInfo.stAlarmInfo.szAlarmSrc);
        //CAlarmReport.updateAlarmInfoPage();
        mAlarmcnt++;
        System.out.println("Android Report alarm info , iAlarmSrcType:" +  stReportInfo.stAlarmInfo.dwAlarmType + ", Time :" +  strTime + " UserID : " + lpUserID + " , ChannelID : " + stReportInfo.stAlarmInfo.dwChannelID  + ",AlarmType : " + strAlarmInfo);
    }
}
