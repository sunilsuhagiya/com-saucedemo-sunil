import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    // Declaring Static/Global Variable
    static String browser = "chrome"; // You can please have a go using FireFox and Edge Browser.
    // Declaring Static/Global Variable
    static String baseUrl = ("https://www.saucedemo.com/");
    // Declaring Static/Global Variable
    static WebDriver driver;

    // Declaring main method
    public static void main(String[] args) {
        // Using if - else condition statement to perform multi browser compatibility
        // Using ignore case method for upper case or lower case letters
        if (browser.equalsIgnoreCase("chrome")) {
            // Setting property for chrome driver
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            // Creating object
            driver = new ChromeDriver();
            // using else if for another condition using edge browser
        } else if (browser.equalsIgnoreCase("edge")) {
            // Setting property for edge driver
            System.setProperty("webdriver.edge,driver", "driver/msedgedriver.exe");
            // Creating object
            driver = new EdgeDriver();
            // using else if for another condition using edge browser
        } else if (browser.equalsIgnoreCase("firefox")) {
            // Setting property for firefox driver
            System.setProperty("webdriver.gheko.driver", "driver/geckodriver.exe");
            // Creating object
            driver = new FirefoxDriver();
            // if user selects incorrect browser it will display please input correct browser name
        } else {
            System.out.println("Please enter valid browser name");
        }

        // launch URL
        driver.get(baseUrl);
        // Maximise window
        driver.manage().window().maximize();
        // Giving implicitly time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // get the title of the page
        System.out.println("The page Title is : " + driver.getTitle());
        // Get the Current URL
        System.out.println("The Current URL is :  " + driver.getCurrentUrl());
        // Get page source
        System.out.println("The Page source is:  " + driver.getPageSource());
        // Find username field
        WebElement enterUserName = driver.findElement(By.id("user-name"));
        // Entering username using sendkeys method
        enterUserName.sendKeys("swag@gmail.com");
        //Find Password Field
        WebElement enterPassword = driver.findElement(By.name("password"));
        // Entering password using sendkeys method
        enterPassword.sendKeys("swag123");

        // Closing the browser
        driver.quit();
    }
}
