import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestRunner {
    @BeforeMethod
    public void configBrowser() {

        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = 30000;
    }

    @AfterMethod
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }
}

