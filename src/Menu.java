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
    public String type;

    /**
     * Il nome del ristorante
     */
    public String name;

    /**
     * costo del coperto
     */
    public Integer coperto;

    /**
     * Lista delle portate
     */
    public List<Portata> portataList = new ArrayList<>();

    /**
     * Lista delle bevande
     */
    public List<Drink> drinkList = new ArrayList<>();

    /**
     * Il costruttore del menu
     * @param type --> menu
     * @param name --> nome del ristorante
     * @param coperto --> prezzo del coperto
     */
    public Menu(String type, String name , Integer coperto){
        this.type = type;
        this.name = name;
        this.coperto = coperto;
    }

    /**
     * Metodo to string della classe menu
     * @return i parametri: type , name, coperto della classe menu
     */

    @Override
    public String toString() {
        return "Tipo di menu: " + type + " Nome del ristorante: " + name + " Coperto: " + coperto + " euro";
    }

    /**
     * Un metodo che aggiunge le portate all lista "portataList"
     * @param portata --> parametro che richiama la classe Portata
     */
    public void addPortata(Portata portata){
        portataList.add(portata);
    }

    /**
     * Un metodo che aggiunge i drink all lista "drinkList"
     * @param drink --> parametro che richiama la classe Drink
     */
    public void addDrink(Drink drink){
        drinkList.add(drink);
    }

    /**
     * Metodo che rimuove una portata dalla lista "portataList"
     * @param portata --> parametro che richiama la classe Portata
     */
    public void removePortata(Portata portata){

        portataList.remove(portata);
    }

    /**
     * Un metodo per stampare il menu
     */
    public void stampaMenu() {
        portataList.forEach(System.out::println);
        drinkList.forEach(System.out::println);
    }

    /**
     * Un metodo che suggerisce un piatto del giorno casuale
     */
    public void piattoDelGiorno() {
        Random random = new Random();
        System.out.println("piatto del giorno: " +
                portataList.get( random.nextInt(portataList.size())));
    }



}
