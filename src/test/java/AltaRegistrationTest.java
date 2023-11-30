import StepObject.RegistrationTestStep;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.RegistrationTestData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class AltaRegistrationTest extends ChromeRunner {
    RegistrationTestStep registrationStep = new RegistrationTestStep();
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("ავტორიზაცია სწორი მონაცემებით")
    public void loginTest (){
        registrationStep
                .clickOnSignInRegBtn()
                .fillSignInEmail(loginEmail)
                .fillSignInPassword(loginPassword)
                .clickSignInBtn();
        sleep(2000);
        Assert.assertTrue(registrationStep.loginMessagePopup.exists());
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("ავტორიზაცია არასწორი მონაცემებით")
    public void negativeLoginTest(){
        registrationStep
                .clickOnRegSignBtn()
                .negativeSignInEmail(negativeEmail)
                .negativeSignInPassword(wrongLoginPassword)
                .clickSignInBtn();
        Assert.assertTrue(registrationStep.loginErrorPopup.exists());
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("რეგისტრაცია სწორი მონაცემებით")
    public void positiveRegistrationCheck(){
        registrationStep
                .clickOnSignInRegBtn()
                .goToRegPage()
                .fillEmailInput(randomEmail)
                .fillPasswordInput(password)
                .fillConfirmPasswordInput(confirmPassword)
                .fillFirstNameInput(randomName)
                .fillLastNameInput(randomlastName)
                .clickRegistrationBtn();
        Assert.assertFalse(registrationStep.signUpBtn.is(Condition.enabled));
        Assert.assertTrue(registrationStep.seccsessfulRegistrationMessage.is(Condition.visible));
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("რეგისტრაცია არასწორი მონაცემებით")
    public void negativeRegistrationCheck(){
        registrationStep
                .negativeClickOnSignInRegBtn()
                .negativeGoToRegPage()
                .negativeFillEmailInput(negativeEmail)
                .negativeFillPasswordInput(negativePassword)
                .negativeFillConfirmPasswordInput(negativeConfirmPassword)
                .negativeFillFirstNameInput(negativeFirstname)
                .negativeFillLastNameInput(negativeLastname)
                .negativeClickRegistrationBtn();
        Assert.assertTrue(registrationStep.emailErrorMessage.is(Condition.visible));
        Assert.assertTrue(registrationStep.confirmPasswordErrorMessage.is(Condition.visible));
        Assert.assertTrue(registrationStep.passwordErrorMessage.is(Condition.visible));


    }

}

