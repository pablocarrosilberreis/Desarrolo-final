package domain.Potenciadores;

public abstract class Potenciador {
    private Integer danioPot;
    private Integer stamina;

    // get/set


    public Integer getDanioPot() {
        return danioPot;
    }

    public void setDanioPot(Integer danioPot) {
        this.danioPot = danioPot;
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }
}
