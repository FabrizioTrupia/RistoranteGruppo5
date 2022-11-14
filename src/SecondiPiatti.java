/**
 * La classe che fa riferimento ai Secondi piatti che estende la classe Portata
 * @author Fabrizio Trupia
 * @version 1
 */
public class SecondiPiatti extends Portata{

    /**
     * metodo costruttore della classe SecondiPiatti
     * @param type --> tipo di portata
     * @param name --> nome del piatto
     * @param price --> prezzo del piatto
     * @param piattoDelGiorno  --> piatto del giorno
     */
    public SecondiPiatti(String type, String name, Integer price, boolean piattoDelGiorno) {

        super(type, name, price, piattoDelGiorno);
    }
}
