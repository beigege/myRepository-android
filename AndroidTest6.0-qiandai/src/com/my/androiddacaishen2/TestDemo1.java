package com.my.androiddacaishen2;

import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

@SuppressWarnings("rawtypes")
public class TestDemo1 extends ActivityInstrumentationTestCase2 {

	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "cn.net.dacaishencom.qiandai.xqd.MainActivity";//������

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
		 //�ȴ�  Activity��"MainActivity"������
		assertTrue("�޷�����������", solo.waitForActivity("MainActivity", 30000));
        solo.sleep(5000);
        

//      //�������֣�"131243"
//        solo.enterText((EditText)solo.getView("edtInsertName"), "˵Щʲô���أ�");
//        solo.sleep(2000);
//        
//        //�������������
//        solo.clearEditText((EditText)solo.getView("edtInsertName"));
//        
//        
//        //���� ��ť "��ɫ"
//        solo.clickOnButton("^��ɫ$");
//        solo.sleep(2000);
//
//        //���� ��ť "��ɫ"
//        solo.clickOnButton("^��ɫ$");
//        solo.sleep(2000);
//
//        //���� ��ť "��ɫ"
//        solo.clickOnButton("^��ɫ$");
//        solo.sleep(2000);
//
//
//        //���� TextView "���ұ���~~~"
//        solo.clickOnText("^���ұ���~~~$");
//        solo.sleep(5000);      
        
	}
	

@Override
public void tearDown() throws Exception {
            solo.finishOpenedActivities();

}

}
