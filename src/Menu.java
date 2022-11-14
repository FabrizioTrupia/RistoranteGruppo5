import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * La classe che fa riferimento al menu
 * @author Fabrizio Trupia , Alessandro Trupia , Nicola Boniello , Andrea Sciscioli
 * @version 1
 */
public class Menu {

    /**
     * Il tipo di menu
     */
    private String type;

    /**
     * Il nome del ristorante
     */
    private String name;

    /**
     * costo del coperto
     */
    private Integer coperto;

    /**
     * Lista delle portate
     */
    private List<Portata> portataList = new ArrayList<>();

    /**
     * Lista delle bevande
     */
    private List<Drink> drinkList = new ArrayList<>();

    /**
     * Il costruttore del menu
     *
     * @param type    --> menu
     * @param name    --> nome del ristorante
     * @param coperto --> prezzo del coperto
     */
    public Menu(String type, String name, Integer coperto) {
        this.type = type;
        this.name = name;
        this.coperto = coperto;
    }

    /**
     * Metodo to string della classe menu
     *
     * @return i parametri: type , name, coperto della classe menu
     */

    @Override
    public String toString() {
        return "Tipo di menu: " + type + " Nome del ristorante: " + name + " Coperto: " + coperto + " euro";
    }

    /**
     * Un metodo che aggiunge le portate all lista "portataList"
     *
     * @param portata --> parametro che richiama la classe Portata
     */
    public void addPortata(Portata portata) {
        portataList.add(portata);
    }

    /**
     * Un metodo che aggiunge i drink all lista "drinkList"
     *
     * @param drink --> parametro che richiama la classe Drink
     */
    public void addDrink(Drink drink) {
        drinkList.add(drink);
    }

    /**
     * Metodo che rimuove una portata dalla lista "portataList"
     *
     * @param portata --> parametro che richiama la classe Portata
     */
    public void removePortata(Portata portata) {

        portataList.remove(portata);
    }

    /**
     * Un metodo per stampare il menu
     */
    public void stampaMenu() {
        portataList.forEach(System.out::println);
        drinkList.forEach(System.out::println);
    }

    public void stampaPiattoDelGiorno() {
        for (Portata piattoDelGiorno : portataList) {
            if (piattoDelGiorno.isPiattoDelGiorno()) {
                System.out.println("Piatto del giorno raccomandato: " + piattoDelGiorno.getType() + " = " + piattoDelGiorno.getName() + " - " + piattoDelGiorno.getPrice() + " euro ");
            }
        }

    }

    public void stampaBevandaDelGiorno(){
        for (Drink drinkDelGiorno:drinkList) {
            if (drinkDelGiorno.isDrinkDelGiorno()) {
                System.out.println("Bevanda del giorno raccomandata: " + drinkDelGiorno.getType() + " = " + drinkDelGiorno.getName() + " - " + drinkDelGiorno.getPrice() + " euro ");
            }
        }
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

    public Integer getCoperto() {
        return coperto;
    }

    public void setCoperto(Integer coperto) {
        this.coperto = coperto;
    }

    public List<Portata> getPortataList() {
        return portataList;
    }

    public void setPortataList(List<Portata> portataList) {
        this.portataList = portataList;
    }

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }

}
