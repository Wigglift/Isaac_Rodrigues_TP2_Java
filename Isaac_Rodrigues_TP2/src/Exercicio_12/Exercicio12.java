package Exercicio_12;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = ler.nextLine();


        String[] palavras = frase.trim().split("\\s+");

        System.out.println("A frase contém " + palavras.length + " palavra(s).");

        ler.close();

    }
}
