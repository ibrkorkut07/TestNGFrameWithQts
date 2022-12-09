package tests.b_classesWithTestBase;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.List;
import java.util.Set;

public class C29_CookiesAutomation extends TestBase {
    // 1. Amazon anasayfaya gidin
    // 2. tum cookie’leri listeleyin
    // 3. Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
    // 4. ismi i18n prefs olan cookie degerinin USD oldugunu test edin
    // 5. ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin
    // 6. eklediginiz cookie’nin sayfaya eklendigini test edin
    // 7. ismi skin olan cookie’yi silin ve silindigini test edin
    // 8. tum cookie’leri silin ve silindigini test edin

    @Test
    public void test() {
        driver.get("https://amazon.com");
        // 2. tum cookie’leri listeleyin
        int count=1;
        Set<Cookie> cookieList=driver.manage().getCookies();
        for (Cookie each: cookieList) {
            System.out.println("Cookie " + count + ": " + each);
            count++;
        }
        // System.out.println(cookieList);
        // 3. Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        Assert.assertTrue(cookieList.size()>5);
        // 4. ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        String cookiei18value = driver.manage().getCookieNamed("i18n-prefs").getValue();
        // System.out.println(cookiei18value);
        Assert.assertEquals(cookiei18value, "USD");
        // 5. ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin
        Cookie myCookie = new Cookie("en_sevdigim_cookie", "cikolatali");
        driver.manage().addCookie(myCookie);
        // 6. eklediginiz cookie’nin sayfaya eklendigini test edin
        Assert.assertTrue(driver.manage().getCookies().contains(myCookie));
        // 7. ismi skin olan cookie’yi silin ve silindigini test edin
        driver.manage().deleteCookieNamed("skin");
        Assert.assertFalse(driver.manage().getCookies().contains("skin"));
        // 8. tum cookie’leri silin ve silindigini test edin
        driver.manage().deleteAllCookies();
        Set<Cookie> allCookiesList = driver.manage().getCookies();
        Assert.assertTrue(allCookiesList.isEmpty());

    }
}

        // Assert.assertTrue(driver.manage().getCookies().contains("en sevdigim cookie"));

