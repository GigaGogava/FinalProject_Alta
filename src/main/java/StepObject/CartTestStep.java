package StepObject;
import PageObject.CartTestPage;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.*;
public class CartTestStep extends CartTestPage {

//კალათაში ნივთების დამატება
    @Step("ავტორიზაცია სწორი მონაცემებით : {loginEmail}, {loginPassword}")
    public CartTestStep loginToAlta(String loginEmail,String loginPassword) {
        SignRegBtn.click();
        loginEmailInput.setValue(loginEmail);
        loginPasswordInput.setValue(loginPassword);
        signInBtn.click();
        return this;
    }


    @Step("ლეპტოპების არჩევა")
    public CartTestStep clickOnNotebooks() {
        chooseNotebooks.click();
        return this;
    }
    @Step
    public CartTestStep acceptCookies(){
        acceptCookies.click();
        return this;
    }
    @Step("პროდუქტის არჩევა_1")
    public CartTestStep chooseProduct1(){
        chooseItem1.click();
        item1AddToCart.click();
        Selenide.back();
        return this;
    }
    @Step("პროდუქტის არჩევა_2")
    public CartTestStep chooseProduct2(){
        scrollToItems.scrollIntoView(true);
        chooseItem2.click();
        item2AddtoCart.click();
        Selenide.back();
        return this;
    }
    @Step("მთავარ კალათაში გადასვლა")
    public CartTestStep goToMainCart(){
        goToCart.click();
        sleep(1000);
        goToMainCart.click();
        return this;
    }
    @Step("კალათის შემოწმება, რომ ნამდვილად დაემატა ნივთები")
    public int checkCartHasItems() {
        ElementsCollection cartItems = itemList;
        int itemCount = cartItems.size();
        return itemCount;
    }
//ნივთების წაშლა კალათიდან
    @Step("კალათის გასუფთავება")
    public CartTestStep clearCart(){
        clickOnClearCart.click();
        return this;
    }
    @Step("ნივთების რაოდენობის შემოწმება კალათაში")
    public int checkQuantity(){
        ElementsCollection cartItems = itemList;
        int itemCount = cartItems.size();
        return itemCount;
    }
//პრომო კოდის ტესტი
    @Step("პრომო კოდის ველის შევსება არასწორი კოდით - {wrongPromoCode}")
    public CartTestStep fillPromoCode (String wrongPromoCode){
    promoCodeInput.setValue(wrongPromoCode);
    promoCodeSubBtn.click();
        return this;
    }
    @Step("კალათის საერთო ღირებულების შემოწმება")
    public CartTestStep checkSubTotalPrice(){
       String subTotalPrice = $(".ty-price").getText();
        System.out.println("ფასების ჯამი = " + subTotalPrice);
        return this;
    }


}