package PageObject;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationTestPage {
    public SelenideElement
            SignRegBtn = $(".ty-account-info__title-txt"),
            regBtn = $(".ty-login-reglink__a"),
            emailInput = $(byName("user_data[email]")),
            passwordInput = $("#password1"),
            confirmPasswordInput = $("#password2"),
            firstNameInput = $("#elm_6"),
            lastNameInput = $("#elm_7"),
            signUpBtn = $(byName("dispatch[profiles.update]")),
            emailErrorMessage = $("#email_error_message"),
            passwordErrorMessage = $("#password1_error_message"),
            confirmPasswordErrorMessage = $("#password2_error_message"),
            seccsessfulRegistrationMessage = $(byText("ანგარიში წარმატებით შეიქმნა.")),
            loginEmailInput = $(".name-login-input"),
            loginPasswordInput = $("#psw_popup348"),
            loginMessagePopup = $(".cm-notification-container"),
            signInBtn = $(byName("dispatch[auth.login]")),
            loginErrorPopup = $(".cm-notification-container");


}


