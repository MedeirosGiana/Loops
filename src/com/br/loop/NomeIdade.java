package com.br.loop;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        /*
        Faça um programa que leia o conjunto de dois valores,
        o primeiro representa o nome do aluno e o segundo
        representa a sua idade. Pare o programa inserindo o valor 0
        no campo nome.
         */

        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;

        //Enquanto o laço for true, será digitado nome e idade do aluno,
        // quando idade for 0, o programa vai parar.
        while (true){
            System.out.println("Digite o nome do aluno: ");
            nome = scan.next();
            //if comparando se nome é igual a 0 + brak para parar
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Continua aqui...");

    }
}
