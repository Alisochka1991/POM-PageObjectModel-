package scheduler;

import config.ConfigurationScheduler;
import org.testng.Assert;
import org.testng.annotations.Test;
import schedulerscreens.LoginScreen;
import schedulerscreens.SplashScreen;

public class LoginTest extends ConfigurationScheduler {
    @Test
    public void loginSuccessTest()
    {
        boolean isfabPresent = new SplashScreen(driver).checkVersion("0.0.3")
                .fillEmail("alisaagranove@gmail.com")
                .fillPassword("212229Alisa$")
                .clickLoginBtn()
                .skipWizard()
                .isFabAddPresent();
        Assert.assertTrue(isfabPresent);
    }

    public void loginStartLigin() //esho variant
    {
        new LoginScreen(driver).fillEmail("kikish@mail.ru").fillPassword("212229").clickLoginBtn()
                .skipWizard().isFabAddPresent();
    }

}
