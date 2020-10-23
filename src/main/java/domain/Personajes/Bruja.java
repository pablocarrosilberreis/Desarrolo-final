package domain.Personajes;

public class Bruja extends Character{
    public Boolean esSiniestro(){
            return true;
    }

    public Boolean esHabil(){
        if(this.getDefensiveSkill() > 3){
            return true;
        }
         return false;
    }

    public Boolean esAgil(){
        if(this.getAttackSpeed() > 6){
            return true;
        }
        return false;
    }

}


