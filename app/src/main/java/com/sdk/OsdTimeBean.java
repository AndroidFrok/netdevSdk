package com.sdk;

/**
 * @struct tagNETDEVOsdTime
 * @brief OSDʱ��������Ϣ OSD time configuration information
 * @attention �� None
 */
public class OsdTimeBean {
	private boolean bEnableFlag;
	/**
	 * ʱ��OSDʹ��, BOOL_TRUEΪʹ��,BOOL_FALSEΪ��ʹ�� * Enable time OSD, BOOL_TRUE means
	 * enable and BOOL_FALSE means disable
	 */
	private boolean bWeekEnableFlag;
	/** �Ƿ���ʾ����(Ԥ��) * Display week or not (reserved) */
	private AreaScopeBean stAreaScope;
	/** �������� * Area coordinates */
	private int iTimeFormat;
	/**
	 * ʱ��OSDʱ���ʽ,���NETDEV_OSD_TIME_FORMAT_E * Time OSD format, see
	 * NETDEV_OSD_TIME_FORMAT_E
	 */
	private int iDateFormat;

	/**
	 * ����OSDʱ���ʽ,���NETDEV_OSD_DATE_FMT_E * Date OSD format, see
	 * NETDEV_OSD_TIME_FORMAT_E
	 */

	public OsdTimeBean() {

	}

	public boolean isbEnableFlag() {
		return bEnableFlag;
	}

	public void setbEnableFlag(boolean bEnableFlag) {
		this.bEnableFlag = bEnableFlag;
	}

	public boolean isbWeekEnableFlag() {
		return bWeekEnableFlag;
	}

	public void setbWeekEnableFlag(boolean bWeekEnableFlag) {
		this.bWeekEnableFlag = bWeekEnableFlag;
	}

	public AreaScopeBean getStAreaScope() {
		return stAreaScope;
	}

	public void setStAreaScope(AreaScopeBean stAreaScope) {
		this.stAreaScope = stAreaScope;
	}

	public int getiTimeFormat() {
		return iTimeFormat;
	}

	public void setiTimeFormat(int iTimeFormat) {
		this.iTimeFormat = iTimeFormat;
	}

	public int getiDateFormat() {
		return iDateFormat;
	}

	public void setiDateFormat(int iDateFormat) {
		this.iDateFormat = iDateFormat;
	}

}
