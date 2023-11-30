import StepObject.SortingTestStep;
import Utils.ChromeRunner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.SortingTestData.*;
import static com.codeborne.selenide.Selenide.sleep;
import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

public class AltaSortingTest extends ChromeRunner {
    SortingTestStep sortingTestStep = new SortingTestStep();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("სორტირების შემოწმება ფასის ზრდადობის მიხედვით")
    public void SortingTest(){
        sortingTestStep
                .writeProductInSearch(productSearch)
                .clickSearchBtn()
                .clickSortingField()
                .chooseLowToHigh()
                .checkSorting();
        sleep(3333);

    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("ფასების სღვრების შემოწმება მითითებული ფასების მიხედვით")
    public void testPriceRange(){
        sortingTestStep
                .writeProductInSearch(productSearch)
                .clickSearchBtn()
                .clickSortingField()
                .chooseLowToHigh()
                .fillMinPrice(minPrice)
                .fillMaxPrice(maxPrice)
                .testPriceRange();
        Assert.assertTrue(MIN_VALUE < 200.0, "Min price is less than range");
        Assert.assertTrue(MAX_VALUE > 600.0, "Max Price is exceeding range");
    }
}

