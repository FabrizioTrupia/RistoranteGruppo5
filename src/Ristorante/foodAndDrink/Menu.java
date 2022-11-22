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


    /**
     * Lista delle bevande
     */
    private List<Drink> drinkList = new ArrayList<>();

    private List<Portata> portata;

    /**
     *
     * @param list
     */
    public Menu(List<Portata> list) {
        this.portata = list;
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






    public void aggiungereListaALMenu(List<Portata> list){
        this.portata.addAll(list);
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
     * Un metodo per stampare il menu
     */
    public void stampaMenu() {
        portata.forEach(System.out::println);
        drinkList.forEach(System.out::println);
    }




    /**
     * un metodo per stampare il piatto del giorno e le relative informazioni del piatto
     */
    public void stampaPiattoDelGiorno() {
        for (Portata piattoDelGiorno : portata) {
            if (piattoDelGiorno.isPiattoDelGiorno()) {
                System.out.println("Piatto del giorno raccomandato: " + piattoDelGiorno.getType() + " = " + piattoDelGiorno.getName() + " - " + piattoDelGiorno.getPrice() + " euro " + "Tipo: " + piattoDelGiorno.getTipoPortata());
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
    public void stampaPiattoInBaseAlCliente(Cliente cliente){
        System.out.println("============================Gentile " + cliente.getCognome() + " in base alle tue preferenze abbiamo il seguente menu per te============================");
        for(Portata portata : portata){
            if (cliente.getGusti() == portata.getTipoPortata()){
                System.out.println(portata);
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
        return portata;
    }

    public void setPortataList(List<Portata> portataList) {
        this.portata = portataList;
    }

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }

}
