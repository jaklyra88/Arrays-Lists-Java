package br.com.jaklyra.loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números

 */


import java.util.Scanner;

public class Ex3_MaiorEMedia {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

       int cont = 0;
       int maior = 0;
       int soma = 0;

        do{
            System.out.println("Informe o " + (cont+1) + "º número: ");
            int numero = scan.nextInt();
            soma = soma + numero;

            if(maior < numero){
                maior = numero;

            }
            cont++ ;

        }while( cont < 5);

        int media = soma /5;

        System.out.println("O maior número é: " + maior);
        System.out.println("A média dos números é: " + media);
    }

}
