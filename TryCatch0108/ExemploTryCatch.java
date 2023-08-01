package TryCatch0108;

import javax.swing.JOptionPane;

public class ExemploTryCatch {
    /**
     * Classe que demonstra o uso do try / catch.
     */ 
    public static void main(String[] args) { 
        int n1,n2; 
        try { 
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));  
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro")); 
            JOptionPane.showMessageDialog(null,"O resultado é: " + (n1+n2)); 


        }  catch (Exception e) {  
            JOptionPane.showMessageDialog(null,"ERRO - Valor digitado nao é um numero inteiro!");
           /** TODO: handle exception  */        }

    

}
}