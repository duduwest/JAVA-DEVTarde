package RevisaoFPOO.Cadastro;

public class Gato extends Animais {

    String racaCat; 

    //construtor 

    public Gato(String porte, double peso, String proprietario, String genero, String especie, String racaCat) {
        super(porte, peso, proprietario, genero, especie);
        this.racaCat = racaCat;
    }

    public Gato(String racaCat) {
        this.racaCat = racaCat;
    }

    

    //GETS AND SETTERS
     public String getRacaCat() {
        return racaCat;
    }

    public void setRacaCat(String racaCat) {
        this.racaCat = racaCat;
    }
    

}
