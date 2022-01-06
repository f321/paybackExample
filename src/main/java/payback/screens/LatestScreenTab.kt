package payback.screens

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory
import payback.common.MobileUtility

class LatestScreenTab(private val _driver: AppiumDriver<MobileElement>) : MobileUtility() {


    init {
        PageFactory.initElements(AppiumFieldDecorator(_driver), this)
    }
}