import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import java.util.LinkedList;
import java.util.List;

public class GoogleImagePage {

    public List<SelenideElement> getSearchResult() {

        Selenide.screenshot("Funny kittens screenshot");

        return new LinkedList<>();
    }

}
