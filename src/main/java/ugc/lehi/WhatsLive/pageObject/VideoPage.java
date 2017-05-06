package ugc.lehi.WhatsLive.pageObject;

import java.io.IOException;

import ugc.lehi.WhatsLive.utils.BaseAction;
import ugc.lehi.WhatsLive.utils.Locator;

public class VideoPage extends BaseAction {
	// 用于eclipse工程内运行查找对象库文件路径
	private String path = "/Users/chenxuejiao/StudyDocs/Appium_study/PomWhatslive3/src/pageObjectConfig/UILibrary.yaml";

	public VideoPage() {
		// 工程内读取对象库文件
		setXmlObjectPath(path);
		getLocatorMap();
	}

	/***
	 * com.letv.whatslive:id/video_recorder_iv
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator 拍视频() throws IOException {
		Locator locator = getLocator("拍视频");
		return locator;
	}

	/***
	 * com.letv.whatslive:id/video_recorder_stop_iv
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator 结束拍摄() throws IOException {
		Locator locator = getLocator("结束拍摄");
		return locator;
	}

	/***
	 * com.letv.whatslive:id/setlive_broadcast
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator 发布() throws IOException {
		Locator locator = getLocator("发布");
		return locator;
	}

	/***
	 * com.letv.whatslive:id/title_left_btn
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator 草稿箱返回() throws IOException {
		Locator locator = getLocator("草稿箱返回");
		return locator;
	}

	/***
	 * com.letv.whatslive:id/user_center_back_ll
	 * 
	 * @return
	 * @throws IOException
	 */
	public Locator 个人中心页返回() throws IOException {
		Locator locator = getLocator("个人中心页返回");
		return locator;
	}
}