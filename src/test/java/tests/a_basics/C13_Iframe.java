package tests.a_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C13_Iframe {

    // https://the-internet.herokuapp.com/iframe adresine gidin.
    // Bir metod olusturun: iframeTest
    // “An IFrame containing….” textinin erisilebilir oldugunu test edin ve konsolda yazdirin.
    // Text Box’a “Merhaba Dunya!” yazin.
    // TextBox’in altinda bulunan “Elemental Selenium” link textinin gorunur oldugunu
    // dogrulayin ve konsolda yazdirin.

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");
    }

    @Test
    public void iframeTest(){

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
