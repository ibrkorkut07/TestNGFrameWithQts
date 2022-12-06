package tests.a_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class C8_SoftAssertion3 {
    // 1. “https://hepsiburada.com/” Adresine gidin
    // 2. Basliginin “Turkiye’nin En Buyuk Alisveris Sitesi" icerdigini dogrulayin
    // 3. search kutusuna araba yazip arattirin
    // 4. bulunan sonuc sayisini yazdirin
    // 5. sonuc yazisinin "araba" icerdigini dogrulayin
    // 6. Sonuc yazisinin “oto” kelimesi icermedigini dogrulayin

    WebDriver driver;
    SoftAssert softAssert = new SoftAssert();

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://hepsiburada.com/");
    }

    @Test
    public void Test(){


    }

    @AfterMethod public void teardown(){
        driver.close();
    }
}
