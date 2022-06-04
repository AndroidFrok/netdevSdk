package com.sdk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PassengerFlowStatisticCallBack_PF {

    public void PassengerFlowStatisticCallBack(long lpUserID, NETDEV_PASSENGER_FLOW_STATISTIC_DATA_S stData, long iUserData)  {
        System.out.println(stData.toString());
    }
}
