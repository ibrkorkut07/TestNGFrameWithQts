package tests.b_classesWithTestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C20_KeyboardActions2 extends TestBase {

    // https://html.com/tags/iframe/ sayfasina gidelim
    // video’yu gorecek kadar asagi inin
    // videoyu izlemek icin Play tusuna basin
    // videoyu calistirdiginizi test edin

    @Test
    public void test01() throws InterruptedException {

        // https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/");
        // video’yu gorecek kadar asagi inin
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        WebElement iframeElement = driver.findElement(By.xpath("//video[@tabindex='-1']"));
        driver.switchTo().frame(iframeElement);
        WebElement playButton = iframeElement.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"));
        actions.moveToElement(playButton).click().perform();
        // actions.moveToElement(iframeElement).click().perform();


        // videoyu izlemek icin Play tusuna basin
        // video iframe icinde oldugundan, once iframe'e gecis yapmaliyiz


        // videoyu calistirdiginizi test edin

    }
}
