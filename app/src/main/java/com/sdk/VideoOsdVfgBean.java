package com.sdk;


import java.util.Arrays;
import java.util.List;

/**
 * @struct tagNETDEVOsdCfgInfo
 * @brief ͨ��OSD�Ļ���������Ϣ Basic channel OSD information
 * @attention
 */
public class VideoOsdVfgBean {
	private OsdTimeBean stTimeOSD; /*
									 * ͨ����ʱ��OSD��Ϣ Information of channel time
									 * OSD
									 */
	private OsdTextOverlayBean stNameOSD; /*
										 * ͨ��������OSD��Ϣ Information of channel
										 * name OSD
										 */
	private int iTextNum; /* �ַ�OSD���� Text OSD number */
	private List<OsdTextOverlayBean> lstTextOverlay; /*
													 * ͨ��OSD�ַ�������Ϣ Information
													 * of channel OSD text
													 * overlay
													 */

	public VideoOsdVfgBean() {

	}

	public OsdTimeBean getStTimeOSD() {
		return stTimeOSD;
	}

	public void setStTimeOSD(OsdTimeBean stTimeOSD) {
		this.stTimeOSD = stTimeOSD;
	}

	public OsdTextOverlayBean getStNameOSD() {
		return stNameOSD;
	}

	public void setStNameOSD(OsdTextOverlayBean stNameOSD) {
		this.stNameOSD = stNameOSD;
	}

	public int getiTextNum() {
		return iTextNum;
	}

	public void setiTextNum(int iTextNum) {
		this.iTextNum = iTextNum;
	}

	public List<OsdTextOverlayBean> getAstTextOverlay() {
		return lstTextOverlay;
	}

	public void setLstTextOverlay(List<OsdTextOverlayBean> lstTextOverlay) {
		this.lstTextOverlay = lstTextOverlay;
	}

	public void setArrayLstTextOverlay(OsdTextOverlayBean[] lstTextOverlay) {
		this.lstTextOverlay = Arrays.asList(lstTextOverlay);
	}
}
