package Pages;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.LoginObjects.*;



public class LoginPages extends BaseClass {
    WebDriver driver  = null;


    public LoginPages(WebDriver driver){
        this.driver = driver;
    }

    public void openUrl(){
        driver.get("https://github.com/login");
    }

    public void usernameField() {
        WebElement fieldUsername = driver.findElement(username);
        fieldUsername.sendKeys("asmaakf@hotmail.com");
    }


    public void passwordField() {
        WebElement fieldPassword = driver.findElement(password);
        fieldPassword.sendKeys("Asmaa.1421");
    }

    public void loginBtn() {
        WebElement buttonLogin = driver.findElement(loginButton);
        buttonLogin.click();
    }

}