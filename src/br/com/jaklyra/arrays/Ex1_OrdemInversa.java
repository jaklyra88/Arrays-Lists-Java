package br.com.jaklyra.arrays;

/*
Crie um vetor de 6 números inteiros e mostre-os
an ordem inversa

 */

import java.util.Scanner;

public class Ex1_OrdemInversa {

    public static void main(String[] args){

        int count =0 ;

        //Criando vetor  de mesmo tipo - posição de 0 a 5
       int[] vetor = {65,91,34,2,17,26};

       //Verificando o tamanho do vetor
        System.out.println("O tamanho do vetor é: " + vetor.length);

       //Exibindo os itens do array

        //Contador e o length para contar o tamanho do array
        //while(count <= (vetor.length-1))- Opção para mesma leitura

        System.out.println("Vetor: ");
        while(count < (vetor.length)){

            System.out.print(vetor[count] + " ");
            count++;

        }

        System.out.println("\nVetor Inverso: ");
        for(int i = vetor.length-1; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

    }
}
