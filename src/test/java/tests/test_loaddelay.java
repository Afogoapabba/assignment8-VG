package tests;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Test;
import testbase.TestBase;

public class test_loaddelay extends TestBase {

    @Test
    void test_loaddelay(){
        Locator loadDelayLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Load Delay"));
        loadDelayLink.click();
        /*It works without this delay because the page will load within the time PW is allowed to locate the button (30sec)
        however having this wait makes it so PW won't waste its time.
         */
        page.waitForURL("**/loaddelay*");
        Locator loadButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Button Appearing After Delay"));
        loadButton.click();

    }




}
