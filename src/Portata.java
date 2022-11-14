/**
 * La classe che fa riferimento alla portata
 * @author Fabrizio Trupia , Alessandro Trupia , Nicola Boniello , Andrea Sciscioli
 * @version 1
 */

public class Portata {

    /**
     * Tipo della portata
     */
    private String type;

    /**
     * Nome del piatto
     */
    private String name;

    /**
     * Prezzo del piatto
     */
    private Integer price;

    /**
     * Metodo costruttore della classe portata
     * @param type --> tipo della portata
     * @param name --> nome del piatto
     * @param price --> prezzo del piatto
     */
    public Portata(String type, String name,Integer price){
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
