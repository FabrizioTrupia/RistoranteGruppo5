package Ristorante.foodAndDrink.dishEntities;

import Ristorante.foodAndDrink.Drink;
import Ristorante.foodAndDrink.Portata;
import Ristorante.foodAndDrink.TipoPortate;

/**
 * La classe che fa riferimento alle bevande alcoliche che estende la classe Ristorante.FoodAndDrink.Drink
 * @author Nicola boniello
 * @version 1
 */

public class BevandaAlcolica extends Portata {
    /**
     * Metodo costruttore della classe portata
     *
     * @param type            --> tipo della portata
     * @param name            --> nome del piatto
     * @param price           --> prezzo del piatto
     * @param piattoDelGiorno --> piatto del giorno
     * @param tipoPortata
     */
    public BevandaAlcolica(String type, String name, Integer price, boolean piattoDelGiorno, TipoPortate tipoPortata) {
        super(type, name, price, piattoDelGiorno, tipoPortata);
    }
    /**
     * Metodo costruttore della classe Ristorante.FoodAndDrink.Drink
     *
     * @param type  --> tipo: "Bevanda"
     * @param name  --> nome della bevanda
     * @param price --> prezzo della bevanda
     * @param piattoDelGiorno --> drink del giorno
     */


}
