package tests.b_classesWithTestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.IOException;

public class C32_JsExecuterClick extends TestBase {

    // amazon.com anasayfaya gidip
    // sell linkine JSExecutor ile tiklayalim
    // ilgili sayfaya gittigimizi test edelim

    @Test
    public void test01() throws InterruptedException, IOException {
        driver.get("https://amazon.com");

        //1.adim JsExecutor objesi olusturalim ve driver'i cast edelim

        // 2. adim ilgili web elementi locate edelim

        // 3. adim ilgili script ve argument(bizim web elementimiz) ile objemiz uzerinden
        //   executeScript method'unu calistiralim

        // ilgili sayfaya gittigimizi test edelim

    }
}
