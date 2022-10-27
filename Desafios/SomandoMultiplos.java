package Desafios;

/*
 * Desafio
Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.

Entrada
A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda. 

Saída
A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.
 */

import java.util.Scanner;

public class SomandoMultiplos {
    public static void main(String[] args) {

        int A, B;
        
        Scanner leitor = new Scanner(System.in);

        A = leitor.nextInt();
        B = leitor.nextInt();

        // multiplos
        int m = B/A;

        // média aritmética
        int soma = m * (m +1) /2;

        // soma dos multiplos
        int somaTotal = A * soma;

        System.out.println(somaTotal);

    }
}
