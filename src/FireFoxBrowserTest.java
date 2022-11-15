import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.time.Duration;

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        //Set Property
        System.setProperty("webdriver.gheko.driver", "driver/geckodriver.exe");
        //Create Object
        WebDriver driver = new FirefoxDriver();

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
        WebElement enterUserName = driver.findElement(By.id("user-name"));
        enterUserName.sendKeys("swag@gmail.com");
        //Find Password Field and enter password
        WebElement enterPass = driver.findElement(By.name("password"));
        enterPass.sendKeys("swag123");

        //Close the browser
        driver.quit();
    }
}
