package Pages;

import Base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.MainObjects.*;

public class MainPages extends BaseClass {

    WebDriver driver  = null;

    public MainPages(WebDriver driver){
        this.driver = driver;
    }

    public void openUrl(){
        driver.get("https://github.com");
    }

    public void aboutLink() {
        WebElement about = driver.findElement(aboutGit);
        about.sendKeys(Keys.PAGE_DOWN);
        about.click();
    }

    public void signinLink() {
        WebElement signin = driver.findElement(signIn);
        signin.click();
    }

    public void searchSecurityField() {
        WebElement search = driver.findElement(searchSecurity);
        search.click();
    }

    public void searchSecurityInput() throws InterruptedException {
        WebElement search = driver.findElement(searchInput);
        search.sendKeys("Github Security");
        Thread.sleep(2000);
        search.submit();

    }




}

