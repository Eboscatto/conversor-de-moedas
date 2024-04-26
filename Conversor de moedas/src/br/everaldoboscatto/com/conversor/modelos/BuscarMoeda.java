package br.everaldoboscatto.com.conversor.modelos;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class BuscarMoeda {
    public void converterMoedas(String moedaOrigem, String moedaAlvo, double valor ) {

        var apiKey = "348084baf336f7d64c63d385";
        var urlApi = "https://v6.exchangerate-api.com/v6/" +
                apiKey + "/pair/" + moedaOrigem + "/" + moedaAlvo + "/" + valor;

        // Lançar exceções
        try {
            HttpClient client = HttpClient
                    .newHttpClient(); // Fazer requisições
            HttpRequest request = HttpRequest
                    .newBuilder(URI.create(urlApi))
                    .build(); // Configurar requisições
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString()); // Obter resposta das requisições
             // Desserializar String json
            String json = response.body();
            Gson gson = new Gson();
            ReceberMoeda receberMoeda = gson
                    .fromJson(json, ReceberMoeda.class);
            Moeda moeda = new Moeda(receberMoeda);
            System.out.println("Valor: "+ valor + moeda.toString());

            // Gravar histórico
            HistoricoDeConversoes historico = new HistoricoDeConversoes();
            historico.salvarJson(moeda);


        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
    }

}
