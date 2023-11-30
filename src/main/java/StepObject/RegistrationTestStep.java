package StepObject;
import PageObject.RegistrationTestPage;
import io.qameta.allure.*;

import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationTestStep extends RegistrationTestPage {

    //Positive Registration
    @Step("რეგისტრაცია/ავტორიზაციის ღილაკზე დაკლიკება")
    public RegistrationTestStep clickOnSignInRegBtn() {
        SignRegBtn.click();
        return this;
    }
    @Step("რეგისტრაციაზე გადასვლა")
    public RegistrationTestStep goToRegPage() {
        regBtn.click();
        return this;
    }
    @Step("სწორი იმეილის ჩაწერა მნიშვნელობით : {randomEmail}")
    public RegistrationTestStep fillEmailInput(String randomEmail) {
        emailInput.setValue(randomEmail);
        return this;
    }
    @Step("პაროლის ჩაწერა მნიშვნელობით : {password}")
    public RegistrationTestStep fillPasswordInput(String password) {
        passwordInput.setValue(password);
        return this;
    }
    @Step("პაროლის გამეორების ჩაწერა მნიშვნელობით : {confirmPassword}")
    public RegistrationTestStep fillConfirmPasswordInput(String confirmPassword) {
        confirmPasswordInput.setValue(confirmPassword);
        return this;
    }
    @Step("სახელის ჩაწერა მნიშვნელობით : {randomName}")
    public RegistrationTestStep fillFirstNameInput(String randomName) {
        firstNameInput.setValue(randomName);
        return this;
    }
    @Step("გვარის ჩაწერა მნიშვნელობით : {randomlastName}")
    public RegistrationTestStep fillLastNameInput(String randomlastName) {
        lastNameInput.setValue(randomlastName);
        return this;
    }
    @Step("რეგისტრაციის ღილაკზე დაკლიკება")
    public RegistrationTestStep clickRegistrationBtn() {
        signUpBtn.click();
        return this;
    }


//Negative Registration

    @Step("რეგისტრაციის და ავტორიზაციის ღილაკზე დაკლიკება")
    public RegistrationTestStep negativeClickOnSignInRegBtn() {
        SignRegBtn.click();
        return this;
    }
    @Step("რეგისტრაციის გვერდზე გადასვლა")
    public RegistrationTestStep negativeGoToRegPage() {
        regBtn.click();
        return this;
    }
    @Step("არასწორი მეილის ჩაწერა მნიშვნელობით : {negativeEmail}")
    public RegistrationTestStep negativeFillEmailInput(String negativeEmail) {
        emailInput.setValue(negativeEmail);
        return this;
    }
    @Step("პაროლის ჩაწერა მნიშვნელობით : {password}")
    public RegistrationTestStep negativeFillPasswordInput(String password) {
        passwordInput.setValue(password);
        return this;
    }
    @Step("არასწორი პაროლის ჩაწერა მნიშვნელობით : {negativeConfirmPassword}")
    public RegistrationTestStep negativeFillConfirmPasswordInput(String negativeConfirmPassword) {
        confirmPasswordInput.setValue(negativeConfirmPassword);
        return this;
    }
    @Step("სახელის გამოტოვება მნიშვნელობით : {negativeFirstname}")
    public RegistrationTestStep negativeFillFirstNameInput(String negativeFirstname) {
        firstNameInput.setValue(negativeFirstname);
        return this;
    }
    @Step("გვარის გამოტოვება მნიშვნელობით : {negativeLastname}")
    public RegistrationTestStep negativeFillLastNameInput(String negativeLastname) {
        lastNameInput.setValue(negativeLastname);
        return this;
    }
    @Step("რეგისტრაციის ღილაკზე დაკლიკება")
    public RegistrationTestStep negativeClickRegistrationBtn() {
        signUpBtn.click();
        return this;
    }
//Sign in Test
    @Step("რეგისტრაციის და ავტორიზაციის ღილაკზე დაკლიკება")
    public RegistrationTestStep clickOnRegSignBtn (){
        SignRegBtn.click();
        return this;
    }
    @Step("სწორი მეილის ჩაწერა მნიშვნელობით : {randomEmail}")
    public RegistrationTestStep fillSignInEmail (String randomEmail){
        loginEmailInput.setValue(randomEmail);
        return this;
    }
    @Step("სწორი პაროლის ჩაწერა  მნიშვნელობით : {loginPassword}")
    public RegistrationTestStep fillSignInPassword (String loginPassword){
        loginPasswordInput.setValue(loginPassword);
        return this;
    }
    @Step("ავტორიზაციის ღილაკზე დაკლიკება")
    public RegistrationTestStep clickSignInBtn(){
        signInBtn.click();
        return this;
    }
//Negative Sign in Test
    @Step("არასწორი მეილის ჩაწერა მნიშვნელობით : {negativeEmail}")
    public RegistrationTestStep negativeSignInEmail(String negativeEmail){
        loginEmailInput.setValue(negativeEmail);
        return this;
    }
    @Step("არასწორი პაროლის ჩაწერა მნიშვნელობით : {wrongLoginPassword}")
    public RegistrationTestStep negativeSignInPassword(String wrongLoginPassword){
        loginPasswordInput.setValue(wrongLoginPassword);
        return this;
    }




}