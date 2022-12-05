package Ristorante.foodAndDrink;

public enum EnumTavoli {
    GRANDE(8),
    MEDIO(4),
    PICCOLO(2);

    Integer postiTavolo;


    EnumTavoli(Integer postiTavolo){
        this.postiTavolo=postiTavolo;
    }
    public Integer getPostiTavolo() {
        return postiTavolo;
    }

}
