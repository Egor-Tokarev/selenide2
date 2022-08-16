import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class Selenide {
    @BeforeAll
        static void config() {
            Configuration.holdBrowserOpen = true;
        }
    @Test
    void selenidehw() {
        open("https://github.com/");
        $(byText("Pricing")).hover();
        $(byText("Compare plans")).click();
        $("Header body").shouldHave(text("Choose the plan that’s right for you."));
    }
}

