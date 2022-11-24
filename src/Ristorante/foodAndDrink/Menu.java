package Ristorante.foodAndDrink;

import Ristorante.consumatore.Cliente;

import javax.sound.sampled.Port;
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
   // private List<Drink> drinkList = new ArrayList<>();

    private List<Portata> portata;

    List<Portata> portateMenuClassico = new ArrayList<>();
    List<Portata> portateMenuVegano = new ArrayList<>();
    List<Portata> portateMenuVegetariano = new ArrayList<>();

    private MenuTypeEnum menuTypeEnum;

    /**
     *
     * @param list
     */
    public Menu(List<Portata> list, MenuTypeEnum menuTypeEnum) {
        this.portata = list;
        this.menuTypeEnum=menuTypeEnum;

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
    /*public void addDrink(Drink drink) {
        drinkList.add(drink);
    }*/



    /**
     * Un metodo per stampare il menu classico
     */
    public void stampaMenuClassico() {
        System.out.println("===============MENU CLASSICO===============");
        portateMenuClassico.forEach(System.out::println);
        //drinkList.forEach(System.out::println);
    }

    /**
     * Un metodo per stampare il menu vegano
     */
    public void stampaMenuVegano(){
        System.out.println("===============MENU VEGANO===============");
        for (Portata portateVeganeA : portateMenuVegano){
            System.out.println(portateVeganeA);
        }
    }

    /**
     * un metodo per stampare il menu vegetariano
     */
    public void stampaMenuVegetariano(){
        System.out.println("===============MENU VEGETARIANO===============");
        for (Portata portateVegetarianeA : portateMenuVegetariano) {
            System.out.println(portateVegetarianeA);
        }
    }

    /**
     * un metodo per aggiungere la portata alla lista Menu classico
     * @param portata
     */
    public void aggiungerePiattoClassico(Portata portata){
        portateMenuClassico.add(portata);
    }

    public void rimuoverePiattoClassico(Portata portata){
        portateMenuClassico.remove(portata);
    }

    /**
     * un metodo per aggiungere la portata alla lista Menu vegano
     * @param portata
     */
    public void aggiungerePiattoVegano(Portata portata){
        portateMenuVegano.add(portata);
    }

    public void rimuoverePiattoVegano(Portata portata){
        portateMenuVegano.remove(portata);
    }

    /**
     * un metodo per aggiungere la portata alla lista Menu vegetariano
     * @param portata
     */
    public void aggiungerePiattoVegetariano(Portata portata){
        portateMenuVegetariano.add(portata);

    }

    public void rimuoverePiattoVegetariano(Portata portata){
        portateMenuVegetariano.remove(portata);
    }




    /**
     * un metodo per stampare il piatto del giorno e le relative informazioni del piatto
     */
    public void stampaPiattoDelGiorno() {
        System.out.println("============PIATTO DEL GIORNO PER IL MENU CLASSICO============");
        for (Portata piattoDelGiorno : portateMenuClassico) {
            if (piattoDelGiorno.isPiattoDelGiorno()) {
                System.out.println("Piatto del giorno raccomandato: " + piattoDelGiorno.getType() + " = " + piattoDelGiorno.getName() + " - " + piattoDelGiorno.getPrice() + " euro " + "Tipo: " + piattoDelGiorno.getTipoPortata());
            }
        }
    }

    public void stampaPiattoDelGiornoVegano(){
        System.out.println("============PIATTO DEL GIORNO PER IL MENU VEGANO============");
        for (Portata piattoDelGiornoVegano:portateMenuVegano) {
            if (piattoDelGiornoVegano.isPiattoDelGiorno()){
                System.out.println("Piatto del giorno raccomandato: " + piattoDelGiornoVegano.getType() + " = " + piattoDelGiornoVegano.getName() + " - " + piattoDelGiornoVegano.getPrice() + " euro " + "Tipo: " + piattoDelGiornoVegano.getTipoPortata());
            }
        }
    }

    public void stampaPiattoDelGiornoVegetariano(){
        System.out.println("============PIATTO DEL GIORNO PER IL MENU VEGETARIANO============");
        for (Portata piattoDelGiornoVegetariano : portateMenuVegetariano) {
            if (piattoDelGiornoVegetariano.isPiattoDelGiorno()){
                System.out.println("Piatto del giorno raccomandato: " + piattoDelGiornoVegetariano.getType() + " = " + piattoDelGiornoVegetariano.getName() + " - " + piattoDelGiornoVegetariano.getPrice() + " euro " + "Tipo: " + piattoDelGiornoVegetariano.getTipoPortata());
            }
        }
    }

    /**
     * un metodo per stampare la bevanda del giorno e le relative informazioni sulla bevanda
     */

   /* public void stampaBevandaDelGiorno(){
        for (Drink drinkDelGiorno:drinkList) {
            if (drinkDelGiorno.isDrinkDelGiorno()) {
                System.out.println("Bevanda del giorno raccomandata: " + drinkDelGiorno.getType() + " = " + drinkDelGiorno.getName() + " - " + drinkDelGiorno.getPrice() + " euro ");
            }
        }
    }*/

    /**
     * metodo che consiglia un piatto al cliente in base alle sue preferenze
     * @param cliente
     */
    public void stampaPiattoInBaseAlCliente(Cliente cliente){
        System.out.println("============================Gentile " + cliente.getCognome() + " in base alle tue preferenze abbiamo il seguente menu per te============================");
        for(Portata portata : portateMenuClassico){
            if (cliente.getGusti() == portata.getTipoPortata()){
                System.out.println(portata);
            }
        }


    }

    public List<Portata> getPortateMenuClassico() {
        return portateMenuClassico;
    }

    public void setPortateMenuClassico(List<Portata> portateMenuClassico) {
        this.portateMenuClassico = portateMenuClassico;
    }

    public List<Portata> getPortateMenuVegano() {
        return portateMenuVegano;
    }

    public void setPortateMenuVegano(List<Portata> portateMenuVegano) {
        this.portateMenuVegano = portateMenuVegano;
    }

    public List<Portata> getPortateMenuVegetariano() {
        return portateMenuVegetariano;
    }

    public void setPortateMenuVegetariano(List<Portata> portateMenuVegetariano) {
        this.portateMenuVegetariano = portateMenuVegetariano;
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

    /*public List<Drink> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }*/

}