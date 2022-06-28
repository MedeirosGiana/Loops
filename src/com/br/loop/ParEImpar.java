package com.br.loop;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        /*
        Faça um programa que peça N numeros inteiros, calcule e
        mostre a quantidade de numeros pares e a qtd. de números ímpares.
         */

        Scanner scan = new Scanner(System.in);
        int quantNumeros;
        int numero;
        int quantPares = 0,quantImpares = 0;

        System.out.println("Informe a quantidade de numemros: ");
        quantNumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();

            //para saber se o numero é par deve-se usar o resto da divisão por 2 == 0, caso contrário é ímpar
            if (numero % 2 == 0) quantPares ++;
            else quantImpares ++;
            count++;
        }while (count < quantNumeros);
        System.out.println("Quantidade de numeros pares = " + quantPares);
        System.out.println("Quantidade de numeros ímpares = " + quantImpares);

    }
}
