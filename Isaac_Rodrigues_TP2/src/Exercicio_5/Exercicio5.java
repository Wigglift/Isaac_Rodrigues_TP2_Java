package Exercicio_5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valor = ler.nextDouble();
        double desconto = 0;

        if (valor > 1000) {
            desconto = 0.10; // 10%
        } else if (valor >= 500) {
            desconto = 0.05; // 5%
        }

        double valorDesconto = valor * desconto;
        double valorFinal = valor - valorDesconto;

        System.out.printf("Valor original: R$ %.2f\n", valor);
        System.out.printf("Desconto: R$ %.2f\n", valorDesconto);
        System.out.printf("Valor final com desconto: R$ %.2f\n", valorFinal);

        ler.close();

    }
}
