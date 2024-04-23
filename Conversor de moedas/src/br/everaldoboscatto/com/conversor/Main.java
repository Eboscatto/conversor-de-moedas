package br.everaldoboscatto.com.conversor;
import br.everaldoboscatto.com.conversor.modelos.BuscarMoeda;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // Instanciar a classe
        BuscarMoeda buscarMoeda = new BuscarMoeda();

        // Variaveis dos códigos ISO das moedas
        String COP = "COP"; // Peso colombiano
        String USD = "USD"; // Dólar americano
        String BRL = "BRL"; // Real braileiro
        String ARS = "ARS"; // Peso argentino

        // Inicializar variável
        int opcao = 0;

        // Loop
        while(opcao != 7) {

            System.out.print("""     
                
                 --------------------------------------------------
                 |       BEM VINDO AO CONVERSOR DE MOEDAS         |
                 --------------------------------------------------
                              M E N U 
                 --------------------------------------------------
                  1) Dólar =>> Peso argentino
                  2) Peso argentino =>> Dólar
                  3) Dólar =>> Real brasileiro
                  4) Real brasileiro =>> Dólar
                  5) Dólar =>> Peso colombiano
                  6) Peso colombiano =>> Dólar
                  7) Sarir
                  --------------------------------------------------
                     Escolha uma opção válida:
                  --------------------------------------------------                               
                """);
            System.out.print("Opção: ");
            opcao = leitura.nextInt();

            // Validar opção
            if(opcao == 7) {
                System.out.print("""
                        Espero ter atendido todos os requisitos.
                        Obrigado por escolher meu conversor de moedas.""");
                break;
            }

            // Validar opção
            if (opcao < 1 || opcao > 7) {
                System.out.println("Opção inválida, deve digitar uma opção válida.");
            }

            // Selecionar opção
            switch (opcao){
                case 1:
                    System.out.print("Digite o valor a ser convertido: ");
                    double dolarConvertidoEmPesoArgentino = leitura.nextDouble();
                    buscarMoeda.converterMoedas(USD, ARS, dolarConvertidoEmPesoArgentino);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser convertido: ");
                    double pesoArgentinoConvertidoEmDolar = leitura.nextDouble();
                    buscarMoeda.converterMoedas(ARS, USD , pesoArgentinoConvertidoEmDolar);
                    break;
                case 3:
                    System.out.print("Digite o valor a ser convertido: ");
                    double dolarConvertidoEmReal = leitura.nextDouble();
                    buscarMoeda.converterMoedas(USD, BRL , dolarConvertidoEmReal);
                    break;
                case 4:
                    System.out.print("Digite o valor a ser convertido: ");
                    double realConvertidoEmDolar = leitura.nextDouble();
                    buscarMoeda.converterMoedas(BRL, USD , realConvertidoEmDolar);
                    break;
                case 5:
                    System.out.print("Digite o valor a ser convertido: ");
                    double dolarConvertidoEmPesoColombiano = leitura.nextDouble();
                    buscarMoeda.converterMoedas(USD, COP , dolarConvertidoEmPesoColombiano);
                    break;
                case 6:
                    System.out.print("Digite o valor a ser convertido: ");
                    double pesoColombianoConvertidoEmDolar = leitura.nextDouble();
                    buscarMoeda.converterMoedas(COP, USD , pesoColombianoConvertidoEmDolar);
                    break;
                default:
                    System.out.println("Tente novamente!");
                    break;
            }
        }

    }
}
