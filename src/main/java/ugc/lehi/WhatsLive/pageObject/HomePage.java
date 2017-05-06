package ugc.lehi.WhatsLive.pageObject;

import java.io.IOException;

import ugc.lehi.WhatsLive.utils.BaseAction;
import ugc.lehi.WhatsLive.utils.Locator;

public class HomePage extends BaseAction {
	// 用于eclipse工程内运行查找对象库文件路径
	private String path = "/Users/chenxuejiao/StudyDocs/Appium_study/PomWhatslive3/src/pageObjectConfig/UILibrary.yaml";

	public HomePage() {
		// 工程内读取对象库文件
		setXmlObjectPath(path);
		getLocatorMap();
	}

	/***
	 * com.letv.whatslive:id/main_home
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator 首页() throws IOException {
		Locator locator = getLocator("首页");
		return locator;
	}

	/***
	 * com.letv.whatslive:id/main_square
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator 广场() throws IOException {
		Locator locator = getLocator("广场");
		return locator;
	}

	/***
	 * com.letv.whatslive:id/main_occupied
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator 首页直播() throws IOException {
		Locator locator = getLocator("首页直播");
		return locator;
	}

	/***
	 * com.letv.whatslive:id/location_tv
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator 位置() throws IOException {
		Locator locator = getLocator("位置");
		return locator;
	}

	/***
	 * com.letv.whatslive:id/live_flag
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator 直播() throws IOException {
		Locator locator = getLocator("直播");
		return locator;
	}

	/***
	 * com.letv.whatslive:id/chatview_voice
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator 直播语音() throws IOException {
		Locator locator = getLocator("直播语音");
		return locator;
	}
}