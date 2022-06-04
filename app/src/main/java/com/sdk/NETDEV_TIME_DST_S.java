package com.sdk;

public class NETDEV_TIME_DST_S {
    public int dwMonth;              /* 月(1~12)  Month(1~12)*/
    public int dwWeekInMonth;        /* 每月的第N周（1~5）  1 for the first week and 5 for the last week in the month */
    public int dwDayInWeek;          /* 每周的星期几 参见#NETDEV_DAY_IN_WEEK_E  0 for Sunday and 6 for Saturday see enumeration NETDEV_DAY_IN_WEEK_E */
    public int dwHour;               /* 时  Hour */
}