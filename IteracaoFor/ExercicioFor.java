package IteracaoFor;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class ExercicioFor {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        for (int i = 0; i < 10; i++) {

            System.out.println("O numero de iteracçao é " + i);
        }

    }

    public void exercicio2() {

        int vetorA[] = new int[] { 1, 2, 3, 4, 5 };

        for (int i = 0; i < 5; i++) {
            System.out.println("O vetor A [" + i + "]=" + vetorA[i]);

        }
    }

    public void exercicio3() {
        double notas[] = new double[4];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + " do Aluno");
            notas[i] = sc.nextDouble();
        } // criei um vetor para as notas e preencer as notas (usuario)
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("nota " + (i + 1) + "= " + notas[i]);
            media += notas[i]; // acumular valor da medias
        } // criei variavel para calcular a media e o vetor de baixo para calcular media e
          // imprimir as notas

        media /= notas.length; // dividir media pelo nº de notas do vetor
        System.out.println("A media do aluno é " + media);

    }



 

public void exercicio4e() { 
    System.out.println("Digite uma Palavra ");
        String palavra = sc.next(); 
        palavra.toLowerCase();   //  toLowerCase transforma tudo que digitar em minusculo  
        int cont= 0;  
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i); 
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {} 
            else { if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {} else {
                cont++; 
                System.out.println(c+ " é consoante");
            }
            } 
            

        } 

        System.out.println(" o nº da consoante é "+cont);
}

}




