package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ProgressBarPage {
    public Locator getStartButton() {
        return startButton;
    }

    public Locator getStopButton() {
        return stopButton;
    }

    Locator startButton;
    Locator stopButton;

    public Locator getProgressBar() {
        return progressBar;
    }

    Locator progressBar;

    public ProgressBarPage(Page page){
        this.startButton = page.locator("#startButton");
        this.stopButton = page.locator("#stopButton");
        this.progressBar = page.locator("#progressBar");
    }
}
