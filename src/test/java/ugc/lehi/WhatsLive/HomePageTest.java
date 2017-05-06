package ugc.lehi.WhatsLive;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ugc.lehi.WhatsLive.pageObject.HomePage;
import ugc.lehi.WhatsLive.utils.Assertion;
import ugc.lehi.WhatsLive.utils.ElementAction;
import ugc.lehi.WhatsLive.utils.TestBaseCase_Bak;

public class HomePageTest extends TestBaseCase_Bak {

	ElementAction action = new ElementAction();

	// 首页－广场页切换操作
	@Test(description = "首页面切换")
	public void switchHomePage() throws InterruptedException, IOException {
		HomePage homePage = new HomePage();

		// 点击广场图标
		// action.click(new HomePage().广场());
		action.click(homePage.广场());
		// action.applyStyle(homePage.广场());
		action.sleep(3);
		// 设置检查点
		Assertion.VerityTextPresent("24h轮播", "验证是否切换至广场页面成功！");
		// action.click(new HomePage().首页());
		action.click(homePage.首页());
		action.sleep(3);

		/* add on 2017.02.23 */
		// action.click(new HomePage().直播());
		action.click(homePage.直播());
		action.sleep(3);
		// 选中“按住说话”按钮图标
		WebElement el = driver.findElement(By.id("com.letv.whatslive:id/chatview_voice"));
		;
		int elx = el.getLocation().x; // 获取按钮的x坐标
		int ely = el.getLocation().y; // 获取按钮的y坐标
		System.out.println("elx:" + elx);
		System.out.println("ely:" + ely);
		driver.swipe(elx, ely, elx, ely, 10000);
		action.sleep(1);

		// 设置断言。判断用例是否失败
		Assertion.VerityError();
		log.info("--首页面切换结束--");
	}

	// @Test(description = "首页水平左滑", groups = "homepage")
	public void swipeToLeft() throws IOException {
		//
		for (int i = 0; i < 3; i++) {
			if (action.isElementDisplayed(new HomePage().位置())) {// 若地理位置元素显示，表明列表元素加载成功，再执行左滑操作
				action.swipeToDown(driver, 200); // 下拉刷新
				action.sleep(2);
				action.swipeToLeft(driver, 200); // 向左滑动
			} else// 若页面未加载完，等待两秒
				action.sleep(2);
		}
		action.sleep(3);

		// 设置断言。判断用例是否失败
		Assertion.VerityError();
		log.info("--首页水平左滑结束--");
	}
}
