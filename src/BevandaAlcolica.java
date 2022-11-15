/**
 * La classe che fa riferimento alle bevande alcoliche che estende la classe Drink
 * @author Nicola boniello
 * @version 1
 */

public class BevandaAlcolica extends Drink{
    /**
     * Metodo costruttore della classe Drink
     *
     * @param type  --> tipo: "Bevanda"
     * @param name  --> nome della bevanda
     * @param price --> prezzo della bevanda
     * @param drinkDelGiorno --> drink del giorno
     */
    public BevandaAlcolica(String type, String name, Integer price, boolean drinkDelGiorno) {
        super(type, name, price, drinkDelGiorno);
    }
}
