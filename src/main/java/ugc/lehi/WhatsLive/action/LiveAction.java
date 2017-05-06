package ugc.lehi.WhatsLive.action;

import java.io.IOException;

import ugc.lehi.WhatsLive.pageObject.LivePage;
import ugc.lehi.WhatsLive.utils.ElementAction;

public class LiveAction {

	public LiveAction(String tittle) throws IOException {
		ElementAction action = new ElementAction();
		LivePage livePage = new LivePage();

		// 设置直播标题
		action.click(livePage.标题());
		action.clear(livePage.标题());
		action.type(livePage.标题(), tittle);

		// 拍摄封面
		// action.click(livePage.拍摄封面());

		// 设置直播为私密
		action.click(livePage.私密());

	}

}