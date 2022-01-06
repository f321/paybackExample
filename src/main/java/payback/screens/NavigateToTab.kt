package payback.screens

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import payback.common.MobileUtility

class NavigateToTab(private val _driver: AppiumDriver<MobileElement>) : MobileUtility() {


    init {
        PageFactory.initElements(AppiumFieldDecorator(_driver), this)
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='Aktuell']")
    var latestTabButton: MobileElement? = null

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='Coupons']")
    var couponsTabButton: MobileElement? = null

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='Online Shops']")
    var onlineShopsTabButton: MobileElement? = null

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='Services']")
    var servicesTabButton: MobileElement? = null

    fun navigateToCouponsTab() {
        waitToBeVisibleElement(servicesTabButton!!)
        mobileElementClick(couponsTabButton!!)
    }

}