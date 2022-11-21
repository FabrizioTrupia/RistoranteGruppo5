package Ristorante.foodAndDrink;

import Ristorante.consumatore.Cliente;

import java.util.ArrayList;
import java.util.List;

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
     * @param portata --> parametro che richiama la classe Ristorante.FoodAndDrink.Portata
     */
    public void addPortata(Portata portata) {
        portataList.add(portata);
    }

    /**
     * Un metodo che aggiunge i drink all lista "drinkList"
     *
     * @param drink --> parametro che richiama la classe Ristorante.FoodAndDrink.Drink
     */
    public void addDrink(Drink drink) {
        drinkList.add(drink);
    }

    /**
     * Metodo che rimuove una portata dalla lista "portataList"
     *
     * @param portata --> parametro che richiama la classe Ristorante.FoodAndDrink.Portata
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

    /**
     * un metodo per stampare il piatto del giorno e le relative informazioni del piatto
     */
    public void stampaPiattoDelGiorno() {
        for (Portata piattoDelGiorno : portataList) {
            if (piattoDelGiorno.isPiattoDelGiorno()) {
                System.out.println("Piatto del giorno raccomandato: " + piattoDelGiorno.getType() + " = " + piattoDelGiorno.getName() + " - " + piattoDelGiorno.getPrice() + " euro " + "Tipo: " + piattoDelGiorno.getTypeMenuEnum());
            }
        }
    }

    /**
     * un metodo per stampare la bevanda del giorno e le relative informazioni sulla bevanda
     */

    public void stampaBevandaDelGiorno(){
        for (Drink drinkDelGiorno:drinkList) {
            if (drinkDelGiorno.isDrinkDelGiorno()) {
                System.out.println("Bevanda del giorno raccomandata: " + drinkDelGiorno.getType() + " = " + drinkDelGiorno.getName() + " - " + drinkDelGiorno.getPrice() + " euro ");
            }
        }
    }

    /**
     * metodo che consiglia un piatto al cliente in base alle sue preferenze
     * @param cliente
     */
    public void piattoConsigliato(Cliente cliente){
        System.out.println("============================Gentile " + cliente.getCognome() + " in base alle tue preferenze abbiamo il seguente menu per te============================");
        for(Portata portata : portataList){
            switch (cliente.getGusti()){
                case VEGANO -> {
                    if (portata.getTypeMenuEnum() == TypeMenuEnum.MENU_VEGAN) {
                        System.out.println(portata);
                    }
                }
                case VEGETARIANO ->  {
                    if (portata.getTypeMenuEnum() == TypeMenuEnum.MENU_VEGETARIAN) {
                        System.out.println(portata);
                    }
                }
                case CLASSICO -> {
                    if (portata.getTypeMenuEnum() == TypeMenuEnum.MENU_CLASSIC) {
                        System.out.println(portata);
                    }
                }
                default -> System.out.println("Mi dica che genere di piatti desidera");
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
