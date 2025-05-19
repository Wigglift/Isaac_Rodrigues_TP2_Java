package Exercicio_7;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário bruto anual (R$): ");
        double salarioBruto = scanner.nextDouble();
        double imposto = 0;

        if (salarioBruto <= 22847.76) {
            imposto = 0;
        } else if (salarioBruto <= 33919.80) {
            imposto = (salarioBruto - 22847.76) * 0.075;
        } else if (salarioBruto <= 45012.60) {
            imposto = (33919.80 - 22847.76) * 0.075 +
                    (salarioBruto - 33919.80) * 0.15;
        } else if (salarioBruto <= 55976.16) {
            imposto = (33919.80 - 22847.76) * 0.075 +
                    (45012.60 - 33919.80) * 0.15 +
                    (salarioBruto - 45012.60) * 0.225;
        } else {
            imposto = (33919.80 - 22847.76) * 0.075 +
                    (45012.60 - 33919.80) * 0.15 +
                    (55976.16 - 45012.60) * 0.225 +
                    (salarioBruto - 55976.16) * 0.275;
        }

        double salarioLiquido = salarioBruto - imposto;

        System.out.printf("Imposto a pagar: R$ %.2f\n", imposto);
        System.out.printf("Salário líquido anual: R$ %.2f\n", salarioLiquido);

        scanner.close();

    }
}
