package ugc.lehi.WhatsLive.utils;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;

/*
 * @2017.01.16  by cxj
 * setUp() 初始化session
 * endUp() 关闭session
 * appiumStart()  启动server
 * appiumStop()   停止server
 * */
public class TestBaseCase_Bak {
	// public AndroidDriver<WebElement> driver;
	public static AndroidDriver<WebElement> driver;
	public Log log = new Log(this.getClass().getSuperclass());

	@BeforeTest
	public void startAppium() throws ExecuteException, IOException, InterruptedException {
		CommandLine command2 = new CommandLine("/usr/bin/killall");
		command2.addArgument("-9", false);
		command2.addArgument("node", false);

		CommandLine command = new CommandLine("/usr/local/bin/node");
		command.addArgument("/Applications/Appium.app/Contents/Resources/node_modules/appium/build/lib/main.js", false);
		// command.addArgument("--address", false);
		// command.addArgument("127.0.0.1");
		// command.addArgument("--port", false);
		// command.addArgument("4723");
		// command.addArgument("--no-reset", false);

		System.out.println(command.toString());
		DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(1);
		// executor.execute(command2, resultHandler);
		executor.execute(command, resultHandler);
		Thread.sleep(50000);
		System.out.println("Appium Server starting");
	}

	@Parameters({ "platformName", "deviceName", "sdkVersion", "appMainPackage", "appActivity" })
	@BeforeMethod
	public void setUp(String platformName, String deviceName, String sdkVersion, String appMainPackage,
			String appActivity) throws IOException, InterruptedException {

		log.info("------------------开始执行测试---------------");

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", deviceName); // 设备名称乐max2
		capabilities.setCapability("platformName", platformName); // 手机平台
		capabilities.setCapability("platformVersion", sdkVersion); // 手机平台
		capabilities.setCapability("appPackage", appMainPackage); // app包名
		capabilities.setCapability("appActivity", appActivity); // app启动方法

		// Created object of AndroidDriver will all set capabilities.
		// Set appium server address and port number in URL string.
		// It will launch app in android device.
		System.out.println("---Set appium server address and port number");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// WebDriverWait wait = new WebDriverWait(driver, 300);
		// wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.ImageView")));
	}

	@AfterTest
	public void endUp() throws IOException {
		driver.quit();
		log.info("－－－－－－－－结束测试－－－－－－－－－－－");
	}

}
