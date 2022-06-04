package com.sdk;

/**
 * @struct tagNETDEVAreaScope
 * @brief ���� Area
 * @attention �� None
 */
public class AreaScopeBean {
	private int iLocateX;
	/** ����x����ֵ[0,10000] * Coordinates of top point x [0,10000] */
	private int iLocateY;

	/** ����y����ֵ[0,10000] * Coordinates of top point y [0,10000] */

	public AreaScopeBean() {

	}

	public int getiLocateX() {
		return iLocateX;
	}

	public void setiLocateX(int iLocateX) {
		this.iLocateX = iLocateX;
	}

	public int getiLocateY() {
		return iLocateY;
	}

	public void setiLocateY(int iLocateY) {
		this.iLocateY = iLocateY;
	}
}
