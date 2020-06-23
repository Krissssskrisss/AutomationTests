import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;

public class YahooAnswersPage {

    public List<SelenideElement> getListLink() {

        ElementsCollection searchResults = $$x("div[@id='web']");
        List<SelenideElement> linkList = new ArrayList<>();
        int i = 0;
        for (SelenideElement el : searchResults) {
            linkList.add(el);
        }
        return linkList;
    }

}
