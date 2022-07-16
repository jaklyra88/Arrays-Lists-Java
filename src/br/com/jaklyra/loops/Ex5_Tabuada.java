package br.com.jaklyra.loops;

/*
Desenvolva um gerador de tabuada,capas de gerar a tabuada
de qualquer numero inteiro entre 1 a 10.
O usuário deve informar qual número ele deseja ver a tabuada.
A saída deve der conforme o exemplo:

Tabuada do 5:

5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50;


 */

import java.util.Scanner;

public class Ex5_Tabuada {

    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a tabuada desejada de 1 a 10: ");
        int tabuada = scan.nextInt();
        System.out.println("Tabuada do : " + tabuada );

        for(int i = 1; i <=10; i++){

            int soma = tabuada * i;

            System.out.println(tabuada + " X " + i + " = " + soma);
        }

    }
}
