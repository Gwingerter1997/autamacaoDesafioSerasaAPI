package utils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.Map;

public class RestUtils {
    private static Response response;


    public static Response getResponse() {
        return response;
    }

    public static void setBaseURI(String uri){
        RestAssured.baseURI = uri;
    }

    public static String getBaseUri(){
        return RestAssured.baseURI;
    }

    public static Response get(ContentType contentType, String endpoint){
        return response =  RestAssured.given()
                .relaxedHTTPSValidation()
                .contentType(contentType)
                .when()
                .get(endpoint)
                .thenReturn();
    }



    public static Response get(ContentType contentType,Map<String, Object> param, String endpoint){
        return response =  RestAssured.given()
                .relaxedHTTPSValidation()
                .contentType(contentType)
                .params(param)
                .when()
                .get(endpoint)
                .thenReturn();
    }
    public static Response post(Map<String, Object> body, ContentType contentType, String endpoint){
        return response = RestAssured.given()
                .relaxedHTTPSValidation()
                .contentType(contentType)
                .when()
                .post(endpoint)
                .thenReturn();
    }
    public static Response get(Map<String, String> header, String endpoint) {
        return response = RestAssured.given()
                .relaxedHTTPSValidation()
                .headers(header)
                .when()
                .get(endpoint)
                .thenReturn();
    }

}

