package br.everaldoboscatto.com.conversor.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HistoricoDeConversoes {
    public void salvarJson(Moeda moeda) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writer = new FileWriter( "Historico.json");
        writer.write(gson.toJson(moeda));
        writer.close();
    }
}
