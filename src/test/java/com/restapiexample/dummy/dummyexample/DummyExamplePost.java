package com.restapiexample.dummy.dummyexample;

import com.restapiexample.dummy.model.DummyExamplePojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class DummyExamplePost extends TestBase {
    @Test
    public void createUser() {


       DummyExamplePojo dummyExamplePojo = new DummyExamplePojo();
       dummyExamplePojo.setName("test");
       dummyExamplePojo.setSalary("123");
       dummyExamplePojo.setAge(23);

       Response response = given()
                .header("Content-Type", "application/json")
                .body(dummyExamplePojo)
                .when()
                .post("/create");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
