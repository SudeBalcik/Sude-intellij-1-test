package ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.K;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class action_class_example  {

    @Test
    public void test01() {

        // 1- Launch browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 2- Navigate to url 'http://automationexercise.com'

        driver.get("http://automationexercise.com");

        // 3- Click on signup / login button
        WebElement signupElement= driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
                Actions actions=new Actions(driver);
                actions.click(signupElement).perform();


        // 4- Enter name and email address
         WebElement name= driver.findElement(By.xpath("//input[@type='text']"));
         actions.click(name)
        .sendKeys("Sude")
                 .sendKeys(Keys.TAB)
                 .sendKeys("sude1133@gmail.com")
                 .sendKeys(Keys.TAB)
                 .sendKeys(Keys.ENTER)
                 .perform();

        // 5- Click signup button
        // 6- Fill details
        // 7- Select checkbox
        // 8- Select checkbox
        // 9 - Fill details
        WebElement title= driver.findElement(By.xpath("//input[@id='id_gender2']"));
        actions.click(title)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("371965")
        //WebElement days= driver.findElement(By.xpath("//select[@id='days']"));
        //actions.sendKeys("15")
                .sendKeys(Keys.TAB)
                .sendKeys("15")
                .sendKeys(Keys.TAB)
                .sendKeys("July")
                .sendKeys(Keys.TAB)
                .sendKeys("1994")
                .sendKeys(Keys.TAB)
               // .click()
                //.sendKeys(Keys.TAB)
                //.click()
                .sendKeys(Keys.ENTER)
                //.sendKeys(Keys.TAB)
                .sendKeys("Sude")
                .sendKeys(Keys.TAB)
                .sendKeys("Bal")
                .sendKeys(Keys.TAB)
                .sendKeys("kendim")
                .sendKeys(Keys.TAB)
                .sendKeys("ulu cadde no 95")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys("Teksas")
                .sendKeys(Keys.TAB)
                .sendKeys("Dallas")
                .sendKeys(Keys.TAB)
                .sendKeys("05100")
                .sendKeys(Keys.TAB)
                .sendKeys("5551254568")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        // 10 - Click 'Create account' button
        // 11 - Verify that ' Account created' is visible






    }






}
