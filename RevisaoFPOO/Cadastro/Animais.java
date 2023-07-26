package RevisaoFPOO.Cadastro;

public abstract class Animais {
    // Atributos
    String porte; 
    double peso;
    String proprietario; 
    String genero; 
    String especie;

    //contrutores cheio 
    public Animais(String porte, double peso, String proprietario, String genero, String especie) {
        this.porte = porte;
        this.peso = peso;
        this.proprietario = proprietario;
        this.genero = genero;
        this.especie = especie;
    }    

    //construtor vazio 
    public Animais (){

    }


    //métodos 
    //gets and sets 
    
    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {               
    }

    public String getProprietario() {
        return proprietario;   
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
     

    


          
}
     