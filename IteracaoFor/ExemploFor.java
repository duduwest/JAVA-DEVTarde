package IteracaoFor;

import java.util.Scanner;

public class ExemploFor {

    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        for (int i = 0; i < 100; i++) {
            System.out.println("O Nº da Iteração é " + i);
        }

    }

    public void exemplo2() {
        int vetor[] = new int[10];

        for (int i = 0; i < vetor.length; i++) // tamanho do vetor (((( length))))
        {
            System.out.println("Digite o valor do vetor ["+i+"]:  ");
            vetor[i] =  sc.nextInt(); 
        }

    }
}
