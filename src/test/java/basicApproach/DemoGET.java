package basicApproach;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class DemoGET {
    public static void main(String[] args) {
        //what is our baseURI
        RestAssured.baseURI="https://reqres.in/api/user/";

        //Type of request we are making with our baseURI
        RequestSpecification httpRequest= RestAssured.given();
        //what is the request type for the reponse
        Response response = httpRequest.request(Method.GET,"1");

/*        System.out.println(response.statusCode());
        System.out.println(response.statusLine());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.headers());*/

        int stCode= response.statusCode();
        int expectedCode= 200;

/*        if (expectedCode == stCode) {
            System.out.println("Successfully fetched data");
        } else{
            System.out.println("validation failed");
        }*/
        Assert.assertEquals(expectedCode,stCode,"validation failed");

    }
}
