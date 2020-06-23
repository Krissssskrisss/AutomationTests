import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;

public class GoogleSearchResultPage {

    public String getFirstResultTextLink() {

        String text = Selenide
                .$x("//h3[contains(text(),'31 Funny Kittens | Cat Video Compilation 2017 - Yo')]")
                .getText();
        return text;
    }

    public GoogleImagePage navigateToImageBar() {
        Selenide
                .$x("//div[@id='hdtb-msb']//div//div[2]//a[1]")
                .sendKeys(Keys.ENTER);
        return new GoogleImagePage();

    }

    public boolean IslogoDisplayed() {
        Selenide
                .$x("//a[@id='logo']//img").isDisplayed();
        return true;
    }

    public GoogleSearchResultPage hideLogo() {

        Selenide.executeJavaScript("arguments[0].style.display = 'none'", "//a[@id='logo']//img");
        return this;
    }

    public List<SelenideElement> getTenLinksResults() {

        ElementsCollection searchResults = $$x("//div[@class=\"g\"]");
        List<SelenideElement> tenElements = new ArrayList<>();
        int i = 0;
        for (SelenideElement el : searchResults) {
            if (i > 10) {
                break;
            }
            i++;
            tenElements.add(el);
        }
        return tenElements;
    }

    public void changeColor(SelenideElement firstLink, Color pink) {
        Selenide.executeJavaScript("arguments[0].style.color = \"#FFC0CB\"", firstLink);

    }


    public BooksSearchResultPage navigateToBooksTab() {
        Selenide
                .$x("//a[@class='Cq34nf hdtb-dd-b sqXXR']")
                .sendKeys(Keys.ENTER);
        Selenide
                .$x("//div[@id='lb']//a[2]")
                .sendKeys(Keys.ENTER);

        return new BooksSearchResultPage();

    }

}





