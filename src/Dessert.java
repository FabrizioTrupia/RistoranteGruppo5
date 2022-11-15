/**La classe che fa riferimento ai dessert del Menu
 * @Author Andrea Sciscioli
 * @Version 1
 */
public class Dessert extends Portata{

    /**Metodo costruttore della classe Dessert
     * @param type --> tipo della portata Dessert
     * @param name --> nome della portata Dessert
     * @param price --> prezzo della portata Dessert
     * @param piattoDelGiorno --> piatto del giorno
     */
    public Dessert(String type, String name, int price, boolean piattoDelGiorno) {
        super(type, name, price,piattoDelGiorno);
    }
}
