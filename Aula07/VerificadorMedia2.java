package Aula07;

import java.util.Scanner;

public class VerificadorMedia2 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       double media = 0.0;

       /* Registra todas as notas */
       System.out.print("Coloque a nota da AC1: ");
       float AC1 = input.nextFloat();

       System.out.print("Coloque a nota da AC2: ");
       float AC2 = input.nextFloat();

       System.out.print("Coloque a nota da AG: ");
       float AG = input.nextFloat();
       
       System.out.print("Coloque a nota da AF: ");
       float AF = input.nextFloat();

       /* Soma todas as notas e as mutiplica pelo peso certo */
       media = (AC1 * 0.15) + (AC2 * 0.30) + (AG * 0.10) + (AF * 0.45);

        if (media <= 2) {
            System.out.println("Reprovado!");
        } else if (media >= 2.1 && media <= 4.9){
            System.out.println("Fazer Substituta!");
        } else {
            System.out.println("Fazer Aprovado!");
        }
       System.out.println("Sua média final é: " + media);
       input.close();
    }
}
