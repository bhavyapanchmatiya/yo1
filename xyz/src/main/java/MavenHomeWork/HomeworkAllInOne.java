package MavenHomeWork;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeworkAllInOne {

    protected static WebDriver driver;

    public static void sleep(final long millis){

        try{Thread.sleep(millis); }

        catch(InterruptedException ex){

            ex.printStackTrace(); }
    }

   /* public String generateEmail(String startValue){

        String email = startValue.concat(new Date().toString());

        return email; }*/


    public static String randomDate(){

        DateFormat format = new SimpleDateFormat("ddMMyyHHmmss");
        return format.format(new Date()); }


        @BeforeMethod
        public void openBrowser(){

        System.setProperty("webdriver.chrome.driver","src\\main\\Resources\\BrowserDriver\\chromedriver.exe");
        //Open Browser(Chrome)
        driver = new ChromeDriver();

        //Maximise Browser
        driver.manage().window().fullscreen();

        //Enter Url
        driver.get("http://demo.nopcommerce.com/");}

        @Test
        public void UserShouldBeAbleToRegister(){

        //Click Register Button
            driver.findElement(By.linkText("Register")).click();
        //Enter First Name
            driver.findElement(By.id("FirstName")).sendKeys("Bhavya");
        //Enter Last Name
            driver.findElement(By.id("LastName")).sendKeys("Panchmatiya");
        //Enter New Email
            driver.findElement(By.xpath("//input[@data-val-email = 'Wrong email']")).sendKeys("Bhavya" + randomDate() + "@gmail.com");
        //Enter Password
            driver.findElement(By.xpath("//input[@data-val-regex-pattern = '^.{6,}$']")).sendKeys("Liverpool");
        //Enter Confirm Word
            driver.findElement(By.xpath("//input[@data-val-equalto = 'The password and confirmation password do not match.']")).sendKeys("Liverpool");
        //Click Register Buton
            driver.findElement(By.xpath("//input[@id = 'register-button']")).click();
        //Expected Result
            String expectedResults = ("Your registration completed");
        //Actual Result
            String actualResult = driver.findElement(By.xpath("//div[@class = \"result\"]")).getText();
        //Compare Actual and Expected results
            Assert.assertEquals(actualResult,expectedResults);
        }

    @Test
    public void registerAndEmailAFriend(){

    //Click Register
        driver.findElement(By.linkText("Register")).click();
    //Enter First Name
        driver.findElement(By.id("FirstName")).sendKeys("Bhavya");
    //Enter Last Name
        driver.findElement(By.id("LastName")).sendKeys("Panchmatiya");
    //Enter Email
        driver.findElement(By.xpath("//input[@data-val-email = 'Wrong email']")).sendKeys("Bhavya" + randomDate() + "@gmail.com");
    //Enter Password
        driver.findElement(By.xpath("//input[@data-val-regex-pattern = '^.{6,}$']")).sendKeys("Liverpool");
    //Enter Confirm Password
        driver.findElement(By.xpath("//input[@data-val-equalto = 'The password and confirmation password do not match.']")).sendKeys("Liverpool");
    //Click Register Button
        driver.findElement(By.xpath("//input[@id = 'register-button']")).click();
    //Click HomeButton(NopCommerce) on Top Left
        driver.findElement(By.xpath("//img[@alt =\"nopCommerce demo store\" ]")).click();
    //Click on Apple Link
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/h2/a")).click();
    //Click Email a friend Button
        driver.findElement(By.xpath("//div[@class='email-a-friend']")).click();
    //Enter Friend's Email
        driver.findElement(By.className("friend-email")).sendKeys("PatelM@yahoo.com");
    //Enter Message
        driver.findElement(By.name("PersonalMessage")).sendKeys("Yo...buy me this Laptop Bro !!");
    //Click Send
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/input")).click();
    //Expected Results
        String expectedResults = ("Apple MacBook Pro 13-inch");
    //Acutal Results
        String actualResult = driver.findElement(By.xpath("")).getText();
    //Compare Actual and Expected results
        Assert.assertEquals(actualResult,expectedResults);


    }
    @Test
    public void userShouldBeAbleToNavigateToCameraAndPhoto(){

    //Click on Electronics
        driver.findElement(By.xpath("//h2/a[@title = \"Show products in category Electronics\"]")).click();
    //Click on Camera & Photo
        driver.findElement(By.xpath("//h2/a[@href = \"/camera-photo\"]")).click();
    //Expected Results
        String expectedResults = ("Leica T Mirrorless Digital Camera");
    //Actual Result
        String actualResult = driver.findElement(By.linkText("Leica T Mirrorless Digital Camera")).getText();
    //Compare Results
        Assert.assertEquals(actualResult,expectedResults);
    }


    @Test
    public void UserShouldBeAbleToSelectJewelleryAndFilterBy700to3000(){

        //Click On Jewelery
        driver.findElement(By.xpath("//li/a[@href=\"/jewelry\"]")).click();
        //Click on 700 to 3000
        driver.findElement(By.xpath("//a[@href = \"//demo.nopcommerce.com/jewelry?price=700-3000\"]")).click();
        //Expected Results
        String expectedResults = ("Vintage Style Engagement Ring");
        //Actual Results
        String actualResult = driver.findElement(By.xpath("//h2/a[@href=\"/vintage-style-engagement-ring\"]")).getText();
        //Compare Results
        Assert.assertEquals(actualResult,expectedResults);

    }

    @Test
    public void userShouldBeAbleToPutTwoBooksInBasket(){

    //Click On Books
    driver.findElement(By.xpath("//li/a[@href = \"/books\"]")).click();
    //Add First Book in Basket
    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div[3]/div[2]/input[1]")).click();
    sleep(10000);
    //Add Second Book
    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div[2]/div[3]/div[2]/input[1]")).click();
    //Click on shopping cart
    driver.findElement(By.xpath("//span[@class=\"cart-label\"]")).click();

    //Expected Results
    String expectedResult = ("Gift wrapping");
    //Actual Results
    String actualResult = driver.findElement(By.xpath("//label[@class = \"text-prompt\"]")).getText();
    //Compare Actual and Expected Results
    Assert.assertEquals(actualResult,expectedResult);

    }





    @AfterMethod
    public void close(){
    //Close all Session
    //driver.quit();
        }
}









