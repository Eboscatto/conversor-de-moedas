package br.everaldoboscatto.com.conversor.modelos;

public class Moeda {

    private String conversao;

    public Moeda(ReceberMoeda moedaConvertida) {

        this.conversao = moedaConvertida.conversion_result();
    }

    @Override
    public String toString() {
        return  conversao;
    }
}
