package Exercicio_2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        double soma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a " + i + "° nota: ");
            double nota = ler.nextDouble();
            soma += nota;
        }

        double media = soma / 4;

        System.out.println("\nSua média é: " + media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else if (media >= 5) {
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Situação: Reprovado");
        }

        ler.close();


    }
}
