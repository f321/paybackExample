package payback.common;

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.MalformedURLException
import java.net.URL

open class TestBase {
    var driver: AppiumDriver<MobileElement>? = null

    fun setUpPhoneApp() {
        val capabilities = DesiredCapabilities()

        capabilities.setCapability("deviceName", "Android_f");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("appPackage", "de.payback.client.android");
        capabilities.setCapability("appActivity", "de.payback.app.deeplinks.StarterActivity");
        try {
            var url = URL("http:///127.0.0.1:4723/wd/hub");

            driver = AppiumDriver<MobileElement>(url, capabilities);

        } catch (e: MalformedURLException) {
            e.printStackTrace();
        }
    }

}
