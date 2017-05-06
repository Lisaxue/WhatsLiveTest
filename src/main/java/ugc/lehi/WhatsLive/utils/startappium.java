package ugc.lehi.WhatsLive.utils;

import java.io.IOException;

public class startappium {

	Process p;
	// Set path of your node.exe file.
	String nodePath = "/usr/local/bin/node";
	// Set path of your appium.js file.
	String appiumJSPath = "/Applications/Appium.app/Contents/Resources/node_modules/appium/build/lib/main.js"
			+ " --address 127.0.0.1" + " --port 4723";
	String cmd = nodePath + " " + appiumJSPath;

	// kill appium node after end of your execution
	String[] command = { "/usr/bin/killall", "-9", "node" };

	public void appiumStart() throws IOException, InterruptedException {
		// Execute command string to start appium server.
		System.out.println("启动命令：" + cmd);
		p = Runtime.getRuntime().exec(cmd);

		// Provide wait time of 10 mins to start appium server properly.
		// If face any eÏrror(Could not start a new session...) then Increase
		// this time to 15 or 20 mins.
		Thread.sleep(10000);
		if (p != null) {
			System.out.println("--Appium server Is started now.");
		}
	}

	// This method Is responsible for stopping appium server.
	public void appiumStop() throws IOException {
		try {
			Runtime.getRuntime().exec(command);
			System.out.println("Appium server stopped.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (p != null) {
			p.destroy();
		}
		System.out.println("--Appium server Is stopped now.");
	}
}
