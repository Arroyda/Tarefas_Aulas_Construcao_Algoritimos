package Aula03;

import java.util.Scanner;

public class CalculadoraDeSoma {
    public static void main(String[]args){
        
        System.out.println("Calculadora de Soma");

        // Salva o Primeiro numero digitado pelo usuario
        System.out.println("Digite o primeiro numero:");
        Scanner scanner = new Scanner(System.in);
        int primeironumero = scanner.nextInt();
        
        // Salva o Segundo numero digitado pelo usuario
        System.out.println("Digite o segundo numero:");
        int segundonumero = scanner.nextInt();
        
        //Faz a soma do Primeiro e do Segundo Numero
        int Soma = primeironumero + segundonumero;
        System.out.println(Soma);
        
    }
    
    
}