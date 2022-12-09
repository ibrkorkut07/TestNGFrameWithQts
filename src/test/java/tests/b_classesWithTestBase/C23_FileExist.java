package tests.b_classesWithTestBase;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C23_FileExist {

    @Test
    public void test() {

        System.out.println(System.getProperty("user.home"));    //  C:\Users\ibrko
        String filePath = System.getProperty("user.home") + "\\Downloads\\Circle.jpg";
        System.out.println(filePath);
        Assert.assertTrue(Files.exists(Paths.get(filePath)));

    }
}

// "C:\Users\ibrko\OneDrive\Desktop\SELENIUM WEBDRIVER\images.jpg"
// C:\Users\ibrko\OneDrive\Desktop\SELENIUM WEBDRIVER
// C:\Users\ibrko\Downloads\Circle.jpg