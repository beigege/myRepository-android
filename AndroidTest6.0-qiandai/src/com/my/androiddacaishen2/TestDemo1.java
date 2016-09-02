package com.my.androiddacaishen2;

import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

@SuppressWarnings("rawtypes")
public class TestDemo1 extends ActivityInstrumentationTestCase2 {

	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "cn.net.dacaishencom.qiandai.xqd.MainActivity";//启动类

    private static Class<?> launcherActivityClass;
    static{
            try {
                    launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
            } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
            }
    }
	public TestDemo1() {
		super(launcherActivityClass);
		// TODO Auto-generated constructor stub
	}
	
	private Solo solo;
    
    @Override
    protected void setUp() throws Exception {
            solo = new Solo(getInstrumentation(), getActivity());
    }


	public void testcase001() throws Exception {
		 //等待  Activity　"MainActivity"　启动
		assertTrue("无法启动启动类", solo.waitForActivity("MainActivity", 30000));
        solo.sleep(5000);
        

//      //输入文字："131243"
//        solo.enterText((EditText)solo.getView("edtInsertName"), "说些什么好呢？");
//        solo.sleep(2000);
//        
//        //清空输入框的内容
//        solo.clearEditText((EditText)solo.getView("edtInsertName"));
//        
//        
//        //按下 按钮 "绿色"
//        solo.clickOnButton("^绿色$");
//        solo.sleep(2000);
//
//        //按下 按钮 "黄色"
//        solo.clickOnButton("^黄色$");
//        solo.sleep(2000);
//
//        //按下 按钮 "蓝色"
//        solo.clickOnButton("^蓝色$");
//        solo.sleep(2000);
//
//
//        //按下 TextView "看我变变变~~~"
//        solo.clickOnText("^看我变变变~~~$");
//        solo.sleep(5000);      
        
	}
	

@Override
public void tearDown() throws Exception {
            solo.finishOpenedActivities();

}

}
