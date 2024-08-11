package com.example.demo;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasItems;

public class SprintBootMyBatisTestApplicationTests {

    @Test
    public void test() {
        given()
                .when()
                .get("http://localhost:8080/users")
                .then()
                .statusCode(200)
                .body("size()", greaterThanOrEqualTo(1))
                .body("id", hasItems(1, 5, 3));

    }
}
