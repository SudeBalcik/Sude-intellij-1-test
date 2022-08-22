package test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Testüc {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //bestbuy adresine git.

        driver.get("https://www.bestbuy.com");

        //cookies cıkarsa kabul et.

        //sayfada kaç adet button bulundugunu yazdır.

        List<WebElement> buttonListesi= driver.findElements(By.tagName("button"));
        System.out.println(buttonListesi.size());

        //sayfadaki herbir button üzeirndeki yazıları yazdır

        for (WebElement each:buttonListesi
        ) {

          System.out.println(each.getText());
        }

    }

    }
