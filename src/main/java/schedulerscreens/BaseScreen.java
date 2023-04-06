package schedulerscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseScreen {
    AppiumDriver<MobileElement>driver;

    public BaseScreen(AppiumDriver<MobileElement> driver) {
        this.driver = driver;//sgenerirovany konstructor

    }
}
