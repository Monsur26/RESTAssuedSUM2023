package basicApproach;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoGETTestNG {

    RequestSpecification httpRequest;
    Response response;

    @BeforeClass
    public void setup(){
        RestAssured.baseURI="https://reqres.in/api/user/";
        //Type of request we are making with our baseURI
        httpRequest= RestAssured.given();
        //what is the request type for the reponse
        response = httpRequest.request(Method.GET,"1");
    }

    @Test(priority =2 )
    public void testStatusCode(){
        int stCode= response.statusCode();
        int expectedCode= 200;
        Assert.assertEquals(expectedCode,stCode,"validation failed");
    }
    @Test (priority = 1)
    public void testStatusLine(){
        String actualSTLine= response.getStatusLine();
        String expectedSTLine="";
        Assert.assertEquals(actualSTLine,expectedSTLine,"Validation Failed!");
    }
}
