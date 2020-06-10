import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class BooksSearchResultPage {


    public String searchHarryPotterText(String text){
        Selenide.$x("//div[@id='rso']").getText();

        return text;
    }

}

