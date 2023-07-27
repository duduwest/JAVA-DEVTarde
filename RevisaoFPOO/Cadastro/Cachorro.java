package RevisaoFPOO.Cadastro;

public class Cachorro extends Animais {  
    
    String racaDog ; 

    //construtor 

    public Cachorro(String porte, double peso, String proprietario, String genero, String especie, String racaDog) {
        super(porte, peso, proprietario, genero, especie);
        this.racaDog = racaDog;
    }

    public Cachorro() {
        this.racaDog = racaDog;
    }

    

    //GETS AND SETTERS
     public String getRacaDog() {
        return racaDog;
    }

    public void setRacaDog(String racaDog) {
        this.racaDog = racaDog;
    }
    

   

    
    

    
    


   
    
}
