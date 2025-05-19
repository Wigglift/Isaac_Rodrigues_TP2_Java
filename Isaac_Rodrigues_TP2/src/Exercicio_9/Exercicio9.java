package Exercicio_9;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.print("Cadastre uma senha: ");
        String senhaCorreta = ler.nextLine();
        String tentativa;

        do {
            System.out.print("Digite a senha novamente: ");
            tentativa = ler.nextLine();

            if (!tentativa.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }

        } while (!tentativa.equals(senhaCorreta));

        System.out.println("Senha correta! Acesso concedido.");

        ler.close();

    }
}
