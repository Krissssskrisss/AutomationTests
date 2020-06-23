import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;

public class YahooSearchResultPage {
    public YahooAnswersPage navigateToAnswersPage() {

        Selenide
                .$x("//a[contains(text(),'Answers')]")
                .sendKeys(Keys.ENTER);

        return new YahooAnswersPage();

    }

}
