package tests;

import base.BaseTest;
import io.qameta.allure.*;
import listener.BaseListener;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SignUpPage;

@Epic("HelloBooks - Authentication Module")
@Feature("Signup Functionality")
@Listeners(BaseListener.class)
public class SignUpTest extends BaseTest {

    @Override
    @BeforeMethod
    public void setUp(){
        System.out.println("-----Launching Browser-----");
        driver = new ChromeDriver();
        driver.get("https://dev.hellobooks.ai/register");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("Signup - Happy Path")
    @Description("Verify that user can successfully sign up with valid details and reach onboarding/dashboard page. OTP is mocked/skipped for automation.")
    @Test(description = "Verify Happy Path Signup Flow")
    public void happyPathTest(){
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.enterFirstName("Adarsh");
        signUpPage.enterLastName("Mishra");
        signUpPage.enterEmail("qa1@example.com");
        signUpPage.enterPassword("Adarsh2025@");
        signUpPage.enterConfirmPassword("Adarsh2025@");
        signUpPage.clickTerms();
        signUpPage.clickSignUp();
        throw new SkipException("Skipping this test intentionally due to OTP verification step.");
    }

    @Severity(SeverityLevel.BLOCKER)
    @Story("Signup - Required Field Validation")
    @Description("Verify that validation messages are displayed when required fields (email, password) are left empty.")
    @Test(description = "Verify Required Field Validation during Signup")
    public void requiredFieldValidationTest(){
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.enterFirstName("Adarsh");
        signUpPage.enterLastName("Mishra");
        signUpPage.clickTerms();
        signUpPage.clickSignUp();
        Assert.assertTrue(driver.findElement(signUpPage.emailError).isDisplayed(),"Email error message not visible.");
        System.out.println("Error Message: "+signUpPage.getEmailErrorMsg());
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("Signup - Invalid Email Format")
    @Description("Verify that invalid email format (missing domain or @) is properly rejected with inline message.")
    @Test(description = "Verify Invalid Email Rejection")
    public void invalidEmailTest(){
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.enterFirstName("Adarsh");
        signUpPage.enterLastName("Mishra");
        signUpPage.enterEmail("qa2@examplecom");
        signUpPage.enterPassword("Adarsh2025@");
        signUpPage.enterConfirmPassword("Adarsh2025@");
        signUpPage.clickTerms();
        signUpPage.clickSignUp();
        Assert.assertTrue(driver.findElement(signUpPage.emailError).isDisplayed(),"Email error message not visible.");
        System.out.println("Email Error Message: "+signUpPage.getEmailErrorMsg());
    }

    @Severity(SeverityLevel.MINOR)
    @Story("Signup - Weak Password Validation")
    @Description("Verify that weak passwords like '12345' are rejected and user sees password strength error message.")
    @Test(description = "Verify Weak Password Validation during Signup")
    public void weakPasswordTest(){
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.enterFirstName("Adarsh");
        signUpPage.enterLastName("Mishra");
        signUpPage.enterEmail("qa3@examplecom");
        signUpPage.enterPassword("12345");
        signUpPage.enterConfirmPassword("12345");
        signUpPage.clickTerms();
        signUpPage.clickSignUp();
        Assert.assertTrue(driver.findElement(signUpPage.passwordError).isDisplayed(),
                "No password policy error message displayed.");
        System.out.println("Password Error Message: "+signUpPage.getPasswordErrorMsg());
    }

    @Override
    @AfterMethod
    public void tearDown(){
        System.out.println("-----Closing Browser-----");
        if (driver != null){
            driver.quit();
        }
    }
}
