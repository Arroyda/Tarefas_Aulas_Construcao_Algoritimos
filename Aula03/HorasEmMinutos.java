package Aula03;

import java.util.Scanner;

public class HorasEmMinutos {
    public static void main(String[]args){
        
        System.out.println("Calculadora de Horas para Minutos");

        // Salva o Primeiro numero digitado pelo usuario
        System.out.println("Digite a quantia de Horas:");
        Scanner scanner = new Scanner(System.in);
        int horas = scanner.nextInt();
            
        //Faz a soma do Primeiro e do Segundo Numero
        int multiplicacao = (horas) * 60;
        System.out.println(horas + "h" + " sao " + multiplicacao + " minutos ");
        
    }
    
    
}