package com.br;

import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        //Faça um programa que recebe o salário de um colaborador
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salario: ");
        double salColaborador = scan.nextDouble();
       /*
        E o reajuste segundo o seguinte critério, baseado no salário atual:
        a. Salários até R$ 280,00 (incluindo): aumento de 20%;
        b. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
        c. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
        d. Salários de R$ 1500,00 em diante: aumento de 5%*/

        double reajuste = 0.00;
        double salAtual;
        double ajuste;

        if (salColaborador < 280) {
            reajuste = 0.20;
        }
        else if (salColaborador > 280 && salColaborador < 700) {
            reajuste = 0.15;
        }
        else if (salColaborador >= 700 && salColaborador < 1500) {
            reajuste = 0.10;
        }
        else if (salColaborador >= 1500) {
            reajuste = 0.5;
        }

        ajuste = (salColaborador * reajuste)/100;
        salAtual = salColaborador + ajuste;
        /*
        Após o aumento ser realizado; informe na tela;
        a. O salário antes do reajuste;
        b. O percentual de aumento aplicado;
        c. O valor do aumento;
        d. O novo salário, após o aumento*/

        System.out.println("Salario antes do Reajuste: "+ salColaborador);
        System.out.println("Percentual de aumento aplicado: " + ajuste + "%");
        System.out.println("Valor do aumento: " + ajuste);
        System.out.println("Novo salario com aumento: " + salAtual);
    }
}
