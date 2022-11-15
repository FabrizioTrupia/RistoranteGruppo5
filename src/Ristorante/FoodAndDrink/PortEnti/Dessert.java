package Ristorante.FoodAndDrink.PortEnti;

import Ristorante.FoodAndDrink.Portata;

/**La classe che fa riferimento ai dessert del Ristorante.FoodAndDrink.Menu
 * @Author Andrea Sciscioli
 * @Version 1
 */
public class Dessert extends Portata {

    /**Metodo costruttore della classe Ristorante.FoodAndDrink.PortEnti.Dessert
     * @param type --> tipo della portata Ristorante.FoodAndDrink.PortEnti.Dessert
     * @param name --> nome della portata Ristorante.FoodAndDrink.PortEnti.Dessert
     * @param price --> prezzo della portata Ristorante.FoodAndDrink.PortEnti.Dessert
     * @param piattoDelGiorno --> piatto del giorno
     */
    public Dessert(String type, String name, int price, boolean piattoDelGiorno) {
        super(type, name, price,piattoDelGiorno);
    }
}
