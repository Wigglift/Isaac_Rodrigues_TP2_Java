package Exercicio_10;

import java.util.Scanner;
import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(1,100);
        int palpite;
        int tentativas = 0;

        System.out.println("Adivinhe o número secreto entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = ler.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior.");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas!");
            }

        } while (palpite != numeroSecreto);

        ler.close();

    }
}
