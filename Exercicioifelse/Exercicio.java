package Exercicioifelse;

import java.util.Scanner;

public class Exercicio {

    Scanner sc = new Scanner(System.in);

    public void exercicio1() {

        System.out.println("Informe o 1º (Primeiro Valor)");
        int valor1 = sc.nextInt();
        System.out.println("Informe o 2º (segundo Valor)");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println("O 1º Valor é maior " + valor1);
        } else {
            System.out.println("O 2º Valor é maior" + valor2);
        }

    }

    public void exercicio2() {
        System.out.println("Informe seu ano de nascimento");
        int AnoDeNascimento = sc.nextInt();
        if (AnoDeNascimento <= 2007) {
            System.out.println("pode votar");
        } else if (AnoDeNascimento >= 2006) {
            System.out.println("Não pode votar");
        }

    }

    
    public void exercicio3() {
            System.out.println("Informe sua senha");
            int senha = sc.nextInt(); 
            if (senha == 1234) { 
                System.out.println("ACESSO PERMITIDO");
             } else { 
        System.out.println("ACESSO NEGADO");
    }
}  

public void exercicio4() {
    System.out.println("informe quantas maças voce comprou");
    double maça;
    maça = 0,30
    
    
    
        
    }

    
}


