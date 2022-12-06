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
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class C14_Alerts {

    WebDriver driver;
    // https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
    // Bir metod olusturun: acceptAlert
    // 1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının
    // “You successfully clicked an alert” oldugunu test edin
    // Bir metod olusturun: dismissAlert
    // 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
    // “successfuly” icermedigini test edin
    // Bir metod olusturun: sendKeysAlert
    // 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
    // tıklayın ve result mesajın da isminizin görüntülendiğini doğrulayın.

    @AfterClass
    public void tearDown(){ driver.quit(); }
}
