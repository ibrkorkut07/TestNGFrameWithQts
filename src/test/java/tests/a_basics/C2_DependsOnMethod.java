package tests.a_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C2_DependsOnMethod {
    WebDriver driver;
    //  https://www.amazon.com adresine gidin.
    //  1. Test : Amazon ana sayfaya gittiginizi test edin
    //  2. Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
    //  arama yapin ve aramanizin gerceklestigini Test edin
    //  3. Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin $16.83 oldugunu test edin
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
        driver.manage().window().maximize();

    }
    //  1. Test : Amazon ana sayfaya gittiginizi test edin
    @Test
    public void pageTest() {

    }
    //  2. Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
    //  arama yapin ve aramanizin gerceklestigini Test edin

    @Test (dependsOnMethods = "pageTest")
    public void searchTest(){

    }
    //  3. Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin $16.83 oldugunu test edin
    @Test (dependsOnMethods = "searchTest")
    public void priceTest() {

    }

    // @AfterClass public void tearDown(){driver.quit();}
}
