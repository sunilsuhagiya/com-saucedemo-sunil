import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        //Set Property
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        //Create Object
        WebDriver driver = new ChromeDriver();

        //Launch URL
        driver.get("https://www.saucedemo.com/");

        //Maximise window
        driver.manage().window().maximize();

        //Give implicit time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
        System.out.println("the Page title is :" + driver.getTitle());

        //Get current URL
        System.out.println("The Current URL is :" + driver.getCurrentUrl());

        //Get Page Source
        System.out.println("The Page source is " + driver.getPageSource());

        //Find Username field and enter username
        WebElement enterUser = driver.findElement(By.id("user-name"));
        enterUser.sendKeys("swag@gmail.com");
        //Find Password Field and enter password
        WebElement enterPass = driver.findElement(By.name("password"));
        enterPass.sendKeys("swag123");

        //Close the browser
        driver.quit();
    }
}
