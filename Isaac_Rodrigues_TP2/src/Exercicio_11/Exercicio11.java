package Exercicio_11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int valorInicial = ler.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = ler.nextInt();

        System.out.print("Sequência: ");
        for (int i = valorInicial; i <= 100; i += incremento) {
            System.out.print(i);
            if (i + incremento <= 100) {
                System.out.print(", ");
            }
        }

        ler.close();

    }
}
