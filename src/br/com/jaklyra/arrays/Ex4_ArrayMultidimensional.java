package br.com.jaklyra.arrays;

/*
Gere e imprima uma matriz M 4X4 com valores aleatorios entre 0-9

 */

import java.util.Random;

public class Ex4_ArrayMultidimensional {

    public static void main(String[] args){

        Random random = new Random();

        //Criando o objeto matriz
        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){

                M[i][j] = random.nextInt(9);
            }

        }

        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for (int elementoColuna : linha) {
                System.out.print(elementoColuna + " ");
            }
            System.out.println();
        }

        }
}
