import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHrm {

   protected static WebDriver driver;

   public static void main(String[]args){

       System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");

       driver = new ChromeDriver();

       driver.manage().window().fullscreen();

       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement((By.id("txtPassword"))).sendKeys("admin123");

        driver.findElement(By.className("button")).click();

        driver.findElement(By.xpath("//a[@class = 'panelTrigger']")).click();

        driver.findElement(By.linkText("Logout")).click();

        //driver.close();














   }


}
