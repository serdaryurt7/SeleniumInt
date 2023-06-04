package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        // driver objesi oluşturunca Selenium webDriver
        // bilgisayarımızdaki chrome browser' dan bir boş sayfa açtırır.
        // Eğer firefox veya safari gibi başka bir browser kullanmak istersek Selenium'un sitesinden o browser'in WebDriver'ını indirip projemize eklememiz gerekir.

        driver.get("https://www.amazon.com");
        // Eğer kodlarımızı belirli bir süre bekletmek istersek.

        Thread.sleep(5000); // Yazılan milisaniye kadar kodları bekletir.

        System.out.println("Sayfa URL'i " + driver.getCurrentUrl());
        System.out.println("Sayfa Başlığı " + driver.getTitle());
        driver.close();





    }
}
