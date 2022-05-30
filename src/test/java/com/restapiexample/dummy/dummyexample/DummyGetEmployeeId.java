package com.restapiexample.dummy.dummyexample;


import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class DummyGetEmployeeId extends TestBase {
    @Test
    public void getEmployeeId() {
        Response response = given()
                .pathParam("id", 1)
                .when()
                .get("/employee/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }


}
