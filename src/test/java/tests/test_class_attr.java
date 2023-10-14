package tests;

import org.junit.jupiter.api.Test;
import pages.ClassAttrPage;
import testbase.TestBase;

public class test_class_attr extends TestBase {
    /*
        Not sure what the goal was with this challenge
        pw can locate them fine with the full xpath??
        since they all differ
        this.blueButton = page.locator("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]");
        this.yellowButton = page.locator("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-warning ')]");
        this.greenButton = page.locator("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-success ')]");
     */


    @Test
    void clickButton(){
        page.navigate("http://uitestingplayground.com/classattr");
        ClassAttrPage classAttrPage = new ClassAttrPage(page);
        classAttrPage.getBlueButton().click();
    }
}
