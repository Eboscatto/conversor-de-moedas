package br.everaldoboscatto.com.conversor.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public void Executar() {
        Scanner leitura = new Scanner(System.in);

        // Declarar variaveis dos códigos ISO das moedas
        var cop = "COP"; // Peso colombiano
        var usd = "USD"; // Dólar americano
        var brl = "BRL"; // Real brasileiro
        var ars = "ARS"; // Peso argentino
        var eur = "EUR";  // Euro

        // Inicializar variável
        int opcao = 0;

        // Loop menu de opções
        while(opcao != 9) {

            System.out.print("""     
                
                 --------------------------------------------------
                 |       BEM VINDO AO CONVERSOR DE MOEDAS         |
                 --------------------------------------------------
                 |                     M E N U                    |
                 --------------------------------------------------
                  1) Dólar =>> Peso argentino
                  2) Peso argentino =>> Dólar
                  3) Dólar =>> Real brasileiro
                  4) Real brasileiro =>> Dólar
                  5) Dólar =>> Peso colombiano
                  6) Peso colombiano =>> Dólar 
                  7) Real brasileiro =>> Euro
                  8) Euro =>> Real brasileiro
                  9) Sair
                  --------------------------------------------------
                  |  Escolha uma opção válida.                     |
                  --------------------------------------------------                               
                """);
            System.out.print("Opção: ");
            opcao = leitura.nextInt();

            // Instanciar a classe
            BuscarMoeda buscarMoeda = new BuscarMoeda();

            // Validar opção de saída
            if(opcao == 9) {
                System.out.print("""
                        Espero ter atendido todos os requisitos.
                        Obrigado por escolher meu conversor de moedas.""");
                break;
            }

            // Validar intervalo de opçoes
            if (opcao < 1 || opcao > 9) {
                System.out.println("Opção inválida, deve digitar uma opção válida.");
            }

            // Selecionar opção
            switch (opcao){
                case 1:
                    System.out.print("Digite o valor a ser convertido: ");
                    double dolarConvertidoEmPesoArgentino = leitura.nextDouble();

                    buscarMoeda.converterMoedas(usd, ars, dolarConvertidoEmPesoArgentino);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser convertido: ");
                    double pesoArgentinoConvertidoEmDolar = leitura.nextDouble();
                    buscarMoeda.converterMoedas(ars, usd, pesoArgentinoConvertidoEmDolar);
                    break;
                case 3:
                    System.out.print("Digite o valor a ser convertido: ");
                    double dolarConvertidoEmReal = leitura.nextDouble();
                    buscarMoeda.converterMoedas(usd, brl, dolarConvertidoEmReal);
                    break;
                case 4:
                    System.out.print("Digite o valor a ser convertido: ");
                    double realConvertidoEmDolar = leitura.nextDouble();
                    buscarMoeda.converterMoedas(brl, usd, realConvertidoEmDolar);
                    break;
                case 5:
                    System.out.print("Digite o valor a ser convertido: ");
                    double dolarConvertidoEmPesoColombiano = leitura.nextDouble();
                    buscarMoeda.converterMoedas(usd, cop, dolarConvertidoEmPesoColombiano);
                    break;
                case 6:
                    System.out.print("Digite o valor a ser convertido: ");
                    double pesoColombianoConvertidoEmDolar = leitura.nextDouble();
                    buscarMoeda.converterMoedas(cop, usd, pesoColombianoConvertidoEmDolar);
                    break;
                case 7:
                    System.out.print("Digite o valor a ser convertido: ");
                    double realConvertidoEmEuro = leitura.nextDouble();
                    buscarMoeda.converterMoedas(brl, eur, realConvertidoEmEuro);
                    break;
                case 8:
                    System.out.print("Digite o valor a ser convertido: ");
                    double euroConvertidoEmReal = leitura.nextDouble();
                    buscarMoeda.converterMoedas(eur, brl, euroConvertidoEmReal);
                    break;
                default:
                    System.out.println("Tente novamente!");
                    break;
            }

        }

    }
}
