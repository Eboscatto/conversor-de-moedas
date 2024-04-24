package br.everaldoboscatto.com.conversor.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HistoricoDeConversoes {

    public void salvarJson(Moeda moedaConvertida) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writer = new FileWriter(moedaConvertida.getValorCotacao() + "Historico.json");
        writer.write(gson.toJson(moedaConvertida));
        writer.close();
    }
}
