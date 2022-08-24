package plataformaBanco;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import maps.AutenticacaoMap;
import org.junit.Assert;
import org.junit.Test;
import utils.RestUtils;

import java.net.StandardSocketOptions;

import static io.restassured.RestAssured.authentication;
import static io.restassured.RestAssured.get;

public class PlataformaBancoTest {

    @Test
    public void validarLogin(){
        RestUtils.setBaseURI("https://8dac9f4e-fcb2-4e8f-857a-e4ed3497a0d8.mock.pstmn.io/");
        RestUtils.get(ContentType.JSON,"auth");
        Assert.assertEquals(200, RestUtils.getResponse().getStatusCode());
        AutenticacaoMap.token = RestUtils.getResponse().jsonPath().get("token");
    }
}
