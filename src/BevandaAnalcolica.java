/**
 * La classe che fa riferimento alle bevande analcoliche che estende la classe Drink
 * @author Nicola boniello
 * @version 1
 */

public class BevandaAnalcolica extends Drink{
    /**
     * Metodo costruttore della classe Drink
     *
     * @param type  --> tipo: "Bevanda"
     * @param name  --> nome della bevanda
     * @param price --> prezzo della bevanda
     * @param drinkDelGiorno --> drink del giorno
     */
    public BevandaAnalcolica(String type, String name, Integer price, boolean drinkDelGiorno) {
        super(type, name, price, drinkDelGiorno);
    }
}
