package com.sdk;

public class NETDEV_PTZ_STATUS_S {
	public float fPanTiltX;				/* Absolute horizontal coordinates */
	public float fPanTiltY;              /* Absolute vertical coordinates*/
	public float fZoomX;                 /* Absolute multiples*/
	public int enPanTiltStatus;         /*PTZ Status, 0:Free, 1:Moving*/
	public int enZoomStatus;            /* Focus Status, 0:Free, 1:Moving*/
}
