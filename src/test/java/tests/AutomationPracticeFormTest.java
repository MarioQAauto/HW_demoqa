package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeFormTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void autoTests() {

        open("/automation-practice-form");

        //Простые поля
        $("#firstName").setValue("Sasha");
        $("#lastName").setValue("Mario");
        $("#userEmail").setValue("email@mail.ru");
        $("#userNumber").setValue("88005553535");
        $(".custom-radio").click();
        $(byText("Music")).click();
        $("#currentAddress").setValue("www leningrad");

        //Выбор объекта
        $(By.id("subjectsInput")).setValue("M").pressEnter();

        //Импорт картинки

        $("#uploadPicture").uploadFromClasspath("test2.png");

        $("#submit").click();

    }
}
