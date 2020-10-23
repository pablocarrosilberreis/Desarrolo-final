package domain.Personajes;

import javax.swing.text.StyledEditorKit;

public class Ladron extends Character {

    public Boolean esAgil(){
        if(this.getAttackSpeed() >= 10){
            return true;
        }
        return false;
    }

    public Boolean esHabil(){
        return true;
    }

    public Boolean esSiniestro(){
        if(this.getOffensiveSkill() > 10 ){
            return true;
        }
        return false;
    }

}
