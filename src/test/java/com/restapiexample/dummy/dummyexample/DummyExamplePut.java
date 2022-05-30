package com.restapiexample.dummy.dummyexample;

import com.restapiexample.dummy.model.DummyExamplePojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class DummyExamplePut extends TestBase {
    @Test
    public void updateUser() {


       DummyExamplePojo dummyExamplePojo = new DummyExamplePojo();
       dummyExamplePojo.setId(21);
       dummyExamplePojo.setEmployee_name("dhyani");
       dummyExamplePojo.setSalary("50000");
       dummyExamplePojo.setEmployee_age("30");

       Response response = given()
                .header("Content-Type", "application/json")
                .body(dummyExamplePojo)
                .when()
                .put("/update/21");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
