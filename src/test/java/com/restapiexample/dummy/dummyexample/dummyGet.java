package com.restapiexample.dummy.dummyexample;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class dummyGet extends TestBase {
    @Test
    public void getEmployeeList() {
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();

        List<?> totalRecords =  response.then().extract().path("data");
        System.out.println(" total records are 24 : " +totalRecords.size());

        int id = response.then().extract().path("data[23].id");
        System.out.println("data[23].id : " +id);

        String employee_name = response.then().extract().path(" data[23].employee_name");
        System.out.println("employee_name : " +employee_name);

        String message = response.then().extract().path("message");
        System.out.println("Message value is : " +message );

        String status = response.then().extract().path("status");
        System.out.println("Message value is : " +status );

        int emp_salary = response.then().extract().path("data[2].employee_salary");
        System.out.println("Salary of employee id 3 : " +emp_salary);

        int emp_age = response.then().extract().path("data[5].employee_age");
        System.out.println("Age of employee id 6 : " +emp_age);

        String nameEmp = response.then().extract().path("data[10].employee_name");
        System.out.println("Name of employee id 11 : " +nameEmp);




    }
}
