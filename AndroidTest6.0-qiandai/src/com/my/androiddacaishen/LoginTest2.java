/*
 * This is an example test project created in Eclipse to test NotePad which is a sample 
 * project located in AndroidSDK/samples/android-11/NotePad
 * 
 * 
 * You can run these test cases either on the emulator or on device. Right click
 * the test project and select Run As --> Run As Android JUnit Test
 * 
 * @author Renas Reda, renas.reda@robotium.com
 * 
 */

package com.my.androiddacaishen;

import com.robotium.solo.By;
import com.robotium.solo.Solo;
import com.robotium.solo.WebElement;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;



@SuppressWarnings("rawtypes")
public class LoginTest2 extends ActivityInstrumentationTestCase2{

	private Solo solo;
	private static Class launchActivityClass;
	static{
		try {
			launchActivityClass = Class.forName("cn.net.dacaishencom.qiandai.xqd.MainActivity");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	public LoginTest2() {
		super(launchActivityClass);

	}

	@Override
	public void setUp() throws Exception {
		//setUp() is run before a test case is started. 
		//This is where the solo object is created.
		super.setUp();
//		solo = new Solo(getInstrumentation(), getActivity());//用这个报错
		solo = new Solo(getInstrumentation());//用这个需要手动把应用程序界面先打开来
	}

	@Override
	public void tearDown() throws Exception {
		//tearDown() is run after a test case has finished. 
		//finishOpenedActivities() will finish all the activities that have been opened during the test execution.
		solo.takeScreenshot(getName(), 100);
		solo.finishOpenedActivities();
	}

	public void testLogin() throws Exception {
		Thread.sleep(3000);
//		solo.unlockScreen();
//		solo.waitForActivity("MainActivity", 30000);
//		assertTrue("无法启动启动类", solo.waitForActivity("MainActivity", 30000));
		EditText username = (EditText)(solo.getView("et_phone"));
		solo.enterText(username, "18810096546");//et_pwd\btn_login
		EditText pwd = (EditText)(solo.getView("et_pwd"));
		solo.enterText(pwd, "qwe123");
        solo.sleep(2000);
        solo.clickOnButton("登录");
        solo.sleep(2000);
        
//        WebElement s = solo.getWebElement(By.id("tv_swipe_payment"), 0);
        solo.clickOnWebElement(solo.getWebElement(By.id("tv_swipe_payment"), 0));
//        solo.clickOnText("刷卡收款");
//        TextView shuaka = (TextView)solo.getView("tv_swipe_payment");
//        shuaka.callOnClick();
	}
	

//	@Override
//    public MyActivity getActivity() {
//        if (mActivity == null) {
//            Intent intent = new Intent(getInstrumentation().getTargetContext(), MyActivity.class);
//            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            // register activity that need to be monitored.
//            monitor = getInstrumentation().addMonitor(MyActivity.class.getName(), null, false);
//            getInstrumentation().getTargetContext().startActivity(intent);
//            mActivity = (MyActivity) getInstrumentation().waitForMonitor(monitor);
//            setActivity(mActivity);
//        }
//        return mActivity;
//    }

}
