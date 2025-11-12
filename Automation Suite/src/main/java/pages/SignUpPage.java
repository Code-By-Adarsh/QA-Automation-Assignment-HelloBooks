package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage{
    private WebDriver driver;

    private By firstNameInput = By.id("input_first_name");
    private By lastNameInput = By.id("input_last_name");
    private By emailInput = By.id("input_your_working_email");
    private By passwordInput = By.id("input_password");
    private By confirmPasswordInput = By.id("input_confirm_password");
    private By continuingInput = By.id("terms");
    private By signUpInput = By.cssSelector("button[type='submit']");
    public By emailError = By.id("input_your_working_email-error");
    public By passwordError = By.id("input_password-error");

    public SignUpPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterFirstName(String FirstName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInput));
        driver.findElement(firstNameInput).clear();
        driver.findElement(firstNameInput).sendKeys(FirstName);
    }

    public void enterLastName(String LastName){
        driver.findElement(lastNameInput).clear();
        driver.findElement(lastNameInput).sendKeys(LastName);
    }

    public void enterEmail(String Email){
        driver.findElement(emailInput).clear();
        driver.findElement(emailInput).sendKeys(Email);
    }

    public void enterPassword(String Password){
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(Password);
    }

    public void enterConfirmPassword(String ConfirmPassword){
        driver.findElement(confirmPasswordInput).clear();
        driver.findElement(confirmPasswordInput).sendKeys(ConfirmPassword);
    }

    public void clickTerms(){
        driver.findElement(continuingInput).click();
    }

    public void clickSignUp(){
        driver.findElement(signUpInput).click();
    }

    public String getEmailErrorMsg(){
        return driver.findElement(emailError).getText();
    }

    public String getPasswordErrorMsg(){
        return driver.findElement(passwordError).getText();
    }
}
