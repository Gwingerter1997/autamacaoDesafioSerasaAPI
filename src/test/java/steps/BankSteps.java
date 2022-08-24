package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import maps.AutenticacaoMap;
import maps.BankMap;
import org.junit.Assert;
import utils.RestUtils;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;

public class BankSteps {
    String url = "https://8dac9f4e-fcb2-4e8f-857a-e4ed3497a0d8.mock.pstmn.io/";
    Map<String, Object> param = new HashMap<>();


    @Quando("realizo a consulta dos bancos cadastrado")
    public void realizo_a_consulta_dos_bancos_cadastrado() {
        RestUtils.setBaseURI(url);
        RestUtils.get(ContentType.JSON, "bank");
    }

    @Entao("as informacoes dos cadastro {string} {string} {string} {string} {string}")
    public void as_informacoes_dos_cadastro(String id, String banco, String estadoAtuacao, String juros, String aux) {
        switch (aux) {
            case "0":
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("id[0]"), is(id));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("banco[0]"), is(banco));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("estadoAtuacao[0]"), is(estadoAtuacao));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("juros[0]"), is(juros));
                break;

            case "1":
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("id[1]"), is(id));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("banco[1]"), is(banco));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("estadoAtuacao[1]"), is(estadoAtuacao));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("juros[1]"), is(juros));
                break;

            case "2":
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("id[2]"), is(id));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("banco[2]"), is(banco));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("estadoAtuacao[2]"), is(estadoAtuacao));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("juros[2]"), is(juros));
                break;

            case "3":
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("id[3]"), is(id));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("banco[3]"), is(banco));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("estadoAtuacao[3]"), is(estadoAtuacao));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("juros[3]"), is(juros));
                break;

            case "4":
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("id[4]"), is(id));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("banco[4]"), is(banco));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("estadoAtuacao[4]"), is(estadoAtuacao));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("juros[4]"), is(juros));
                break;
            case "5":
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("id[5]"), is(id));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("banco[5]"), is(banco));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("estadoAtuacao[5]"), is(estadoAtuacao));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("juros[5]"), is(juros));
                break;
            case "6":
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("id[6]"), is(id));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("banco[6]"), is(banco));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("estadoAtuacao[6]"), is(estadoAtuacao));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("juros[6]"), is(juros));
                break;
            case "7":
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("id[7]"), is(id));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("banco[7]"), is(banco));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("estadoAtuacao[7]"), is(estadoAtuacao));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("juros[7]"), is(juros));
                break;
            case "8":
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("id[8]"), is(id));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("banco[8]"), is(banco));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("estadoAtuacao[8]"), is(estadoAtuacao));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("juros[8]"), is(juros));
                break;
            case "9":
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("id[9]"), is(id));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("banco[9]"), is(banco));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("estadoAtuacao[9]"), is(estadoAtuacao));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("juros[9]"), is(juros));
                break;
            case "10":
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("id[10]"), is(id));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("banco[10]"), is(banco));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("estadoAtuacao[10]"), is(estadoAtuacao));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("juros[10]"), is(juros));

        }

    }

    @Quando("realizo a busca dos bancos cadastrado utilizando filtro {string}")
    public void realizo_a_busca_dos_bancos_cadastrado_utilizando_filtro(String estadoAtuacao) {
        param.put("estadoAtuacao", estadoAtuacao);
        RestUtils.setBaseURI(url);
        RestUtils.get(ContentType.JSON, param,"bank");


    }

    @Entao("as informacoes dos cadastro do estado escolhido {string} {string} {string} {string} {string}")
    public void as_informacoes_dos_cadastro_do_estado_escolhido(String id, String banco, String estadoAtuacao, String juros, String aux) {
        switch (aux) {
            case "0":
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("id[0]"), is(id));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("banco[0]"), is(banco));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("estadoAtuacao[0]"), is(estadoAtuacao));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("juros[0]"), is(juros));
                break;

            case "1":
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("id[1]"), is(id));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("banco[1]"), is(banco));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("estadoAtuacao[1]"), is(estadoAtuacao));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("juros[1]"), is(juros));
                break;

            case "2":
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("id[2]"), is(id));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("banco[2]"), is(banco));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("estadoAtuacao[2]"), is(estadoAtuacao));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("juros[2]"), is(juros));
                break;

            case "3":
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("id[3]"), is(id));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("banco[3]"), is(banco));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("estadoAtuacao[3]"), is(estadoAtuacao));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("juros[3]"), is(juros));
                break;

            case "4":
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("id[4]"), is(id));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("banco[4]"), is(banco));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("estadoAtuacao[4]"), is(estadoAtuacao));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("juros[4]"), is(juros));
                break;
            case "5":
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("id[5]"), is(id));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("banco[5]"), is(banco));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("estadoAtuacao[5]"), is(estadoAtuacao));
                Assert.assertThat(RestUtils.getResponse().jsonPath().getString("juros[5]"), is(juros));
                break;
        }

        }
    @Quando("realizo uma requisicao do tipo POST no cadastro de banco")
    public void realizo_uma_requisicao_do_tipo_post_no_cadastro_de_banco() {
        RestUtils.setBaseURI(url);
        RestUtils.post(BankMap.getBody(),ContentType.JSON, "bank");


    }
    @Entao("eu recebo o status code {int}")
    public void eu_recebo_o_status_code(Integer status) {
        Assert.assertEquals(201, RestUtils.getResponse().getStatusCode());


    }
  }