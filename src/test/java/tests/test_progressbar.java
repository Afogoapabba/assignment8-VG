package tests;

import pages.ProgressBarPage;
import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
public class test_progressbar extends TestBase {
    @Test
    void stop_at_75(){
        page.navigate("http://uitestingplayground.com/progressbar");

        ProgressBarPage progressBarPage = new ProgressBarPage(page);

        progressBarPage.getStartButton().click();
        //Start polling progressbar
        while (true) {
            String progress = progressBarPage.getProgressBar().getAttribute("style");

            try {
               if (progress.equals("width: 75%")) {
                   progressBarPage.getStopButton().click();
                   break;
               }

           }
            catch (Exception e)
            {
                System.out.println("Failed to read progressbar" + e);
            }

        }
        assertThat(progressBarPage.getProgressBar()).hasText("75%");

    }
}
