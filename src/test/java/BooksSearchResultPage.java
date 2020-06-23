import com.codeborne.selenide.Selenide;

public class BooksSearchResultPage {
    public String searchHarryPotterText(String text) {

        Selenide.$x("//div[@id='rso']").getText();
        return text;
    }

}

