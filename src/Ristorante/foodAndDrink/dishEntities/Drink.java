package Ristorante.foodAndDrink.dishEntities;


import Ristorante.foodAndDrink.MenuTypeEnum;
import Ristorante.foodAndDrink.Portata;

public class Drink extends Portata {


    public Drink(String type, String name, Integer price, boolean piattoDelGiorno, MenuTypeEnum tipoPortata ) {
        super(type, name, price, piattoDelGiorno, tipoPortata);
    }

    @Override
    public String stampaInfoPortata() {
        return "Tipo: " + getType() + " Nome " + getName() + " Prezzo" + getPrice();
    }
}



