package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.restassured.http.ContentType;

import maps.AutenticacaoMap;
import org.junit.Assert;
import utils.RestUtils;

import static org.junit.Assert.assertEquals;

public class AutenticacaoSteps {
    String url = "https://8dac9f4e-fcb2-4e8f-857a-e4ed3497a0d8.mock.pstmn.io/";

    @Dado("que eu realizo a consulta da autenticacao")
    public void que_eu_realizo_a_consulta_da_autenticacao() {
        RestUtils.setBaseURI(url);
        RestUtils.get(ContentType.JSON, "auth");
    }
    @Entao("eu recebo o status code com valor {int}")
    public void eu_recebo_o_status_code_com_valor(Integer statusCode) {
        Assert.assertEquals(200, RestUtils.getResponse().getStatusCode());
    }
    @Entao("eu recebo o token")
    public void eu_recebo_o_token() {
        AutenticacaoMap.token = RestUtils.getResponse().jsonPath().get("token");
    }
}
