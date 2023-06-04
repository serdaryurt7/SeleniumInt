package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_firstClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://www.amazon.com");

        /*
             1- Selenium sitesinden sizin işletim sisteminize uygun selenium dosyaları indirin,
             masaüstüne oluşturacağınız bir klasöre bu zip dosyasını açın

             2- Selenium sitesinden, browser sekmesinde bilgisayarınıza uygun driver'ı indirin, zip dosyasından çıkartıp masaüstüne taşıyın.

             3- Selenium sitesinden indirdiğiniz chrome sürümü ile bilgisayardaki chromebrowser sürümünün aynı olduğundan emin olun,
             aynı değilse, bilgisayardaki chrome browser'ı update edin.

             4- Yeni bir proje oluşturun, proje oluşturma aşamasında build-system olarak maven seçin

             5- src altında resources klasörü oluşturun
             bu klasörün içine indirip, masaüstüne açtığımız selenium klasörü ve chromedriver.exe dosyalarını taşıyyın.

             6- File/project structure menüsünden modules ve dependencies'i seçin + tuşuna basıp
             projeye eklediğimiz selenium klasörü içindeki tüm jar dosyalarını seçip apply ve ok tuşlarına basın.

             7- src/main/java altında bir class oluşturun

             9- class'da main method oluşturup yukaridaki kodları yazın

             NoT: 10. satırdaki 2.parametre windows ve mac için farklıdır
             "src/resources/chromedriver.exe"
         */

    }

}
