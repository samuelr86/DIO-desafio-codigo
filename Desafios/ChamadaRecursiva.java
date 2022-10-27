package Desafios;

/*
 * Descrição
Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.   

Entrada
A Entrada será composta por um número inteiro, N. 

Saída
Será  impresso o somatório de N até 0, 
 */

import java.util.Scanner;

public class ChamadaRecursiva {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int entrada = leitor.nextInt();

        int somaTotal = somatorio(entrada);

        System.out.println(somaTotal);
    }

    private static int somatorio(int entrada) {
        if(entrada ==0) return 0;
        else{
            return entrada + somatorio(entrada-1);
        }
    }
}
