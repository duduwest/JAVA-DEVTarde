package RevisaoFPOO.Cadastro;

public class Outros extends Animais {
    
    String racaOutros;  

    public Outros (String porte, double peso, String proprietario, String genero, String especie, String racaOutros) {
        super(porte, peso, proprietario, genero, especie);
        this.racaOutros = racaOutros;
    }

    public Outros (String racaOutros) {
        this.racaOutros = racaOutros;
    }
    // salva logo 
    

    

    //GETS AND SETTERS
     public String getRacaOutros() {
        return racaOutros;
    }

    public void setRacaOutros(String racaOutros) {
        this.racaOutros = racaOutros;
    }
    

}
