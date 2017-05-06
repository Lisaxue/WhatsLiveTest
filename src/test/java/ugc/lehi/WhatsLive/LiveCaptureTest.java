package ugc.lehi.WhatsLive;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ugc.lehi.WhatsLive.action.LiveAction;
import ugc.lehi.WhatsLive.pageObject.HomePage;
import ugc.lehi.WhatsLive.pageObject.LivePage;
import ugc.lehi.WhatsLive.utils.Assertion;
import ugc.lehi.WhatsLive.utils.ElementAction;
import ugc.lehi.WhatsLive.utils.TestBaseCase_Bak;

public class LiveCaptureTest extends TestBaseCase_Bak{
	
	ElementAction action = new ElementAction();
	LivePage livePage = new LivePage();
	int loopCount = 0; //循环次数
	
	@BeforeMethod
	public void initialLive() throws IOException{
		System.out.println("--------点击首页拍摄图标，发直播-----------");
		action.click(new HomePage().首页直播());
		action.sleep(1);
		driver.swipe(380, 1753, 500, 1939, 100);// 因为拍视频元素无法定位，所以根据坐标来点击		
		action.sleep(1);
	}
	
	@Test(description = "发起直播", invocationCount = 3)
	public void recordLive() throws IOException{
		new LiveAction("test");
		action.click(livePage.立即直播());
		action.sleep(40);
		action.click(livePage.关闭());	//发起直播页点击关闭按钮
		action.click(livePage.确认关闭()); //点击弹框中“关闭”按钮，确认关闭当前直播
		action.click(livePage.确定());  //直播结束页面点“确定”，回到首页面
		Assertion.VerityTextPresent("嗨秀", "是否返回至首页成功！");		
	}
	
	@AfterMethod
	public void verifyVideo(){
		if(loopCount == 3)
			log.info("－－－－发直播测试完毕－－－－");
	}
	
}