package tests.b_classesWithTestBase;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C30_ScreenShot extends TestBase {
    /*
    1.Adim: Bir TakeScreenhot objesi olusturup driver’imizi TakeScreenhot’a cast yapalim
            TakesScreenshot ts = (TakesScreenshot) driver;
    2.Adim: kaydettigimiz ekran goruntusunu projede istedigimiz yere
    kaydedebilmek icin path ile yeni bir File olusturalim
            File fullPhoto = new File("target/screenShot/fullPage");
    3.Adim: Takescreenshot objesini kullanarak getScreenshotAs( ) methodunu calistiralim ve gelen
    resmi gecici bir file’a assign edelim
            File temporaryPhoto = ts.getScreenshotAs(OutputType.FILE);
    4.Adim: Kaydettigimiz goruntuyu, saklamak istedigimiz dosyaya kopyalayalim
            FileUtils.copyFile(temporaryPhoto, fullPhoto);
     */
    // 1. amazon anasayfaya gidin
    // 2. amazon anasayfaya gittiginizi test edin ve tum sayfanin goruntusunu kaydedin
    // 3. Nutella icin arama yapin
    // 4. sonucun Nutella icerdigini test edin ve ilk urunun goruntusunu alin

    @Test
    public void test() throws IOException {

        // 1. amazon anasayfaya gidin
        driver.get("https://amazon.com");
        // 2. amazon anasayfaya gittiginizi test edin ve tum sayfanin goruntusunu kaydedin
        String expUrl = "https://www.amazon.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expUrl);
        TakesScreenshot tss = (TakesScreenshot) driver;
        File wholePageSS = new File("target/ScreenShot/AmazonPage.png");
        File tepmSS = tss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(tepmSS, wholePageSS);

        // 3. Nutella icin arama yapin
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella" + Keys.ENTER);
        // 4. sonucun Nutella icerdigini test edin ve ilk urunun goruntusunu alin
        WebElement resultTextElement = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        String resultText = resultTextElement.getText();
        Assert.assertTrue(resultText.contains("Nutella"));
        TakesScreenshot tss2 = (TakesScreenshot) driver;


        File resultPageSS = new File("target/ScreenShot/resultPage.png");
        File tepmresultSS = tss2.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(tepmresultSS, resultPageSS);


        File resultElementSS = new File("target/ScreenShot/resultElementSS.png");
        File tempResultTextSS = resultTextElement.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(tempResultTextSS, resultElementSS);


    }
}
