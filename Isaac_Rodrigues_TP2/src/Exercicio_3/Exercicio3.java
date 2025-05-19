package Exercicio_3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);


        final double DOLAR = 5.20;
        final double EURO = 5.60;
        final double LIBRA = 6.30;

        System.out.print("Digite o valor em reais (R$): ");
        double valorReais = ler.nextDouble();
        ler.nextLine();

        System.out.print("Digite a moeda de destino (dolar, euro ou libra): ");
        String moeda = ler.nextLine().toLowerCase();

        double convertido = 0;
        boolean moedaValida = true;

        switch (moeda) {
            case "dolar":
                convertido = valorReais / DOLAR;
                break;
            case "euro":
                convertido = valorReais / EURO;
                break;
            case "libra":
                convertido = valorReais / LIBRA;
                break;
            default:
                System.out.println("Moeda inválida!");
                moedaValida = false;
        }

        if (moedaValida) {
            System.out.printf("Valor convertido: %.2f %s\n", convertido, moeda);
        }

        ler.close();
    }


}
