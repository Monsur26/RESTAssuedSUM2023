package basicApproach;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DemoDelete {
    public static void main(String[] args) {
        //what is our baseURI
        RestAssured.baseURI="https://reqres.in/api/user/";

        //Type of request we are making with our baseURI
        RequestSpecification httpRequest= RestAssured.given();
        //what is the request type for the reponse
        Response response = httpRequest.request(Method.DELETE,"3");

        System.out.println(response.statusCode());
    }
}
