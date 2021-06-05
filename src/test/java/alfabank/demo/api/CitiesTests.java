package alfabank.demo.api;

import alfabank.demo.models.DataItem;
import alfabank.demo.models.Response;
import io.qameta.allure.Owner;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

@Tag( "api" )
public class CitiesTests {

    @BeforeEach
    void beforeEach() {
        RestAssured.filters(new AllureRestAssured());
        RestAssured.baseURI = "https://alfabank.ru";
    }

    @Test
    @Owner( ("Ilya Fedorov") )
    @DisplayName("Десериализация в обьект класса,с проверкой что ID городов не пустое")
    void citiesTest() {
        Response cities = get("/api/v1/geo-facade/cities").as(Response.class);

        for ( DataItem field : cities.getData() ) {
            get("/api/v1/geo-facade/cities?path.eq=" + field.getPath())
                    .then()
                    .log().body()
                    .body("data.fiasId", notNullValue());
        }
    }

    @Test
    @Owner("Ilya Fedorov")
    @DisplayName("Проверка Json схемы для города")
    void cityJsonShemaValidation() {
        given()
                .log().uri()
                .log().body()
                .get("/api/v1/geo-facade/cities?path.eq=moscow")
                .then()
                .log().body()
                .body(matchesJsonSchemaInClasspath("jsonshemas/city_response.json"));
    }
}




