package tests;

import pages.ClickPage;
import org.junit.jupiter.api.Test;
import testbase.TestBase;

public class test_click extends TestBase {

    @Test
    void try_click(){
        page.navigate("http://uitestingplayground.com/click");
        ClickPage clickPage = new ClickPage(page);
        /* Works out of the box. playwright simulates physical click. */
        clickPage.getBadButton().click();
    }
}
