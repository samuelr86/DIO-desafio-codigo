package Desafios;

/*
 * Desafio
Neste desafio, você terá que criar uma função que faça um número como argumento e retorne "Fizz", "Buzz" ou "FizzBuzz". 

Entrada
Você receberá um número onde: 
Se o número for um múltiplo de 3 e 5 -> "FizzBuzz" ; 
Se o número for apenas múltiplo de 3 -> "Fizz" ; 
Se o número for apenas múltiplo de 5 -> "Buzz"; 
Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido; 

Saída
Retorne a palavra correta de acordo com o seu múltiplo. Caso o valor não seja múltiplo de 3 ou 5, exiba o número
 */

import java.util.Scanner;

public class FizzBuzz {
    private static final int MULTIPLO3 = 3;
    private static final int MULTIPLO5 = 5;

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();

        verificador(numero);

    }

    public static void verificador(int numero) {

        if (numero % MULTIPLO3 == 0 & numero % MULTIPLO5 == 0) {
            
            System.out.println("FizzBuzz"); 
            
            
        } 
        
        else if(numero%MULTIPLO3 == 0){
            System.out.println("Fizz");
            
        }
        else if(numero%MULTIPLO5==0){
            System.out.println("Buzz");
        }else{
            System.out.println(numero);
        }
    }
}
