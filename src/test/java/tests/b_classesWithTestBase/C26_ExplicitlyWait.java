package tests.b_classesWithTestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class C26_ExplicitlyWait extends TestBase {

    //  Iki tane metod olusturun : implicitWait() , explicitWait()
    //  Iki metod icin de asagidaki adimlari test edin.
    //  https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
    //  Remove butonuna basin.
    //  “It’s gone!” mesajinin goruntulendigini dogrulayin.
    //  Add buttonuna basin
    //  It’s back mesajinin gorundugunu test edin

    @Test
    public void implicitlyWaitTest() throws InterruptedException {

        // https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

    }

    @Test
    public void explicitlyWaitTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        /*
        WebElement itsGoneElemnti=driver.findElement(By.xpath("//p[text()=\"It's gone!\"]"));
        wait.until(ExpectedConditions.visibilityOf(itsGoneElemnti));

        her ne kadar kodun anlasilabilir olmasi icin once locate edelim sonra bekleyelim yaklasimi daha guzel gorunse de
        web element zaten gorunur olmadigindan locate etmemiz de mumkun olmayacaktir
        bu durumda locate ve bekleme islemini beraber yapmak gerekir
         */

        // Add buttonuna basin

        // It’s back mesajinin gorundugunu test edin



    }
}