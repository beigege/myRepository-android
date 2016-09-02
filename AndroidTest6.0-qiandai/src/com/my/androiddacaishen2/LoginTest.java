package com.my.androiddacaishen2;

import com.robotium.solo.Solo;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

@SuppressWarnings("rawtypes")
public class LoginTest extends ActivityInstrumentationTestCase2 {

	public Solo solo;
	public Activity activity;
//	private static Class<?> launchActivityClass;
	private static Class launchActivityClass;
	// ��Ӧre-sign.jar���ɳ�������Ϣ���������ֵ
	private static String mainActiviy = "cn.net.dacaishencom.qiandai.xqd.MainActivity";
	private static String packageName = "cn.net.dacaishen";

	static {
		try {
			launchActivityClass = Class.forName(mainActiviy);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public LoginTest() {
		super(packageName, launchActivityClass);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.activity = this.getActivity();
		// this.solo = new Solo(getInstrumentation(), getActivity());
		solo = new Solo(getInstrumentation(), getActivity());
	}

	public void testLoginWithIncorrentUsernameAndPassword() throws Exception {
		wait(5000);
		// �����
		 solo.waitForActivity("MainActivity", 30000);
//		assertTrue("�޷�����������", solo.waitForActivity("MainActivity", 30000));
        solo.sleep(5000);
	}

	@Override
	public void tearDown() throws Exception {
		try {
			this.solo.finishOpenedActivities();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		this.activity.finish();
		super.tearDown();
	}

}
