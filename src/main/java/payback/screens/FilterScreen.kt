package payback.screens

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import payback.common.MobileUtility

class FilterScreen(private val _driver: AppiumDriver<MobileElement>) : MobileUtility() {

    init {
        PageFactory.initElements(AppiumFieldDecorator(_driver), this)
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.ImageView")
    var dmMostPopularCoupon: MobileElement? = null

    fun clickOnDmCouponFromMostPopularCoupons() {
        mobileElementClick(dmMostPopularCoupon!!)
    }
}