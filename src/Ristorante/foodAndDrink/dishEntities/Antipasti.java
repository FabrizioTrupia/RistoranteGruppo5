package Ristorante.foodAndDrink.dishEntities;

import Ristorante.foodAndDrink.Portata;
import Ristorante.enums.MenuTypeEnum;

/**
 * La classe che fa riferimento agli antipasti che estende la classe Ristorante.FoodAndDrink.Portata
 * @author Alessandro Trupia
 * @version 1
 */
public class Antipasti extends Portata {
    /**
     * metodo costruttore della classe Ristorante.FoodAndDrink.PortEnti.Antipasti
     * @param type --> tipo della portata Ristorante.FoodAndDrink.PortEnti.Antipasti
     * @param name --> nome della portata Ristorante.FoodAndDrink.PortEnti.Antipasti
     * @param price --> prezzo della portata Ristorante.FoodAndDrink.PortEnti.Antipasti
     * @param piattoDelGiorno --> piatto del giorno
     */
    public Antipasti(String type, String name, Integer price, boolean piattoDelGiorno, MenuTypeEnum tipoPortata) {
        super(type, name, price,piattoDelGiorno, tipoPortata);
    }
}
