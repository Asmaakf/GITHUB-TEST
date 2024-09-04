package GithubWeb;

import Pages.HomePages;
import org.testng.annotations.Test;

public class HomeTest extends LoginTest {
    @Test
    public void homePageMethod() throws  InterruptedException{
        HomePages repo = new HomePages(driver);

        loginPageMethod();
        Thread.sleep(2000);
        repo.createNewIcon();
        Thread.sleep(2000);

        repo.newRepoOption();
        Thread.sleep(2000);

        repo.repoNameField();
        Thread.sleep(2000);

        repo.createRepoButton();
        Thread.sleep(2000);

    }
}
