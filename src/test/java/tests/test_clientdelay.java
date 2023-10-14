package tests;

import pages.ClientDelayPage;
import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
public class test_clientdelay extends TestBase {
    @Test
    void testPerformance(){
        page.navigate("http://uitestingplayground.com/clientdelay");

        ClientDelayPage clientDelayPage = new ClientDelayPage(page);

        clientDelayPage.getTriggerButton().click();
        // Wait for content to be visible.
        page.waitForSelector("#content > p").isVisible();
        assertThat(clientDelayPage.getContent()).hasText("Data calculated on the client side.");



    }
}
