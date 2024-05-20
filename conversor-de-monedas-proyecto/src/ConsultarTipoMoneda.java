import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarTipoMoneda {
   public DivisaRecord filtrarMoneda(String monedaBase, String monedaConvertir){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/6295fda10a306a5593b43d03/pair/" + monedaBase + "/" + monedaConvertir);
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(respuesta.body(), DivisaRecord.class);
        } catch (Exception e){
            throw new RuntimeException("No se encontro el tipo de moneda solicitado");
        }
    }
}
