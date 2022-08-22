package junit_Assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assertions1 {
    WebDriver driver;
    @Before
    public void SetUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
        WebElement aramakutusu= driver.findElement(By.id("twotabsearchtextbox"));

        //Arama kutusuna Nutella yaz
        aramakutusu.sendKeys("Nutella");

        //Nutella yazdıktan sonra arama kutusunu enterla
        aramakutusu.submit();

        //Bulunan sonuc yazısını yazdır
        WebElement sonucyazielementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonucyazielementi.getText());


        //Assertions usage

        String actualYaziStr= sonucyazielementi.getText();
        String expectedBulunacakkelime="Nutella";
        Assert.assertTrue(actualYaziStr.contains(expectedBulunacakkelime));

    }

    @Test
    public void test02() {
        driver.get("https://www.amazon.com");
        WebElement aramakutusu= driver.findElement(By.id("twotabsearchtextbox"));

        //Arama kutusuna Nutella yaz
        aramakutusu.sendKeys("Nutella");

        //Nutella yazdıktan sonra arama kutusunu enterla
        aramakutusu.submit();

        //Bulunan sonuc yazısını yazdır
        WebElement sonucyazielementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonucyazielementi.getText());


        //Assertions usage

        String actualYaziStr= sonucyazielementi.getText();
        String expectedBulunacakkelime="Kutella";
        Assert.assertTrue(actualYaziStr.contains(expectedBulunacakkelime));

    }



}
