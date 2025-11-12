package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    private By workingEmailInput = By.id("input_your_working_email");
    private By passwordInput = By.id("input_password");
    private By signInInput = By.cssSelector(".text-nowrap");
    public By passwordErrorMsg = By.id("input_password-error");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterWorkingEmail(String WorkingEmail){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(workingEmailInput));
        driver.findElement(workingEmailInput).clear();
        driver.findElement(workingEmailInput).sendKeys(WorkingEmail);
    }

    public void enterPassword(String Password){
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(Password);
    }

    public void clickSignIn(){
        driver.findElement(signInInput).click();
    }

    public String getPasswordErrorMsg(){
        return driver.findElement(passwordErrorMsg).getText();
    }
}
