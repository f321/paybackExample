package payback.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import payback.common.MobileUtility

class PasswordScreen(private val _driver: AppiumDriver<MobileElement>) : MobileUtility() {

    init {
        PageFactory.initElements(AppiumFieldDecorator(_driver), this)
    }

    @FindBy(xpath = "//android.widget.Button")
    var proceedLoginButton: MobileElement? = null

    @FindBy(xpath = "//android.widget.EditText")
    var passwordInput: MobileElement? = null


    fun typePasswordAndLogin(password: String) {
        mobileElementClick(passwordInput!!)
        typeText(passwordInput!!, password)
        mobileElementClick(proceedLoginButton!!)
        pause(3000L)
    }
}
