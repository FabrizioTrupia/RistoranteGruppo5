package Ristorante.FoodAndDrink.EntPort;

import Ristorante.FoodAndDrink.Portata;

/**La classe che fa riferimento ai dessert del Ristorante.FoodAndDrink.Menu
 * @Author Andrea Sciscioli
 * @Version 1
 */
public class Dessert extends Portata {

    /**Metodo costruttore della classe Ristorante.FoodAndDrink.EntPort.Dessert
     * @param type --> tipo della portata Ristorante.FoodAndDrink.EntPort.Dessert
     * @param name --> nome della portata Ristorante.FoodAndDrink.EntPort.Dessert
     * @param price --> prezzo della portata Ristorante.FoodAndDrink.EntPort.Dessert
     * @param piattoDelGiorno --> piatto del giorno
     */
    public Dessert(String type, String name, int price, boolean piattoDelGiorno) {
        super(type, name, price,piattoDelGiorno);
    }
}
