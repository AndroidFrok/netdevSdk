package com.example.netsdk_demo;
/*              Local device login process
 * 1.NetDEVSDK.NETDEV_Login() return value is glpUserID;
 * 2.if glpUserID is not equal to 0, enter live interface of NagvigationActivity;
 * */

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.sdk.AlarmCallBack_PF;
import com.sdk.AlarmMessCallBackV30;
import com.sdk.ExceptionCallBack_PF;
import com.sdk.NETDEV_DEVICE_LOGIN_INFO_S;
import com.sdk.NETDEV_SELOG_INFO_S;
import com.sdk.NetDEVSDK;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/*local device login*/
public class CLocalDevLogin extends Activity {	
	private ActionBar m_oActionBar; 
	
	private EditText m_oUsernameTxt;
	private EditText m_oPasswordTxt;
	private EditText m_oIPTxt;
	private Button m_oLocalLoginBtn;
	private Button m_oLogoutBtn;
	private Button m_oCloudLoginBtn;
	private Spinner m_oLoginDeviceTypeSpin;

	static ArrayList<String> DevIpList = new ArrayList<String>();
	static ArrayList<Long> lpUserIDList = new ArrayList<Long>();
    static boolean isLoggedVMS = false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.local_device_login);
		m_oActionBar = super.getActionBar();         
		initActionBar(); 		
		
		final NetDEVSDK oNetDemo = new NetDEVSDK();
		final AlarmCallBack_PF alarmCallback = new AlarmCallBack_PF();
		final ExceptionCallBack_PF pfExceptionCallBack = new ExceptionCallBack_PF();
		final AlarmMessCallBackV30 pfAlarmCallBackV30 = new AlarmMessCallBackV30();
		oNetDemo.NETDEV_Init();
		NetDEVSDK.NETDEV_SetT2UPayLoad(800);
		
		m_oLocalLoginBtn = (Button) findViewById(R.id.login);
		m_oLogoutBtn = (Button) findViewById(R.id.logout);
		m_oCloudLoginBtn = (Button) findViewById(R.id.cloud_device);
		m_oUsernameTxt = (EditText) findViewById(R.id.username);
		m_oPasswordTxt = (EditText) findViewById(R.id.password);
		m_oIPTxt = (EditText) findViewById(R.id.IPAddr);
		m_oLoginDeviceTypeSpin = (Spinner) findViewById(R.id.spinner_DeviceType);




		
		final Intent oIntentNagvigation = new Intent(this, CMainMenu.class);

	    /*Login device , if the login is successful, start the live interface*/
		m_oLocalLoginBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String strUserName = m_oUsernameTxt.getText().toString();
				String strPassword = m_oPasswordTxt.getText().toString();
				String strDevIP =m_oIPTxt.getText().toString();
				if( strUserName.isEmpty() || strPassword.isEmpty())
				{
					AlertDialog.Builder oBuilder = new Builder(CLocalDevLogin.this);
					oBuilder.setMessage("Account or password is empty  !");
					oBuilder.setTitle("");
					oBuilder.setPositiveButton("OK", null);
					oBuilder.show();
				}

				String strSelectDeviceType = m_oLoginDeviceTypeSpin.getSelectedItem().toString();

				NETDEV_DEVICE_LOGIN_INFO_S stDevLoginInfo = new NETDEV_DEVICE_LOGIN_INFO_S();
				NETDEV_SELOG_INFO_S stSELogInfo = new NETDEV_SELOG_INFO_S();

				stDevLoginInfo.szIPAddr = strDevIP;
				stDevLoginInfo.dwPort = 80;
				stDevLoginInfo.szUserName = strUserName;
				stDevLoginInfo.szPassword = strPassword;

				if(strSelectDeviceType.equals("VMS"))
				{
					NetDEVSDK.dwDeviceType = 1;
					stDevLoginInfo.dwLoginProto = 1;
					//stDevLoginInfo.dwDeviceType = NETDEV_DEVICE_LOGIN_INFO_S.NETDEV_DEVICE_TYPE_E.NETDEV_DTYPE_VMS;
					if (DevIpList.size()>0)
					{

						if (true == isLoggedVMS)
						{
							Toast.makeText(CLocalDevLogin.this, "Login VMS allows only one!", Toast.LENGTH_SHORT).show();
						}else{
							Toast.makeText(CLocalDevLogin.this, "Logged NVR/IPC devices, not to be allowed to login again VMS!!", Toast.LENGTH_SHORT).show();
						}

						return;
					}
				}
				if (true == isLoggedVMS)
				{
					Toast.makeText(CLocalDevLogin.this, "Logged a VMS device, not to be allowed to login again other equipment!", Toast.LENGTH_SHORT).show();
					return;
				}
				NetDEVSDK.lpUserID = NetDEVSDK.NETDEV_Login_V30(stDevLoginInfo, stSELogInfo);

				if(0 != NetDEVSDK.lpUserID)
				{
					new Thread(new Runnable() {
						@Override
						public void run() {
							oNetDemo.NETDEV_Android_SetAlarmCallBack_V30(NetDEVSDK.lpUserID, pfAlarmCallBackV30,0);
							oNetDemo.NETDEV_Android_SetExceptionCallBack(pfExceptionCallBack,0);
						}
					}).start();
					if (!DevIpList.contains(strDevIP)){
						DevIpList.add(strDevIP);
						lpUserIDList.add(NetDEVSDK.lpUserID);
						if (strSelectDeviceType.contains("VMS"))
						{
							isLoggedVMS = true;
						}
					}
					oIntentNagvigation.putStringArrayListExtra("szIP",DevIpList);
					//oIntentNagvigation.putParcelableArrayListExtra("lpUserID",lpUserIDList);
					oIntentNagvigation.putExtra("lpUserID",(Serializable) lpUserIDList);
//					oIntentNagvigation.putStringArrayListExtra("lpUserID",()lpUserIDList);
                    oIntentNagvigation.putExtra("bLocalDevFlag",true);
					oIntentNagvigation.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);//设置不要刷新将要跳到的界面
					oIntentNagvigation.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);//它可以关掉所要到的界面中间的activity
					startActivity(oIntentNagvigation);
				}else{
					AlertDialog.Builder oBuilder =new  AlertDialog.Builder(CLocalDevLogin.this);
					oBuilder.setTitle("Fail" );
					oBuilder.setMessage("Login failed, please check if the input is correct." );
					oBuilder.setPositiveButton("OK" ,  null );
					oBuilder.show();
				}
			}
			
		});
		
		/*logout device*/
		m_oLogoutBtn.setOnClickListener(new OnClickListener() 
		{
			@Override
			public void onClick(View v) {
				
				NetDEVSDK.NETDEV_Logout(NetDEVSDK.lpUserID);
				NetDEVSDK.lpUserID = 0;
				if (true == isLoggedVMS)
				{
					isLoggedVMS = false;
				}
			}
		});
		
		final Intent intentcloud = new Intent(this, CCloudLogin.class);
		/*start interface of cloud login*/ 
        m_oCloudLoginBtn.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) 
			{
					startActivity(intentcloud);	
					finish();
			}	
		});
		
		
	}

	private void initActionBar(){         
		//show Home        
		m_oActionBar.setDisplayShowHomeEnabled(false);         
		//show back button       
		m_oActionBar.setDisplayHomeAsUpEnabled(true);         
		m_oActionBar.setDisplayShowTitleEnabled(false);        
		m_oActionBar.setHomeButtonEnabled(false);  
		m_oActionBar.setDisplayUseLogoEnabled(false);
		m_oActionBar.setDisplayHomeAsUpEnabled(false); 

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cloud_login, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		
		int id = item.getItemId();
		switch ( id ) 
		{
		case android.R.id.home:
			super.onBackPressed();
			break;
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	protected void onDestroy()
	{
		super.onDestroy();
	}
	
	/*** return key */
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) 
	{  // TODO Auto-generated method stub  
		if(keyCode == KeyEvent.KEYCODE_BACK)
		{
			if (DevIpList.isEmpty()){
				exitBy2Click(); //exit application after double click
			}else {
				if(keyCode == KeyEvent.KEYCODE_BACK){
					CLocalDevLogin.this.finish();
				}
				return super.onKeyDown(keyCode, event);
			}
		}
			return false; 
	} 
	/**  *function of exit after 2 click  */
	private static Boolean isExit = false;   
	private void exitBy2Click() 
	{  
		Timer tExit = null;  
		if (isExit == false) 
		{  
			isExit = true; 
			// prepare exiting 
			Toast.makeText(this, "Press again to exit the app", Toast.LENGTH_SHORT).show();  
			tExit = new Timer();  
			tExit.schedule(new TimerTask() {   
				@Override 
				public void run() {   
					isExit = false; // cancel exit   
				}  
				}, 2000); // If the return key is not pressed for 2 seconds, the timer is started to cancel the task that was just executed
		}
		else 
		{  
			finish();  

			System.exit(0); 
		}
	} 

}
