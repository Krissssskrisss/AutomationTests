import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;

public class YahooHomePage {

    public YahooHomePage openYahooPage() {
        Selenide.open("https://www.yahoo.com/");
        return this;
    }

    public YahooSearchResultPage search(String text) {
        Selenide.$x("//input[@id='header-search-input']")
                .setValue(text)
                .sendKeys(Keys.ENTER);
        return new YahooSearchResultPage();
    }

}
