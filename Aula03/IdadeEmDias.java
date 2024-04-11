package Aula03;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[]args){
        
        System.out.println("Calculadora de Idade para Dias");

        // Salva o Primeiro numero digitado pelo usuario
        System.out.println("Digite a sua Idade:");
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
            
        //Faz a soma do Primeiro e do Segundo Numero
        int multiplicacao = (idade) * 365;
        System.out.println("Sua idade em dias sao " + multiplicacao);
        
    }
    
    
}