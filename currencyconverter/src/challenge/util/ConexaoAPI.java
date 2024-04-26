package challenge.util;

import challenge.modelo.MoedaAPI;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexaoAPI {

    private final Gson gson = new Gson();

    public MoedaAPI pesquisaMoeda(String codigo) throws IOException, InterruptedException {
        String endereco = String.format("https://v6.exchangerate-api.com/v6/247eda6115d994c36e9c659e/latest/%s",
                codigo);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        return gson.fromJson(json, MoedaAPI.class);
    }
}
