package com.br.beecrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        /*
            Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo.
            O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade
            média deste grupo de indivíduos.

            Entrada
            A entrada contém um número indeterminado de inteiros.
            A entrada será encerrada quando um valor negativo for lido.
         */

        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        Double soma = 0d;
        Double media = 0d;

        System.out.println("digite as idades: ");

        while (true){
            Integer idade = sc.nextInt();

            if (idade < 0){
                break;
            } else{
                numeros.add(idade);
            }
        }

        for (Integer idade : numeros){
            soma += idade;
            media = soma / numeros.size();
        }

        System.out.println("Media " + media);

    }
}
