package tests.c_classesWithTestBase;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C27_ScreenShot extends TestBase {
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


    }
}
