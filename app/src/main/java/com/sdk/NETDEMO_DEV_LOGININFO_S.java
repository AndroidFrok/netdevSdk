package com.sdk;

/**
 * Created by f06266 on 2019/8/1.
 */

public class NETDEMO_DEV_LOGININFO_S {
    public NETDEMO_LOGIN_INFO_S stNETDEV_LoginInfo;

    public long    pHandle;
    public long    pCloudHandle;
    public int    dwDevNum;
    public NETDEMO_DEVICE_INFO_S[] stDevLoginInfo;

    public NETDEV_CLOUD_DEV_INFO_S stCloudDevInfo;


    public NETDEMO_DEV_LOGININFO_S() {
        stNETDEV_LoginInfo = new NETDEMO_LOGIN_INFO_S();
        stDevLoginInfo = new NETDEMO_DEVICE_INFO_S[512];
        for(int i =0; i< 512; i++)
        {
            stDevLoginInfo[i] = new NETDEMO_DEVICE_INFO_S();
        }

        stCloudDevInfo = new NETDEV_CLOUD_DEV_INFO_S();
    }
}
