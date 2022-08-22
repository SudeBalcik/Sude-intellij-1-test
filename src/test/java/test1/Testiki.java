package test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Testiki {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //facebook adresine git
        driver.get("https://www.facebook.com");

        //cookies cikarsa kabul et



        //eposta adresi gir
        WebElement eposta = driver.findElement(By.xpath("//input[@type='text']"));
        eposta.sendKeys("sude@gmail.com");

        //sifre gir
        WebElement sifre = driver.findElement(By.xpath("//input[@type='password']"));
        sifre.sendKeys("123456");

        //giriş yap butonuna tıkla
       WebElement giris = driver.findElement(By.xpath("//button[@type='submit']"));
       giris.submit();

        //uyarı olarak 'The mail or mobile number is not correct ...' mesajının cıktıgını test et.

        WebElement uyari= driver.findElement(By.xpath("//div[@class='_9kq2']"));
        String expecteduyariyazisi="We couldn't find an account that matches what you entered, but we've found one that closely matches.";
        String actualuyariyazisi=uyari.getText();
        if (expecteduyariyazisi.equals(actualuyariyazisi)) {
            System.out.println("girilemedi testi Passed");

        }
        else {
            System.out.println("girilemedi testi Failed");
        }

        //sayfayı kapat
        driver.close();


    }



}
