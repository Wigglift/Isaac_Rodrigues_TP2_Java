package Exercício_1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        String nome_user;
        String nome_pai;
        String nome_mae;
        Integer idade;


        System.out.println("Escreva seu nome completo:");
        nome_user = ler.nextLine();

        System.out.println("Escreva o nome do seu pai completo:");
        nome_pai = ler.nextLine();

        System.out.println("Escreva o nome da sua mãe completo completo:");
        nome_mae = ler.nextLine();

        System.out.println("Escreva sua idade:");
        idade = ler.nextInt();

        System.out.printf("Seu nome é: %1$s\nSua idade é: %4$s\nO nome da sua mãe é: %2$s\nO nome do seu pai é: %3$s\n\n", nome_user,nome_mae,nome_pai, idade);

        if (nome_user.length() > nome_pai.length()){
            System.out.println("O nome do usuário é maior que o nome do pai");
        } else {
            System.out.println("O nome do usuário é menor que o nome do pai");
        }

        if (nome_user.length() > nome_mae.length()){
            System.out.println("O nome do usuário é maior que o nome da mâe");
        } else {
            System.out.println("O nome do usuário é menor que o nome da mãe");
        }

        ler.close();
    }
}
