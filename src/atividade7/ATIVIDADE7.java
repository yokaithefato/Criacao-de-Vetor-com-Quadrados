
package atividade7;

import java.util.Scanner;

public class ATIVIDADE7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

       
        System.out.println("Digite os 8 elementos do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scanner.nextInt();
        }

       
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
        }

  
        System.out.println("Vetor B (quadrados dos elementos de A):");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}



