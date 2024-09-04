package Pages;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.HomeObjects.*;

public class HomePages extends BaseClass {
    WebDriver driver  = null;


    public HomePages(WebDriver driver){
        this.driver = driver;
    }


    public void createNewIcon() {
        WebElement createNewI = driver.findElement(createNew);
        createNewI.click();
    }

    public void newRepoOption() {
        WebElement newRepoO = driver.findElement(newRepo);
        newRepoO.click();
    }

    public void repoNameField() {
        WebElement repoNameF = driver.findElement(nameRepo);
        repoNameF.sendKeys("New Repo From Test SEL 2");
    }

    public void createRepoButton() {
        WebElement createRepoB = driver.findElement(createRepo);
        createRepoB.click();
    }

}