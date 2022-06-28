package com.br.loop;
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário:
EX: 5! = 120 ou seja (5 x 4 x 3 x 2 x 1).
 */

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicação = 1;
        for (int i = fatorial; i >= 1; i-- ){
            multiplicação= multiplicação * i;
        }
        System.out.println("Fatorial "+ fatorial + "! = " + multiplicação);
    }
}
