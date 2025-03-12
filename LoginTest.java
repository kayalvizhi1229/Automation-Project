package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;
import utils.WebDriverManagerUtil;
import org.openqa.selenium.WebDriver;

public class LoginTest {
    WebDriver driver;

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
            {"user1@example.com", "password1"},
            {"user2@example.com", "password2"}
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        driver = WebDriverManagerUtil.getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
    }
}
