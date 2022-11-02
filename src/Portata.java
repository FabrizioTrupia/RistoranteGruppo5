/**
 * La classe che fa riferimento alla portata
 * @author Fabrizio Trupia , Alessandro Trupia , Nicola Boniello , Andrea Sciscioli
 * @version 1
 */

public class Portata {

    /**
     * Tipo della portata
     */
    public String type;

    /**
     * Nome del piatto
     */
    public String name;

    /**
     * Prezzo del piatto
     */
    public int price;

    /**
     * Metodo costruttore della classe portata
     * @param type --> tipo della portata
     * @param name --> nome del piatto
     * @param price --> prezzo del piatto
     */
    public Portata(String type, String name,int price){
        this.type = type;
        this.name = name;
        this.price = price;
    }

    /**
     * Metodo to string della classe portata
     * @return i parametri: type , name, price della classe portata
     */
    @Override
    public String toString() {
        return "Portata: " + type + " , Nome del piatto: " + name + " , Prezzo: " + price + " euro";
    }

}
