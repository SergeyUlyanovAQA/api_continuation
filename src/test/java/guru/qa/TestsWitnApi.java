package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestsWitnApi {

    @Test
    void authorizationTest () {

        open("http://demowebshop.tricentis.com/");
        $(".ico-login").click();
        $("#Email").setValue("1221@mail.ru");
        $("#Password").setValue("123qwerty").pressEnter();
    }

}
