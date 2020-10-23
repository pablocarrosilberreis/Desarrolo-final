package domain.Personajes;

public class Personalidad extends Character {
    public void calcularPersonalidad(){
        if(this.esSiniestro() && this.esHabil()){
            this.setPersonalidad("Desafiante");
        }else {
            this.setPersonalidad("Sumiso");
        }
    }
}
