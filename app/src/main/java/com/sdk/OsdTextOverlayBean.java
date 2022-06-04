package com.sdk;

/**
 * @struct tagNETDEVOsdTime
 * @brief OSDʱ��������Ϣ OSD time configuration information
 * @attention �� None
 */
public class OsdTextOverlayBean {
	private boolean bEnableFlag;
	/**
	 * OSD�ַ�����ʹ��, BOOL_TRUEΪʹ��,BOOL_FALSEΪ��ʹ�� * Enable OSD text overlay,
	 * BOOL_TRUE means enable and BOOL_FALSE means disable
	 */
	private AreaScopeBean stAreaScope;
	/** OSD�ַ������������� * OSD text overlay area coordinates */
	private String strOSDText;
	/** OSD�ַ����������ַ��� * OSD text overlay name strings */
	private byte byRes;

	/** �����ֶ� Reserved */

	public OsdTextOverlayBean() {

	}

	public boolean isbEnableFlag() {
		return bEnableFlag;
	}

	public void setbEnableFlag(boolean bEnableFlag) {
		this.bEnableFlag = bEnableFlag;
	}

	public AreaScopeBean getStAreaScope() {
		return stAreaScope;
	}

	public void setStAreaScope(AreaScopeBean stAreaScope) {
		this.stAreaScope = stAreaScope;
	}

	public String getStrOSDText() {
		return strOSDText;
	}

	public void setStrOSDText(String strOSDText) {
		this.strOSDText = strOSDText;
	}

	public byte getByRes() {
		return byRes;
	}

	public void setByRes(byte byRes) {
		this.byRes = byRes;
	}
}
