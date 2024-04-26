package br.everaldoboscatto.com.conversor.modelos;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class Moeda {
    private String moedaOrigem;
    private  String moedaAlvo;
    private  Double valorCotacao;
    private String conversao;

    public Moeda(ReceberMoeda moedaConvertida) {
        this.moedaOrigem = moedaConvertida.base_code();
        this.moedaAlvo = moedaConvertida.target_code();
        this.conversao = moedaConvertida.conversion_result();
        this.valorCotacao = Double.valueOf(moedaConvertida.conversion_rate());
    }

    public String getMoedaOrigem() {
        return moedaOrigem;
    }

    public void setMoedaOrigem(String moedaOrigem) {
        this.moedaOrigem = moedaOrigem;
    }

    public String getMoedaAlvo() {
        return moedaAlvo;
    }

    public void setMoedaAlvo(String moedaAlvo) {
        this.moedaAlvo = moedaAlvo;
    }

    public Double getValorCotacao() {
        return valorCotacao;
    }

    public void setValorCotacao(Double valorCotacao) {
        this.valorCotacao = valorCotacao;
    }

    @Override
    public String toString() {
        return " [" + moedaOrigem + "]" + " corresponde ao valor final de =>> " + conversao + " [" + moedaAlvo + "]";
    }
}
