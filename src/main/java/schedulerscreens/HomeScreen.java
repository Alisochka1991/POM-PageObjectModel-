package schedulerscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class HomeScreen extends BaseScreen{
    public HomeScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy (xpath = "//*[@resource-id='ssilka.na.knopku+']")
    MobileElement fabAdd;

    public boolean isFabAddPresent()
    {
        should(fabAdd,20);
        return fabAdd.isDisplayed();
    }
}
