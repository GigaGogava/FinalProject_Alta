package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import javax.swing.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CartTestPage {
    public SelenideElement
        chooseNotebooks = $(".cont-tc"),
        chooseItem1 = $(".ty-grid-list__item-name",1),
        chooseItem2 = $(".ty-grid-list__item-name",3),
        item1AddToCart = $(byName("dispatch[checkout.add..38730]")),
        item2AddtoCart = $(byName("dispatch[checkout.add..39228]")),
        goToCart = $(".ty-minicart-title"),
        acceptCookies = $(".cm-btn"),
        item1InCart = $("#det_img_scr_1701012920_656365b832fa000038730"),
        item2InCart = $("#det_img_scr_1701012920_656365b832fa000039228"),
        clearCart = $(".ty-btn ty-btn__tertiary text-button"),
        floatingCart = $(".owl-wrapper"),
        goToMainCart = $(byLinkText("კალათაში")),
        promoCodeInput = $(".ty-input-text"),
        promoCodeSubBtn = $(".ty-btn-go"),
        promoCodeErrorMessage = $(".cm-notification-content"),
        SignRegBtn = $(".ty-account-info__title-txt"),
        loginEmailInput = $(".name-login-input"),
        loginPasswordInput = $("#psw_popup348"),
        signInBtn = $(byName("dispatch[auth.login]")),
        scrollToItems = $(".ty-grid-list__item-name",1),
        loginMessage = $(byText("თქვენ წარმატებით გაიარეთ ავტორიზაცია.")),
        closeNotificationBtn = $(".cm-notification-close close"),
        mainCart = $("#cart_main"),
        itemListInMainCart = $(".ty-cart-content__product-elem"),
        emptyCartMessage = $(".ty-no-items"),
        clickOnClearCart = $(".ty-btn__tertiary",1);
    public ElementsCollection
        itemList = $$(".ty-cart-content__image"),
        cartSubTotalPrice = $$(".ty-price");
    }

