package payback.common

import io.appium.java_client.MobileElement
import org.openqa.selenium.support.ui.ExpectedConditions
import java.lang.Exception

open class MobileUtility {

    fun waitToBeVisibleElement(element: MobileElement) {
        ExpectedConditions.visibilityOf(element)
    }

    fun mobileElementClick(element: MobileElement) {
        waitToBeVisibleElement(element)
        element.click()
    }

    fun typeText(element: MobileElement, text: String) {
        waitToBeVisibleElement(element)
        element.sendKeys(text)
    }

    fun pause(millis: Long) {
        try {
            Thread.sleep(millis)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

}