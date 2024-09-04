package ObjectsPath;

import org.openqa.selenium.By;

public class HomeObjects {
    public static final By createNew = By.id("global-create-menu-anchor");
    public static final By newRepo = By.xpath("//a[@role='menuitem']");
    public static final By nameRepo = By.xpath("//input[@aria-describedby='RepoNameInput-is-available RepoNameInput-message']");
    public static final By createRepo = By.xpath("//button[@aria-describedby=':rn:-loading-announcement']");

}
