package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {
    @BeforeMethod(description = "ბრაუზერის კონფიგურაცია ტესტის დაწყებამდე")
    public static void setUp(){
        open("https://alta.ge/");
        Configuration.browserSize = "1920x1080";


    }

    @AfterMethod(description = "ტესტის შემდეგი ნაბიჯები")
    public static void tearDown(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}
