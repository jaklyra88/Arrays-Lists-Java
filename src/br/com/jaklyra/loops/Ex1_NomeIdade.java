package br.com.jaklyra.loops;

/*
Faça um programa que leia conjuntos de dois valores;
o primeiro representando o nomde do aluno e o segundo representando a sua idade
pare o programa inserindo o valor 0 no campo nome
 */


import java.util.Scanner;

public class Ex1_NomeIdade {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("Nome: ");
            String nome = scanner.next();

            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            int idade = scanner.nextInt();

        }


    }

}
