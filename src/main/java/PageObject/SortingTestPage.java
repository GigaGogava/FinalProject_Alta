package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SortingTestPage {
    public SelenideElement
            searchInput = $("#search_input"),
            clickSrchBtn = $(".ty-search-magnifier"),
            sortField = $("#sw_elm_sort_fields"),
            chooseLowToHigh = $(".sort-by-price-asc"),
            productElement = $(".ty-column3"),
            secondPriceElement = $(".ty-price-num"),
            minPriceElement = $("#slider_67_17_left"),
            maxPriceElement = $("#slider_67_17_right");
    public ElementsCollection
            gridList = $(".grid-list").$$(".ty-column3 ");

    public SelenideElement
            firstPriceElement = $(("#sec_discounted_price_30939"), 0);
    public ElementsCollection
            productPriceElements = $$(".ty-price-num");
}

