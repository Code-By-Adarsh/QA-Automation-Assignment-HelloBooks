package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected WebDriver driver;

    @BeforeSuite
    public void setUpSuite(){
        System.out.println("-----Launching Suite-----");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("-----Launching Browser-----");
        driver = new ChromeDriver();
        driver.get("https://dev.hellobooks.ai/login");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("-----Closing Browser-----");
        if (driver != null){
            driver.quit();
        }
    }

    @AfterSuite
    public void tearDownSuite(){
        System.out.println("-----Closing Suite-----");
    }
}
