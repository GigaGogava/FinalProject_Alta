package StepObject;

import PageObject.SortingTestPage;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.*;

public class SortingTestStep extends SortingTestPage {
    @Step("პროდუქტის დასახელების ჩაწერა ძებნის ველში მნიშვნელობით : {productSearch}")
    public SortingTestStep writeProductInSearch(String productSearch) {
        searchInput.setValue(productSearch);
        return this;
    }
    @Step("ძებნის ღილაკზე დაკლიკება")
    public SortingTestStep clickSearchBtn() {
        clickSrchBtn.click();
        return this;
    }
    @Step("სორტირების ცხრილის ჩამოშლა")
    public SortingTestStep clickSortingField() {
        sortField.click();
        return this;
    }
    @Step("სორტირების არჩევა; ფასი ზრდადობით")
    public SortingTestStep chooseLowToHigh() {
        chooseLowToHigh.click();
        return this;
    }
    @Step("სორტირების შემოწმება")
    public SortingTestStep checkSorting() {
        int count = gridList.size();
        System.out.println(count);
        String firstPrice = firstPriceElement.getText();
        float firstFloatPrice = Float.parseFloat(firstPrice);
        System.out.println(firstFloatPrice);
        for (int i = 1; i < count; i++) {
            String secondPrice = $(".ty-price-num", i).getText();
            float secondFloatPrice = Float.parseFloat(secondPrice);
            System.out.println(secondFloatPrice);
            firstPrice = secondPrice;
            if (i > secondFloatPrice) {
                System.out.println("Prices are not sorted correctly");
            }
        }

        return this;
    }
    @Step("ფასის მინიმუმ ზღვარი")
    public SortingTestStep fillMinPrice(String minPrice){
        minPriceElement.setValue(minPrice);
        return this;
    }
    @Step("ფასის მაქსიმუმ ზღვარი")
    public SortingTestStep fillMaxPrice(String maxPrice){
        maxPriceElement.setValue(maxPrice);
        sleep(6000);
        return this;
    }
    @Step("ფასების ზღვრების შემოწმება")
    public SortingTestStep testPriceRange() {

        ElementsCollection priceElements = productPriceElements;
        double maxPrice = Double.MIN_VALUE;
        double minPrice = Double.MAX_VALUE;

        for (int i = 0; i < priceElements.size(); i++) {

            String priceText = priceElements.get(i).getText();
            if (!priceText.isEmpty()) {
                double currentPrice = Double.parseDouble(priceElements.get(i).text());
                if (currentPrice > maxPrice) {
                    maxPrice = currentPrice;
                }

                if (currentPrice < minPrice) {
                    minPrice = currentPrice;
                }
            }
        }
        return this;

    }
}



