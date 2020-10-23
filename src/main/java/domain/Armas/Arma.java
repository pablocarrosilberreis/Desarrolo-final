package domain.Armas;

import domain.Potenciadores.PocionRoja;
import domain.Potenciadores.Potenciador;

public abstract class Arma extends Potenciador {

    private Integer danio;
    private Integer danioTotal;
    private Integer stamina;

//

    private void agregarPot(){
        setDanioTotal(getDanioPot()+getDanio());
    }

// get/set

    public Integer getDanioTotal() {
        return danioTotal;
    }

    public void setDanioTotal(Integer danioTotal) {
        this.danioTotal = danioTotal;
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public Integer getDanio() {
        return danio;
    }
    public void setDanio(Integer danio) {
        this.danio = danio;
    }
}
