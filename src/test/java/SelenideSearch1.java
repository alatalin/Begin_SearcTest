import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSearch1 {

    @BeforeEach
    void setupfortest() {
        Configuration.browser = "firefox";
    }

    @AfterEach
    void setupaftertest() {
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void succesfulSearchtest() {
        open("https://www.google.ru");
        $("[name=q]").setValue("Selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://ru.selenide.org"));
    }
}

