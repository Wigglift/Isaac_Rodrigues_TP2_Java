package Exercicio_8;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o comprimento do lado A: ");
        double a = ler.nextDouble();
        System.out.print("Digite o comprimento do lado B: ");
        double b = ler.nextDouble();
        System.out.print("Digite o comprimento do lado C: ");
        double c = ler.nextDouble();


        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os lados informados não formam um triângulo válido.");
        }

        ler.close();

    }
}
