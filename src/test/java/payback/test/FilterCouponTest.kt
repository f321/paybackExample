package payback.test;

import org.junit.After
import org.junit.Before;
import org.junit.Test;
import payback.Constants
import payback.common.TestBase;
import payback.screens.*

class FilterCouponTest : TestBase() {

    @Before
    fun setUp() {
        setUpPhoneApp()
    }

    @Test
    fun filterCoupon() {


        var landingScreen: LandingScreen = LandingScreen(super.driver!!)

        landingScreen.clickOnLoginButtonExpectingCustomerIdCardPage()

        var customerIdCardScreen: CustomerIdCardScreen = CustomerIdCardScreen(super.driver!!)

        customerIdCardScreen!!.typeCardIdAndHitProceedExpectingPasswordPage(Constants.CUSTOMER_CARD_ID)

        var passScreen: PasswordScreen = PasswordScreen(driver!!)

        passScreen.typePasswordAndLogin(Constants.PASSWORD)

        driver!!.navigate().back()

        var navigateToTab: NavigateToTab = NavigateToTab(driver!!)

        navigateToTab.navigateToCouponsTab()

        var couponScreenTab: CouponsScreenTab = CouponsScreenTab(driver!!)

        couponScreenTab.goToFilterScreen()

        var filterScreen: FilterScreen = FilterScreen(driver!!)

        filterScreen.clickOnDmCouponFromMostPopularCoupons()

        var newCouponScreen: CouponsScreenTab = CouponsScreenTab(driver!!)

        newCouponScreen.clickOnCouponDetailInSpecificOrder(1)

        var couponDetail: CouponDetail = CouponDetail(driver!!)

        couponDetail.activateCoupon()



    }

    @After
    fun tearDown() {
        driver!!.quit()
    }
}