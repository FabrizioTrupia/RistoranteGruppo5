package Ristorante.foodAndDrink;


public class Drink extends Portata{


    public Drink(String type, String name, Integer price, boolean piattoDelGiorno) {
        super(type, name, price, piattoDelGiorno);
    }

    @Override
    public String stampaInfoPortata() {
        return "Tipo: " + getType() + " Nome " + getName() + " Prezzo" + getPrice();
    }
}



