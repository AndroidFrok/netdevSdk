package com.sdk;

/**
 * Created by f06266 on 2019/8/1.
 */

public class NETDEMO_LOGIN_INFO_S {
    public int   dwLoginType;       //-1 = unknow,   0 = local, 1 = cloud

    public String    szUserName;
    public String    szPassword;
    public String    szIPAddr;
    public int   dwPort;
    public int   dwDevType;
    public int   dwLoginProto;
    public String    szCloudUrl;
    public String    szCloudName;
    public String    szCloudPasswd;
    public String    szCloudDevName;       /* 云设备名称 Device name */
}
