package payback.screens

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import payback.common.MobileUtility

class CouponsScreenTab(private val _driver: AppiumDriver<MobileElement>) : MobileUtility() {

    init {
        PageFactory.initElements(AppiumFieldDecorator(_driver), this)
    }

    @FindBy(xpath = "//android.widget.LinearLayout[contains(@content-desc,'Nicht aktiviert')]")
    var notActivatedCoupons: MobileElement? = null

    @FindBy(xpath = "//android.widget.LinearLayout[contains(@content-desc,'Aktiviert')]")
    var activatedCoupons: MobileElement? = null

    @FindBy(id = "info_icon")
    var activateCouponsList: MutableList<MobileElement>? = null


    @FindBy(id = "filter_button")
    var filterButton: MobileElement? = null

    fun goToActivatedCoupons() {

        mobileElementClick(activatedCoupons!!)
    }

    fun goToNotActivatedCoupons() {
        mobileElementClick(notActivatedCoupons!!)
    }

    fun goToFilterScreen() {
        mobileElementClick(filterButton!!)
    }


    fun clickOnCouponDetailInSpecificOrder(order: Int) {
        mobileElementClick(activateCouponsList!![order - 1])
    }

}