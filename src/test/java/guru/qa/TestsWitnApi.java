package guru.qa;

import com.codeborne.selenide.Condition;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;


public class TestsWitnApi {

    @Test
    void demoWebShopsApiTest() {
        Response response =
        given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .body("addtocart_22.EnteredQuantity=1")
                .cookie("NOPCOMMERCE.AUTH=DCDA0FFD929C196EAF3257D9E403D900D23BCEC50CBB6AA5D4ABFFC02CF" +
                        "696BC891B75394329FF21132EC0EFD83FB9CE5BB831E6DDBD94825149D4AC735659ACFD235903E91FFF5F" +
                        "6612BBDA774D63D8CE5B7A6A0EC19E5A0AE0EFF954D283967E2854AA621BE8E1545FBD472683E15C00D0" +
                        "5355FAEE0ACA69B6D894A98D5A30; ")
                .when()
                .post("http://demowebshop.tricentis.com/addproducttocart/details/22/1")
                .then()
                .statusCode(200)
                .body("success", is(true))
                .body("updatetopcartsectionhtml", is(notNullValue()))
                .extract().response();
        System.out.println(response.asString());

    }
}
