import StepObject.CartTestStep;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.CartTestData.*;
import static com.codeborne.selenide.Selenide.*;


public class AltaCartTest extends ChromeRunner {
    CartTestStep cartTestStep = new CartTestStep();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("ნივთების დამატება კალათაში და შემოწმება რომ ნამდვილად დაემატა")
    public void addingItemsToCart() {
        cartTestStep
                .acceptCookies()
                .loginToAlta(loginEmail, loginPassword)
                .clickOnNotebooks()
                .chooseProduct1()
                .chooseProduct2()
                .goToMainCart()
                .checkCartHasItems();
        Assert.assertTrue(cartTestStep.checkCartHasItems() > 0);
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("ნივთების წაშლა კალათიდან და შემოწმება რომ ნამდვილად წაიშალა")
    public void clearingItemsFromCart() {
        cartTestStep
                .acceptCookies()
                .loginToAlta(loginEmail, loginPassword)
                .clickOnNotebooks()
                .chooseProduct1()
                .goToMainCart()
                .clearCart()
                .checkQuantity();
        Assert.assertTrue(cartTestStep.checkQuantity() < 1);
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("არასწორი პრომო კოდის გამოყენება")
    public void wrongPromoCodeTest() {
        cartTestStep
                .acceptCookies()
                .loginToAlta(loginEmail, loginPassword)
                .clickOnNotebooks()
                .chooseProduct1()
                .goToMainCart()
                .fillPromoCode(wrongPromoCode);
        sleep(2000);
        Assert.assertTrue(cartTestStep.promoCodeErrorMessage.is(Condition.visible));
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("კალათის საერთო ღირებულების შემოწმება")
    public void checkCartSubTotal() {
        cartTestStep
                .acceptCookies()
                .loginToAlta(loginEmail, loginPassword)
                .clickOnNotebooks()
                .chooseProduct1()
                .goToMainCart()
                .checkSubTotalPrice();
    }



    }


