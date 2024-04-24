package br.everaldoboscatto.com.conversor.modelos;

public record ReceberMoeda(
        String valor, String base_code, String target_code, String conversion_rate, String conversion_result) {
}
