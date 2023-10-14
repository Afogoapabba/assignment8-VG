package tests;

import pages.MouseOverPage;
import org.junit.jupiter.api.Test;
import testbase.TestBase;


public class test_mouse_over extends TestBase {

    @Test
    void clickLink() {
        MouseOverPage mouseOverPage = new MouseOverPage(page);
        page.navigate("http://uitestingplayground.com/mouseover");
        /*
        The link is located by text
        Link text never changes so the hover action doesn't affect the locating
        * */

        mouseOverPage.getClickMeLink().click();
        mouseOverPage.getClickMeLink().click();
        mouseOverPage.getClickMeLink().click();
        mouseOverPage.getClickMeLink().click();
        mouseOverPage.getClickMeLink().click();


    }


}
