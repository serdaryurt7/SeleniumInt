package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTest {

    public static void main(String[] args) {

        // Gerekli ayarlamaları yapıp amazon anasayfaya gidin.
        // Sayfa başlığı amazon kelimesi içermeli
        // Sayfa url'inde "Amazon" kelimesi olmalı.

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");


        String expectedTitleIcerik = "amazon";
        String expectedURLIcerik = "Amazon";

        String actualURL = driver.getCurrentUrl();
        String actualTitle = driver.getTitle();

        // URL TEST
        if (actualURL.contains(expectedURLIcerik)){
            System.out.println("URL Test PASSED");
        }
        else {
            System.out.println("URL Test FAILED");
            System.out.println("Actual URL " + actualURL);
            System.out.println("Actual URL aranan " + expectedURLIcerik + " kelimesini içermiyor");
        }

        // Title TEST
        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Title Test PASSED");
        }
        else {
            System.out.println("Title Test FAILED");
            System.out.println("Actual Title" + actualTitle);
            System.out.println("Actual Title aranan " + expectedTitleIcerik + " kelimesini içermiyor");
        }
        driver.quit();
        // driver.quit ise test çalışırken açılan tüm browser'ları kapatır.
        // driver.Close sadece açık olan browser'ı kapatır

    }
}
