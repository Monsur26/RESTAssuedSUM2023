package basicApproach;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

public class DemoPOST {
    public static void main(String[] args) {
        //what is our baseURI
        RestAssured.baseURI="https://reqres.in/api/user";

        //Type of request we are making with our baseURI
        RequestSpecification httpRequest= RestAssured.given();

        JSONObject reqParam= new JSONObject();
        reqParam.put("name","Jack");
        reqParam.put("job","Actor");

        httpRequest.header("Content-Type","application/json");
        httpRequest.body(reqParam.toJSONString());

        //what is the request type for the reponse
        Response response = httpRequest.request(Method.POST,"");


        System.out.println(response.statusCode());
    }
}
