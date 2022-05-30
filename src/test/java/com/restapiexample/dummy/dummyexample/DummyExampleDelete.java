package com.restapiexample.dummy.dummyexample;

import com.restapiexample.dummy.model.DummyExamplePojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class DummyExampleDelete extends TestBase {
    @Test
    public void deleteUser() {

        Response response = given()
                .pathParam("id",1)
                .when()
                .delete("delete/{id}");
        response.then().statusCode(200);
        System.out.println("Data is deleted");
        response.prettyPrint();
    }
}
