package tests.c_classesWithTestBase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C22_FileDownload extends TestBase {

    // Iki tane metod oluşturun : isExist() ve downloadTest()
    // downloadTest() metodunun icinde aşağıdaki testi yapalim
    //      - https://the-internet.herokuapp.com/download adresine gidelim
    //      - code.txt dosyasını indirelim
    // Ardından isExist() methodunda dosyanın başarıyla indirilip indirilmediğini test edelim

    @Test
    public void downloadTest() {


    }

    @Test
    public void isExist() {
        // System.out.println(System.getProperty("user.home"));

    }
}

//  C:\Users\ibrko
//  \OneDrive\Desktop\filefile.txt