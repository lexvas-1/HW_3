import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class FillFormTest {

    @Test
    void successfulFillFormTest() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        //перейти на сайт
        open("https://demoqa.com/automation-practice-form");
        //ввести Name
        $("#firstName").setValue("Alexander");
        //ввести LastName
        $("#lastName").setValue("Volodin");
        //ввести Email
        $("#userEmail").setValue("lex@test.ru");
        //выбрать Gender
        $("label[for='gender-radio-1']").click();
        //ввести Mobile
        $("#userNumber").setValue("7123456789");
        //выбрать Date of Birth - месяц, год и день
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("11");
        $(".react-datepicker__year-select").selectOptionByValue("1989");
        $(".react-datepicker__day--015").click();
        //ввести Subjects
        $("#subjectsInput").setValue("Chemistry").pressEnter();
        $("#subjectsInput").setValue("ph").pressEnter();
        //выбрать Hobbies
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        //загрузить Picture
        $("#uploadPicture").uploadFile(new File("src/test/files/image.jpg"));
        //ввести Current Address
        $("#currentAddress").setValue("Lenina Street, 1a");
        //выбрать State
        $("#state").click();
        $("#react-select-3-option-3").click();
        //выбрать City
        $("#city").click();
        $("#react-select-4-option-1").click();
        //нажать Submit
        $("#submit").click();
        //проверить Name и LastName
        $(".table").shouldHave(text("Student Name Alexander Volodin"));
        //проверить Email
        $(".table").shouldHave(text("Student Email lex@test.ru"));
        //проверить Gender
        $(".table").shouldHave(text("Gender Male"));
        //проверить Mobile
        $(".table").shouldHave(text("Mobile 7123456789"));
        //проверить Date of Birth
        $(".table").shouldHave(text("Date of Birth 15 December,1989"));
        //проверить Subjects
        $(".table").shouldHave(text("Subjects Chemistry, Physics"));
        //проверить Hobbies
        $(".table").shouldHave(text("Hobbies 	Sports, Music"));
        //проверить Picture
        $(".table").shouldHave(text("Picture image.jpg"));
        //проверить Current Address
        $(".table").shouldHave(text("Address Lenina Street, 1a"));
        //проверить State и City
        $(".table").shouldHave(text("State and City Rajasthan Jaiselmer"));



    }
}
