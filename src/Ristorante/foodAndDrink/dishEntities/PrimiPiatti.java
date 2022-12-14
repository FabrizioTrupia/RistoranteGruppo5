package Ristorante.foodAndDrink.dishEntities;

import Ristorante.foodAndDrink.Portata;
import Ristorante.enums.MenuTypeEnum;


/**
 * La classe che fa riferimento ai Ristorante.FoodAndDrink.PortEnti.PrimiPiatti che estende la classe Ristorante.FoodAndDrink.Portata
 * @author Nicola boniello
 * @version 1
 */
public class PrimiPiatti extends Portata {

    /**
     * metodo costruttore della classe Ristorante.FoodAndDrink.PortEnti.PrimiPiatti
     * @param type --> tipo della portata
     * @param name --> nome della portata
     * @param price --> prezzo della portata
     * @param piattoDelGiorno --> piatto del giorno
     */

    public PrimiPiatti(String type, String name, Integer price, boolean piattoDelGiorno, MenuTypeEnum tipoPortata) {
        super(type, name, price,piattoDelGiorno, tipoPortata);
    }
}
