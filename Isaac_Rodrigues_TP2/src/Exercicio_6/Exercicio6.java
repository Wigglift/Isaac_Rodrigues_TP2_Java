package Exercicio_6;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = ler.nextInt();

        boolean bissexto = false;

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            bissexto = true;
        }

        if (bissexto) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }

        ler.close();

    }
}
