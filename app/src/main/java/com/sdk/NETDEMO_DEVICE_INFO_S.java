package com.sdk;

import java.util.ArrayList;

/**
 * Created by f06266 on 2019/8/1.
 */

public class NETDEMO_DEVICE_INFO_S {
    public int dwChnNum;
    public int dwDevIndex;
    public NETDEV_DEV_BASIC_INFO_S stDevBasicInfo;
    public ArrayList<NETDEV_DEV_CHN_ENCODE_INFO_S> vecChanInfo;

    public NETDEMO_DEVICE_INFO_S() {
        stDevBasicInfo = new NETDEV_DEV_BASIC_INFO_S();
        vecChanInfo = new ArrayList<NETDEV_DEV_CHN_ENCODE_INFO_S>();
    }
}
