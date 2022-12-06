package tests.a_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class C11_WindowHandle2 {
    // Amazon anasayfa adresine gidin.
    // Sayfa’nin window handle degerini String bir degiskene atayin
    // Sayfa title’nin “amazon” icerdigini test edin

    // Yeni bir tab olusturup, acilan tab’da techproeducation.com adresine gidin
    // Sayfa title’nin “TECHPROEDUCATION” icerdigini test edin
    // Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
    // Sayfa title’nin “Walmart” icerdigini test edin
    // Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
    WebDriver driver;
    SoftAssert softAssert = new SoftAssert();
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
    }
    @Test
    public void test(){



    }
    // @AfterClass public void teardown(){driver.quit();}

}
