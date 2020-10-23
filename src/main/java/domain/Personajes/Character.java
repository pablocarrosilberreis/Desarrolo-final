package domain.Personajes;

public abstract class Character {

    //Vars
    private Integer nombre;
    private Integer healthPoint;
    private Integer stamina;
    private Integer intelegence;
    private Integer attackSpeed;
    private Integer offensiveSkill;
    private Integer defensiveSkill;
    private Integer baul;
    private Integer destreza;
    private String personalidad;

    //Bools
    public Boolean esHabil(){
        return true;
    }
    public Boolean esAgil(){
        return true;
    }
    public Boolean esSiniestro(){
        return true;
    }


    //Voids

    public void entrena(){
    }

    public void practicarAtaque(){

    }
    public void ataca(){

    }


    //things
    private Double intelicengia(){
        return Double.valueOf((this.defensiveSkill+10*getAttackSpeed())/this.attackSpeed/this.offensiveSkill);
    }


    //Getter & setter


    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public Integer getDestreza() {
        return destreza;
    }

    public void setDestreza(Integer destreza) {
        this.destreza = destreza;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public Integer getIntelegence() {
        return intelegence;
    }

    public void setIntelegence(Integer intelegence) {
        this.intelegence = intelegence;
    }

    public Integer getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(Integer attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public Integer getOffensiveSkill() {
        return offensiveSkill;
    }

    public void setOffensiveSkill(Integer offensiveSkill) {
        this.offensiveSkill = offensiveSkill;
    }

    public Integer getDefensiveSkill() {
        return defensiveSkill;
    }

    public void setDefensiveSkill(Integer defensiveSkill) {
        this.defensiveSkill = defensiveSkill;
    }

    public Integer getBaul() {
        return baul;
    }

    public void setBaul(Integer baul) {
        this.baul = baul;
    }
}
