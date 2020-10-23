package domain.Personajes;

public class Mago extends Character{
    public Boolean esSiniestro(){
        if(this.getOffensiveSkill() > 20 ){
            return true;
        }
        return false;
    }

    public Boolean esHabil(){
        if(this.getDefensiveSkill() > 33){
            return true;
        }
        return false;
    }

    public Boolean esAgil(){
        return true;
    }

}
