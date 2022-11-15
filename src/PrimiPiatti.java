/**
 * La classe che fa riferimento ai PrimiPiatti che estende la classe Portata
 * @author Nicola boniello
 * @version 1
 */
public class PrimiPiatti extends Portata{

    /**
     * metodo costruttore della classe PrimiPiatti
     * @param type --> tipo della portata
     * @param name --> nome della portata
     * @param price --> prezzo della portata
     * @param piattoDelGiorno --> piatto del giorno
     */

    public PrimiPiatti(String type, String name, Integer price, boolean piattoDelGiorno) {
        super(type, name, price,piattoDelGiorno);
    }
}
