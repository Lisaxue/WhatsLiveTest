package ugc.lehi.WhatsLive.pageObject;

import java.io.IOException;

import ugc.lehi.WhatsLive.utils.BaseAction;
import ugc.lehi.WhatsLive.utils.Locator;

public class LoginPage extends BaseAction {
	// 用于eclipse工程内运行查找对象库文件路径
	private String path = "/Users/chenxuejiao/StudyDocs/Appium_study/PomWhatslive3/src/pageObjectConfig/UILibrary.yaml";

	public LoginPage() {
		// 工程内读取对象库文件
		setXmlObjectPath(path);
		getLocatorMap();
	}

	/***
	 * //android.widget.EditText[@text='QQ号/微信号/Email']
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator 微信账号输入框() throws IOException {
		Locator locator = getLocator("微信账号输入框");
		return locator;
	}

	/***
	 * //android.widget.EditText[@NAF='true']
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator 微信密码输入框() throws IOException {
		Locator locator = getLocator("微信密码输入框");
		return locator;
	}

	/***
	 * com.tencent.mm:id/b9r
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator 微信登录按钮() throws IOException {
		Locator locator = getLocator("微信登录按钮");
		return locator;
	}

	/***
	 * com.tencent.mobileqq:id/account
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator qq账号输入框() throws IOException {
		Locator locator = getLocator("qq账号输入框");
		return locator;
	}

	/***
	 * com.tencent.mobileqq:id/password
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator qq密码输入框() throws IOException {
		Locator locator = getLocator("qq密码输入框");
		return locator;
	}

	/***
	 * android.widget.Button
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator qq登录按钮() throws IOException {
		Locator locator = getLocator("qq登录按钮");
		return locator;
	}
}