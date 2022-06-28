package com.br.loop;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        /*
       Desenvolva um gerador de tabuada,capaz de gerar a tabuada de
       qualquer numero inteiro entre 1 e 10. O usuário deve informar
       de qual númemro ele deseja ver a tabuada.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de "+ tabuada);

        //usando laço for
        /*for (int i = 1; i <= 10; i++ ){
            System.out.println(tabuada + "x" + i + "=" + (tabuada*i));
        }*/

        //usando laço while
        int count = 1;
        while (count <= 10){
            System.out.println(tabuada + "x" + count + "=" + (tabuada * count));
            count++;
        }
    }
}
