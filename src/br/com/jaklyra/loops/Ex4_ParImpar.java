package br.com.jaklyra.loops;

/*
Faça um programa que peça N inteiros,
calcule e mostre a quantidade de numeros pares
e a quantidade de numeros impares
 */

import java.util.Scanner;

public class Ex4_ParImpar {


    public static void main(String[] args){

        int quantidadePares = 0, quantidadeImpares = 0;

        Scanner scan =  new Scanner(System.in);

        System.out.println("Quantos números deseja informar: \n");
        int cont = scan.nextInt();

        do {

           System.out.println("Informe um número: ");
           int numeros = scan.nextInt();


           if(numeros % 2 == 0){
               quantidadePares++;
           }else{
               quantidadeImpares++;
           }

           cont--;

       }while (cont > 0);

        System.out.println("\nForam informados " + quantidadePares + " números pares");
        System.out.println("Foram informados " + quantidadeImpares + " números impares");
    }
}


