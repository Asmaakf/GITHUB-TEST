package GithubWeb;

import Base.BaseClass;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void loginPageMethod() throws  InterruptedException{
        LoginPages loginpage = new LoginPages(driver);

        loginpage.openUrl();
        Thread.sleep(2000);
        loginpage.usernameField();
        Thread.sleep(2000);
        loginpage.passwordField();
        loginpage.loginBtn();
        Thread.sleep(2000);

    }


}
