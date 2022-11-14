/**
 * La classe che fa riferimento agli antipasti che estende la classe Portata
 * @author Alessandro Trupia
 * @version 1
 */
public class Antipasti extends Portata{
    /**
     * metodo costruttore della classe Antipasti
     * @param type --> tipo della portata Antipasti
     * @param name --> nome della portata Antipasti
     * @param price --> prezzo della portata Antipasti
     * @param piattoDelGiorno --> piatto del giorno
     */
    public Antipasti(String type, String name, Integer price, boolean piattoDelGiorno) {
        super(type, name, price,piattoDelGiorno);
    }
}
