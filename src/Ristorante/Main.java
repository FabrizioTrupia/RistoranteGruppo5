package Ristorante;

import Ristorante.consumatore.Cliente;
import Ristorante.consumatore.Prenotazione;
import Ristorante.consumatore.Tavolo;
import Ristorante.foodAndDrink.*;
import Ristorante.foodAndDrink.dishEntities.Antipasti;
import Ristorante.foodAndDrink.dishEntities.Dessert;
import Ristorante.foodAndDrink.dishEntities.PrimiPiatti;
import Ristorante.foodAndDrink.dishEntities.SecondiPiatti;

import java.util.*;

/**
 * In questa classe sono stati creati delle istanze di oggetti nelle varie classi e aggiunti alla lista
 *  con il metodo stampaMenu viene stampato il menu
 *  con il metodo piatto del giorno viene stampato un piatto randomico
 *  con il metodo piattoConsigliato vengono stampate le portate riguardante i gusti del cliente
 * La classe che fa riferimento al main
 * @author Fabrizio Trupia , Alessandro Trupia , Nicola Boniello , Andrea Sciscioli
 * @version 1
 */

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu(new ArrayList<>());


        /**
         * ANTIPASTI
         */
        Portata antipasto1 = new Antipasti("Antipasto", "Tagliere di salumi" , 8,false, MenuTypeEnum.CLASSICO);
        Portata antipasto2 = new Antipasti("Antipasto", "Rustici di carne" , 6,true, MenuTypeEnum.CLASSICO);
        Portata antipasto3 = new Antipasti("Antipasto", "Tartare di manzo", 8,false, MenuTypeEnum.CLASSICO);
        Portata antipasto4 = new Antipasti("Antipasto", "Tartare di zucchine e tartufo", 8,true, MenuTypeEnum.VEGANO);
        Portata antipasto5 = new Antipasti("Antipasto", "Toast con Avocado e melanzane", 8,false, MenuTypeEnum.VEGANO);
        Portata antipasto6 = new Antipasti("Antipasto", "Bruschette con pomodoro", 8,false, MenuTypeEnum.VEGETARIANO);
        Portata antipasto7 = new Antipasti("Antipasto", "Grigliata di verdura mista", 8,true, MenuTypeEnum.VEGETARIANO);

        menu.addPortata(antipasto1);
        menu.addPortata(antipasto2);
        menu.addPortata(antipasto3);
        menu.addPortata(antipasto4);
        menu.addPortata(antipasto5);
        menu.addPortata(antipasto6);
        menu.addPortata(antipasto7);

        /**
         * Primi piatti
         */
        Portata primoPiatto1 = new PrimiPiatti("Primo piatto", "Spaghetti alla carbonara", 11,true, MenuTypeEnum.CLASSICO);
        Portata primoPiatto2 = new PrimiPiatti("Primo piatto", "Rigatoni alla bolognese", 9,false, MenuTypeEnum.CLASSICO);
        Portata primoPiatto3 = new PrimiPiatti("Primo piatto", "Tortiglioni salsiccia e cipolla", 8,false, MenuTypeEnum.CLASSICO);
        Portata primoPiatto4 = new PrimiPiatti("Primo piatto", "Linguine pompelmo e pistacchio", 12,false, MenuTypeEnum.VEGANO);
        Portata primoPiatto5 = new PrimiPiatti("Primo piatto", "Parmigiana vegana", 8,true, MenuTypeEnum.VEGANO);
        Portata primoPiatto6 = new PrimiPiatti("Primo piatto", "Lasagna zucchine, speck e besciamella", 10,false, MenuTypeEnum.VEGETARIANO);
        Portata primoPiatto7 = new PrimiPiatti("Primo piatto", "Orecchiette con broccoli", 7,true, MenuTypeEnum.VEGETARIANO);

        menu.addPortata(primoPiatto1);
        menu.addPortata(primoPiatto2);
        menu.addPortata(primoPiatto3);
        menu.addPortata(primoPiatto4);
        menu.addPortata(primoPiatto5);
        menu.addPortata(primoPiatto6);
        menu.addPortata(primoPiatto7);

        /**
         * Secondi Piatti
         */
        Portata secondoPiatto1 = new SecondiPiatti("Secondo piatto" , "Fiorentina" , 15,false, MenuTypeEnum.CLASSICO);
        Portata secondoPiatto2 = new SecondiPiatti("Secondo piatto" , "Involtini di carne" , 8,false, MenuTypeEnum.CLASSICO);
        Portata secondoPiatto3 = new SecondiPiatti("Secondo piatto" , "Cotoletta di pollo" , 7,true, MenuTypeEnum.CLASSICO);
        Portata secondoPiatto4 = new SecondiPiatti("Secondo piatto" , "Frittata di fagiolini" , 7,true, MenuTypeEnum.VEGANO);
        Portata secondoPiatto5 = new SecondiPiatti("Secondo piatto" , "Cotoletta di ceci" , 7,false, MenuTypeEnum.VEGANO);
        Portata secondoPiatto6 = new SecondiPiatti("Secondo piatto" , "Uova al tegamini con pomodoro" , 7,true, MenuTypeEnum.VEGETARIANO);
        Portata secondoPiatto7 = new SecondiPiatti("Secondo piatto" , "Zuppa di ceci e cavolo nero" , 7,false, MenuTypeEnum.VEGETARIANO);

        menu.addPortata(secondoPiatto1);
        menu.addPortata(secondoPiatto2);
        menu.addPortata(secondoPiatto3);
        menu.addPortata(secondoPiatto4);
        menu.addPortata(secondoPiatto5);
        menu.addPortata(secondoPiatto6);
        menu.addPortata(secondoPiatto7);

        /**
         * Dessert
         */
        Portata dessert1 = new Dessert("Dessert", "tortini ripieni", 3,false, MenuTypeEnum.CLASSICO);
        Portata dessert2 = new Dessert("Dessert", "torta di ciliege", 9,true, MenuTypeEnum.CLASSICO);
        Portata dessert3 = new Dessert("Dessert", "crostata di mele", 6,false, MenuTypeEnum.CLASSICO);
        Portata dessert4 = new Dessert("Dessert", "Plumcake marmorizzato vegan al cioccolato e vaniglia", 4, true, MenuTypeEnum.VEGANO);
        Portata dessert5 = new Dessert("Dessert", "Torta di mele vegan", 5, false, MenuTypeEnum.VEGANO);
        Portata dessert6 = new Dessert("Dessert", "Plumcake fragole e mascarpone", 4, false, MenuTypeEnum.VEGETARIANO);
        Portata dessert7 = new Dessert("Dessert", "Muffin al cioccolato", 3, true, MenuTypeEnum.VEGETARIANO);

        menu.addPortata(dessert1);
        menu.addPortata(dessert2);
        menu.addPortata(dessert3);
        menu.addPortata(dessert4);
        menu.addPortata(dessert5);
        menu.addPortata(dessert6);
        menu.addPortata(dessert7);

        /**
         * Drink
         */
        Drink drink = new Drink("Bevanda", "Acqua liscia o gassata", 1,false);
        Drink drink1 = new Drink("Bevanda", "Coca-cola", 2, false);
        Drink drink2 = new Drink("Bevanda", "Aranciata", 2, false);
        Drink drink3 = new Drink("Bevanda", "The alla pesca o al limone", 2,false);
        Drink drink4 = new Drink("Bevanda_Vegana", "Bergamotto bio", 3, false);
        Drink drink5 = new Drink("Bevanda_Vegana", "Ginger_Bio", 3, false);
        Drink drink6 = new Drink("Bevanda_Vegetariana", "Mix di frutta esotica", 5, false);
        Drink drink7 = new Drink("Bevanda_Vegetariana", "Latte di cocco e mandorla", 7, false);

        menu.addPortata(drink);
        menu.addPortata(drink1);
        menu.addPortata(drink2);
        menu.addPortata(drink3);
        menu.addPortata(drink4);
        menu.addPortata(drink5);
        menu.addPortata(drink6);
        menu.addPortata(drink7);



        System.out.println("============================================================================================================================");
        menu.stampaMenu();
        System.out.println("============================================================================================================================");
        menu.stampaPiattoDelGiorno();
        System.out.println("============================================================================================================================");


        System.out.println("============SEZIONE CLIENTE============");
        Cliente cliente = new Cliente("Rossi",  MenuTypeEnum.CLASSICO,"25 Dicembre 20:00");
        Cliente cliente1 = new Cliente("De paolo", MenuTypeEnum.VEGANO,"25 Dicembre 21:00");
        Cliente cliente2 = new Cliente("De luca", MenuTypeEnum.VEGETARIANO,"25 Dicembre 22:00");

        cliente.infoCliente();
        cliente1.infoCliente();
        cliente2.infoCliente();

        System.out.println("============================================================================================================================");

        menu.stampaPiattoInBaseAlCliente(cliente);
        System.out.println("============================================================================================================================");
        menu.stampaPiattoInBaseAlCliente(cliente1);
        System.out.println("============================================================================================================================");
        menu.stampaPiattoInBaseAlCliente(cliente2);
        System.out.println("============================================================================================================================");


        List<Cliente> clienteList = new ArrayList<>();

        clienteList.add(cliente);
        clienteList.add(cliente1);
        clienteList.add(cliente2);

        Prenotazione prenotazione = new Prenotazione(clienteList);
        prenotazione.aggiungerePrenotazioni(clienteList);

        prenotazione.stampaPrenotazioni();

        Tavolo tavolo1 = new Tavolo(4);
        Tavolo tavolo2 = new Tavolo(4);
        Tavolo tavolo3 = new Tavolo(4);
        Tavolo tavolo4 = new Tavolo(4);
        Tavolo tavolo5 = new Tavolo(4);

        List<Tavolo> listaTavoli= new ArrayList<>();
        listaTavoli.add(tavolo1);
        listaTavoli.add(tavolo2);
        listaTavoli.add(tavolo3);
        listaTavoli.add(tavolo4);
        listaTavoli.add(tavolo5);

        tavolo1.assegnaPosti(prenotazione);
        System.out.println(tavolo1.getClientiOccupanti().toString());

    }
}
