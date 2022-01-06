package payback.screens

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import payback.common.MobileUtility

class CustomerIdCardScreen(private val _driver: AppiumDriver<MobileElement>) : MobileUtility() {

    init {
        PageFactory.initElements(AppiumFieldDecorator(_driver), this)
    }

    @FindBy(xpath = "//android.widget.Button")
    var proceedButton: MobileElement? = null

    @FindBy(xpath = "//android.widget.EditText")
    var cardIdInput: MobileElement? = null


    fun typeCardIdAndHitProceedExpectingPasswordPage(cardId: String) {
        mobileElementClick(cardIdInput!!)
        typeText(cardIdInput!!, cardId)
        mobileElementClick(proceedButton!!)
    }

}