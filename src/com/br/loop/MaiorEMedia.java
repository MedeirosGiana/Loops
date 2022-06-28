package com.br.loop;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        /*
        Faça um programa que leia 5 numeros
        e informe o maior número e a média desses números
         */
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("numero: ");
            numero = scan.nextInt();
            soma = soma + numero;

            if (numero > maior) maior = numero;
            count++;
        }while (count < 5);
        System.out.println("Maior numero: " + maior);
        System.out.println("Media: " + soma/5);

    }
}
