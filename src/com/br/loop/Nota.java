package com.br.loop;

import java.util.Scanner;

/*
Faça um programa que peça uma nota entre 0 e 10.
Mostre a mensagem caso ela seja inválida, e continue pedindo
até aque o usuário informe um valor válido.
 */
public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Informe uma nota: ");
        nota = scan.nextInt();

        //cod. abaixo,enquanto a nota for menor que 0 ou maior que 10
        while (nota < 0 || nota > 10){
            //será apresentado na tela a mensagem abaixo
            System.out.println("Nota inválida, digite novamente: ");
            //comando para digitar novamente a nota
            nota = scan.nextInt();
        }

    }
}
