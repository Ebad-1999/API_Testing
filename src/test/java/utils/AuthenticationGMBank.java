package utils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AuthenticationGMBank {
    public static String generatetoken(){
        Map<String,Object> map = new HashMap<>();
        map.put("password", "John.123");
        map.put("rememberMe", true);
        map.put("username", "john_doe");

        Response response = given().
                contentType(ContentType.JSON).when().
                body(map).when().
                post("https://www.gmibank.com//api/authenticate");

        return response.jsonPath().getString("id_token");
    }
}
