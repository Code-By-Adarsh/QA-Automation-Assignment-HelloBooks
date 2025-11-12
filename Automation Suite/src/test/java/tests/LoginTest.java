package tests;

import base.BaseTest;
import io.qameta.allure.*;
import listener.BaseListener;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

@Epic("HelloBooks - Authentication Module")
@Feature("Login Functionality")
@Listeners(BaseListener.class)
public class LoginTest extends BaseTest {

    @Severity(SeverityLevel.BLOCKER)
    @Story("Login - Valid Credentials and Logout")
    @Description("Verify that a user can log in with valid credentials, access the dashboard, and successfully log out with session cleared.")
    @Test(description = "Verify Valid Login and Logout Flow")
    public void validLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        System.out.println("Url before login: "+driver.getCurrentUrl());
        loginPage.enterWorkingEmail("lirayi1704@agenra.com");
        loginPage.enterPassword("Adarsh2025@");
        loginPage.clickSignIn();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("dashboard"));
        System.out.println("Url after login: "+driver.getCurrentUrl());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[aria-label='open profile menu']")));
        driver.findElement(By.cssSelector("button[aria-label='open profile menu']")).click();
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[aria-label='Logout']")));
        element.click();
        wait.until(ExpectedConditions.urlContains("login"));
        System.out.println("Url after logout: "+driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(),"https://dev.hellobooks.ai/login", "Login Page not appear after clicking logout button.");
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("Login - Invalid Password")
    @Description("Verify that login fails when wrong password is entered, and proper error message is shown.")
    @Test(description = "Verify Invalid Password Validation during Login")
    public void invalidPasswordTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterWorkingEmail("lirayi1704@agenra.com");
        loginPage.enterPassword("Adarsh");
        loginPage.clickSignIn();
        Assert.assertTrue(driver.findElement(loginPage.passwordErrorMsg).isDisplayed(), "Password error message not displayed on wrong password.");
        System.out.println("Password Error Message: "+loginPage.getPasswordErrorMsg());
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("Login - Unregistered Email Handling")
    @Description("Verify that login fails when using an unregistered email, showing user-friendly alert message.")
    @Test(description = "Verify Unregistered Email Login Behavior")
    public void invalidEmailTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterWorkingEmail("lira4@agenra.com");
        loginPage.enterPassword("Adarsh2025@");
        loginPage.clickSignIn();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert emailAlert = driver.switchTo().alert();
        System.out.println("Email Error Message: "+emailAlert.getText());
        Assert.assertEquals("User doesn't exist",emailAlert.getText(), "Email alert error message not appeared after wrong email.");
    }
}
