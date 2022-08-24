package maps;

import io.restassured.http.ContentType;

import java.util.HashMap;
import java.util.Map;

public class BankMap {

    public static String id;
    private static Map<String, String> header;
    private static Map<String, Object> body;
    private static Map<String, Object> estadoAtuacao;
    private static Map<String, Object> juros;
    private static Map<String, Object> alteracao;
    private static Map<String, Object> banco;

    public static Map<String, Object> getBody() {
        return body;
    }

    public static Map<String, Object> getAlteracao() {
        return alteracao;
    }

    public static Map<String, String> getHeader() {
        return header;
    }
    public static Map<String, Object> getEstadoAtuacao() {
        return estadoAtuacao;
    }

    public static Map<String, Object> getJuros() {
        return juros;
    }

    public static void initHeader(){
        header = new HashMap<>();
        header.put("Authorization", "Bearer "+ AutenticacaoMap.token);
    }
    public static void initbank() {
        body = new HashMap<>();
        body.put("banco", "Banco Teste");
        body.put("estadoAtuacao", "SC");
        body.put("juros", "10,00%");
    }


    public static void initAll(){
        initHeader();
        initbank();

        }


}
