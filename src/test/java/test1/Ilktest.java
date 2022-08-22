package test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Ilktest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramakutusu= driver.findElement(By.id("twotabsearchtextbox"));

        //Arama kutusuna Nutella yaz
        aramakutusu.sendKeys("Nutella");

        //Nutella yazdıktan sonra arama kutusunu enterla
        aramakutusu.submit();
        System.out.println("Sude");
        //Bulunan sonuc yazısını yazdır
          WebElement sonucyazielementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
          System.out.println(sonucyazielementi.getText());
        System.out.println("Sude2");

        //Sayfayı kapatmak
        driver.close();

        for(int i=0; i<=5; i++){
            System.out.println(i);

        }

    }


}
