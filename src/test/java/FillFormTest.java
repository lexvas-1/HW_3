import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class FillFormTest {

    @Test
    void successfulFillFormTest() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";

        open("https://demoqa.com/automation-practice-form");
        //$("[name=q]").setValue("selenide").pressEnter();
        //$("[id=search]").shouldHave(text("https://selenide-test2.org"));
        sleep(5000);
    }
}
