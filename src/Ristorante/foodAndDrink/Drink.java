package Ristorante.foodAndDrink;


public class Drink extends Portata{


    public Drink(String type, String name, Integer price, boolean piattoDelGiorno) {
        super(type, name, price, piattoDelGiorno);
    }

    @Override
    public String stampaInfoPortata() {
        return "Tipo bevanda: " + getType() + " Nome della bevanda " + getName() + " Prezzo della bevanda " + getPrice();
    }
}



