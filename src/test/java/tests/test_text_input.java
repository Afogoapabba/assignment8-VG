package tests;

import pages.TextInputPage;
import org.junit.jupiter.api.*;
import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class test_text_input extends TestBase {

    @Test
    void checkTextBox(){
        page.navigate("http://uitestingplayground.com/textinput");

        TextInputPage textInputPage = new TextInputPage(page);
        String input = "TEST123";
        textInputPage.getTextBox().fill(input);
        textInputPage.getButton().click();

        assertThat(textInputPage.getButton()).hasText(input);




    }


}
