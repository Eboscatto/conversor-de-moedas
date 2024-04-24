package br.everaldoboscatto.com.conversor.modelos;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscarMoeda {

    public void converterMoedas(String moedaOrigem, String moedaDestino, double valor) {

        var apiKey = "348084baf336f7d64c63d385";
        var urlApi = "https://v6.exchangerate-api.com/v6/" +
                apiKey + "/pair/" + moedaOrigem + "/" + moedaDestino + "/" + valor;

        // Lançar, capturar e tratar exceções
        try {
            HttpClient client = HttpClient
                    .newHttpClient(); // Fazer requisições
            HttpRequest request = HttpRequest
                    .newBuilder(URI.create(urlApi)).build(); // Configurar requisições
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString()); // Obter resposta das requisições
            // Desserializar String json
            Gson gson = new Gson();
            String json = response.body();
            ReceberMoeda moedaConvertida = gson
                    .fromJson(json, ReceberMoeda.class);
            Moeda moeda = new Moeda(moedaConvertida);
            System.out.println("Valor: "+ valor + " ["+ moedaOrigem +"] " + "corresponde ao valor final de =>>> "
                    + moeda +  " ["+ moedaDestino +"]");
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
