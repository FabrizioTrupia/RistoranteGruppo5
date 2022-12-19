package Ristorante.enums;

public enum EnumTavoli {
    GRANDE(8),
    FAMIGLIA(6),
    MEDIO(4),
    PICCOLO(2),
    MINI(1);

    private Integer postiTavolo;


    EnumTavoli(Integer postiTavolo){
        this.postiTavolo=postiTavolo;
    }
    public Integer getPostiTavolo() {
        return postiTavolo;
    }

}
