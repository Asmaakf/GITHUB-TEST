package GithubWeb;

import Base.BaseClass;
import Pages.LoginPages;
import Pages.MainPages;
import org.testng.annotations.Test;

public class HomeMainTest extends BaseClass {



    @Test
        public void homeMainPageMethod() throws  InterruptedException{
            MainPages aboutL = new MainPages(driver);

            aboutL.openUrl();
            Thread.sleep(2000);

            aboutL.aboutLink();
            Thread.sleep(2000);

        }


    @Test
    public void signInMainPageMethod() throws  InterruptedException{
        MainPages signinL = new MainPages(driver);

        LoginPages login = new LoginPages(driver);

        signinL.openUrl();
        Thread.sleep(2000);

        signinL.signinLink();
        Thread.sleep(2000);

        login.usernameField();
        Thread.sleep(2000);

        login.passwordField();
        Thread.sleep(2000);

        login.loginBtn();
        Thread.sleep(2000);

    }


    @Test
    public void searchMainPageMethod() throws  InterruptedException{
        MainPages searchF = new MainPages(driver);

        searchF.openUrl();
        Thread.sleep(2000);

        searchF.searchSecurityField();
        Thread.sleep(2000);

        searchF.searchSecurityInput();
        Thread.sleep(2000);

    }

}
