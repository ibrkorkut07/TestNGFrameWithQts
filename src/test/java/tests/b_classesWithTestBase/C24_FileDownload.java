package tests.b_classesWithTestBase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C24_FileDownload extends TestBase {

    // Iki tane metod oluşturun : isExist() ve downloadTest()
    // downloadTest() metodunun icinde aşağıdaki testi yapalim
    //      - https://the-internet.herokuapp.com/download adresine gidelim
    //      - file.txt dosyasını indirelim
    // Ardından isExist() methodunda dosyanın başarıyla indirilip indirilmediğini test edelim

    @Test
    public void downloadTest() {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.linkText("file.txt")).click();
    }

    @Test
    public void isExist() {
        // System.out.println(System.getProperty("user.home"));
        String filePath = System.getProperty("user.home") + "\\Downloads\\file.txt";
        Assert.assertTrue(Files.exists(Paths.get(filePath)));
    }
}

//  C:\Users\ibrko
//  \OneDrive\Desktop\filefile.txt