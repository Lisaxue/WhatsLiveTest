package ugc.lehi.WhatsLive.pageObject;

import java.io.IOException;

import ugc.lehi.WhatsLive.utils.BaseAction;
import ugc.lehi.WhatsLive.utils.Locator;

public class StartPage extends BaseAction {
	// 用于eclipse工程内运行查找对象库文件路径
	private String path = "/Users/chenxuejiao/StudyDocs/Appium_study/PomWhatslive3/src/pageObjectConfig/UILibrary.yaml";

	public StartPage() {
		// 工程内读取对象库文件
		setXmlObjectPath(path);
		getLocatorMap();
	}

	/***
	 * com.letv.whatslive:id/bt_weibo
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator 微博() throws IOException {
		Locator locator = getLocator("微博");
		return locator;
	}

	/***
	 * com.letv.whatslive:id/bt_weixin
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator 微信() throws IOException {
		Locator locator = getLocator("微信");
		return locator;
	}

	/***
	 * com.letv.whatslive:id/bt_qq
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator qq() throws IOException {
		Locator locator = getLocator("qq");
		return locator;
	}
}