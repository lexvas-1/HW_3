import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class JUnit5ExampleTest {

    @BeforeAll
static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void exampleSearchTest() {

        open("");



    }
}
