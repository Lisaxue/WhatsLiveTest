package ugc.lehi.WhatsLive;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ugc.lehi.WhatsLive.pageObject.HomePage;
import ugc.lehi.WhatsLive.pageObject.VideoPage;
import ugc.lehi.WhatsLive.utils.Assertion;
import ugc.lehi.WhatsLive.utils.ElementAction;
import ugc.lehi.WhatsLive.utils.TestBaseCase_Bak;

public class VideoCaptureTest extends TestBaseCase_Bak {

	ElementAction action = new ElementAction();
	VideoPage videoPage = new VideoPage();
	int loopCount = 0; // 循环次数

	// 每次录制视频，先点击首页拍摄图标
	@BeforeMethod
	public void initialVideo() throws IOException {
		System.out.println("--------点击首页拍摄图标，拍视频-----------");
		action.click(new HomePage().首页直播());
		action.sleep(1);
		driver.swipe(917, 1753, 1000, 1939, 100);// 因为拍视频元素无法定位，所以根据坐标来点击
		// driver.swipe(711, 1341, 815, 1478, 100);//
		action.sleep(1);
	}

	@Test(description = "拍视频", invocationCount = 3)
	public void recordVideo() throws IOException {
		action.click(videoPage.拍视频()); // 设置检查点
		action.sleep(5);
		action.click(videoPage.结束拍摄());
		action.sleep(2);

		action.click(videoPage.发布());
		action.sleep(3);

		action.click(videoPage.草稿箱返回());
		action.sleep(2);

		// action.click(videoPage.个人中心页返回());
		// action.sleep(2);
		Assertion.VerityTextPresent("嗨秀", "是否返回至首页成功！");
		loopCount++;

	}

	@AfterMethod
	public void verifyVideo() {
		if (loopCount == 3)
			log.info("－－－－拍视频测试完毕－－－－");
	}
}
