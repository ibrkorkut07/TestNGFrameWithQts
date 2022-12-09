package tests.b_classesWithTestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C33_JsExecutorScrollIntoView extends TestBase {

    //1- Yeni bir class olusturun : ScroolInto
    //2- hotelmycamp anasayfasina gidin
    //3- 2 farkli test method’u olusturarak actions clasi ve Js Executor kullanarak
    //   asagidaki oda turlerinden ust sira ortadaki odayi tiklayin
    //4- istediginiz oda inceleme sayfasi acildigini test edin

    WebElement roomsLink;
    @Test
    public void scrollAction() throws InterruptedException {
        driver.get("https://www.hotelmycamp.com/");

        WebElement advanceButton = driver.findElement(By.xpath("//button[@id='details-button']"));

        WebElement proceedButton = driver.findElement(By.xpath("//a[@id='proceed-link']"));

        roomsLink = driver.findElement(By.linkText("Rooms"));

        WebElement roomBrock = driver.findElement(By.xpath("(//a[@class='btn-custom'])[2]"));

    }

    @Test
    public void scrollJsExecutor() throws InterruptedException {
        driver.get("https://www.hotelmycamp.com/");

        WebElement advanceButton = driver.findElement(By.xpath("//button[@id='details-button']"));

        WebElement proceedButton = driver.findElement(By.xpath("//a[@id='proceed-link']"));

        roomsLink = driver.findElement(By.linkText("Rooms"));


        // 1.adim JsExecutor objesi olustur ve driver'i cast et


        // 2.adim calisacagimiz web elementi locate edelim


        // 3.adim ilgili script ve argument ile jse.executeScript() calistir

    }
}
