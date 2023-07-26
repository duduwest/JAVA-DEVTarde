package RevisaoFPOO;

import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Animais;
import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.Outros;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Cachorro[] cachorro = new Cachorro[5];
        Gato gato[] = new Gato[5];
        Outros outros[] = new Outros[5];
        boolean veterinarioAberta = true;
        int contcachorro = 0;
        int contgato = 0;
        int contoutros = 0;
        int animalAtual = 0;

        while (veterinarioAberta) {
            int acao1 = Integer.parseInt(JOptionPane.showInputDialog("Informe qual animal quer cadastrar:"
                    + "\n 1 - Cadastrar cachorro;"
                    + "\n 2 - Cadastrar gato;"
                    + "\n 3 - Acessar Cadastro de cachorro;"
                    + "\n 4 - Acessar Cadastro de gato;")); 

            if (acao1 == 1) {   
                cachorro[contcachorro] = new Cachorro(); 
                cachorro[contcachorro].setProprietario(JOptionPane.showInputDialog("Informe o Nome do proprietario:"));
                cachorro[contcachorro].setIdAnimal(100 + contcachorro + 1); 
                






            }

        }
    }
}
