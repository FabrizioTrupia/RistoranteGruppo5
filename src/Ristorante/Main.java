package Ristorante;

import Ristorante.consumatore.Cliente;
import Ristorante.consumatore.Prenotazione;
import Ristorante.foodAndDrink.*;

import Ristorante.foodAndDrink.dishEntities.Antipasti;
import Ristorante.foodAndDrink.dishEntities.Dessert;
import Ristorante.foodAndDrink.dishEntities.PrimiPiatti;
import Ristorante.foodAndDrink.dishEntities.SecondiPiatti;

import java.util.ArrayList;
import java.util.List;

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

        Menu menuClassico = new Menu(new ArrayList<>(), MenuTypeEnum.CLASSICO.CLASSICO);
        Menu menuVegano = new Menu(new ArrayList<>(), MenuTypeEnum.VEGANO);
        Menu menuVegetariano = new Menu(new ArrayList<>(), MenuTypeEnum.VEGETARIANO);

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

        menuClassico.aggiungerePiattoClassico(antipasto1);
        menuClassico.aggiungerePiattoClassico(antipasto2);
        menuClassico.aggiungerePiattoClassico(antipasto3);
        menuClassico.aggiungerePiattoClassico(antipasto4);
        menuClassico.aggiungerePiattoClassico(antipasto5);
        menuClassico.aggiungerePiattoClassico(antipasto6);
        menuClassico.aggiungerePiattoClassico(antipasto7);
        menuClassico.aggiungereListaALMenu(menuClassico.getPortateMenuClassico());

        menuVegano.aggiungerePiattoVegano(antipasto4);
        menuVegano.aggiungerePiattoVegano(antipasto5);
        menuVegano.aggiungereListaALMenu(menuVegano.getPortateMenuVegano());

        menuVegetariano.aggiungerePiattoVegetariano(antipasto6);
        menuVegetariano.aggiungerePiattoVegetariano(antipasto7);
        menuVegetariano.aggiungereListaALMenu(menuVegetariano.getPortateMenuVegetariano());


        /**
         * PRIMI PIATTI
         */
        Portata primoPiatto1 = new PrimiPiatti("Primo piatto", "Spaghetti alla carbonara", 11,true, MenuTypeEnum.CLASSICO);
        Portata primoPiatto2 = new PrimiPiatti("Primo piatto", "Rigatoni alla bolognese", 9,false, MenuTypeEnum.CLASSICO);
        Portata primoPiatto3 = new PrimiPiatti("Primo piatto", "Tortiglioni salsiccia e cipolla", 8,false, MenuTypeEnum.CLASSICO);
        Portata primoPiatto4 = new PrimiPiatti("Primo piatto", "Linguine pompelmo e pistacchio", 12,false, MenuTypeEnum.VEGANO);
        Portata primoPiatto5 = new PrimiPiatti("Primo piatto", "Parmigiana vegana", 8,true, MenuTypeEnum.VEGANO);
        Portata primoPiatto6 = new PrimiPiatti("Primo piatto", "Lasagna zucchine, speck e besciamella", 10,false, MenuTypeEnum.VEGETARIANO);
        Portata primoPiatto7 = new PrimiPiatti("Primo piatto", "Orecchiette con broccoli", 7,true, MenuTypeEnum.VEGETARIANO);

        menuClassico.aggiungerePiattoClassico(primoPiatto1);
        menuClassico.aggiungerePiattoClassico(primoPiatto2);
        menuClassico.aggiungerePiattoClassico(primoPiatto3);
        menuClassico.aggiungerePiattoClassico(primoPiatto4);
        menuClassico.aggiungerePiattoClassico(primoPiatto5);
        menuClassico.aggiungerePiattoClassico(primoPiatto6);
        menuClassico.aggiungerePiattoClassico(primoPiatto7);
        menuClassico.aggiungereListaALMenu(menuClassico.getPortateMenuClassico());

        menuVegano.aggiungerePiattoVegano(primoPiatto4);
        menuVegano.aggiungerePiattoVegano(primoPiatto5);
        menuVegano.aggiungereListaALMenu(menuVegano.getPortateMenuVegano());

        menuVegetariano.aggiungerePiattoVegetariano(primoPiatto6);
        menuVegetariano.aggiungerePiattoVegetariano(primoPiatto7);
        menuVegetariano.aggiungereListaALMenu(menuVegetariano.getPortateMenuVegetariano());



        Portata secondoPiatto1 = new SecondiPiatti("Secondo piatto" , "Fiorentina" , 15,false, MenuTypeEnum.CLASSICO);
        Portata secondoPiatto2 = new SecondiPiatti("Secondo piatto" , "Involtini di carne" , 8,false, MenuTypeEnum.CLASSICO);
        Portata secondoPiatto3 = new SecondiPiatti("Secondo piatto" , "Cotoletta di pollo" , 7,true, MenuTypeEnum.CLASSICO);
        Portata secondoPiatto4 = new SecondiPiatti("Secondo piatto" , "Frittata di fagiolini" , 7,true, MenuTypeEnum.VEGANO);
        Portata secondoPiatto5 = new SecondiPiatti("Secondo piatto" , "Cotoletta di ceci" , 7,false, MenuTypeEnum.VEGANO);
        Portata secondoPiatto6 = new SecondiPiatti("Secondo piatto" , "Uova al tegamini con pomodoro" , 7,true, MenuTypeEnum.VEGETARIANO);
        Portata secondoPiatto7 = new SecondiPiatti("Secondo piatto" , "Zuppa di ceci e cavolo nero" , 7,false, MenuTypeEnum.VEGETARIANO);

        menuClassico.aggiungerePiattoClassico(secondoPiatto1);
        menuClassico.aggiungerePiattoClassico(secondoPiatto2);
        menuClassico.aggiungerePiattoClassico(secondoPiatto3);
        menuClassico.aggiungerePiattoClassico(secondoPiatto4);
        menuClassico.aggiungerePiattoClassico(secondoPiatto5);
        menuClassico.aggiungerePiattoClassico(secondoPiatto6);
        menuClassico.aggiungerePiattoClassico(secondoPiatto7);
        menuClassico.aggiungereListaALMenu(menuClassico.getPortateMenuClassico());

        menuVegano.aggiungerePiattoVegano(secondoPiatto4);
        menuVegano.aggiungerePiattoVegano(secondoPiatto5);
        menuVegano.aggiungereListaALMenu(menuVegano.getPortateMenuVegano());

        menuVegetariano.aggiungerePiattoVegetariano(secondoPiatto6);
        menuVegetariano.aggiungerePiattoVegetariano(secondoPiatto7);
        menuVegetariano.aggiungereListaALMenu(menuVegetariano.getPortateMenuVegetariano());




        Portata dessert1 = new Dessert("Dessert", "tortini ripieni", 3,false, MenuTypeEnum.CLASSICO);
        Portata dessert2 = new Dessert("Dessert", "torta di ciliege", 9,true, MenuTypeEnum.CLASSICO);
        Portata dessert3 = new Dessert("Dessert", "crostata di mele", 6,false, MenuTypeEnum.CLASSICO);

        Portata dessert4 = new Dessert("Dessert", "Plumcake marmorizzato vegan al cioccolato e vaniglia", 4, true, MenuTypeEnum.VEGANO);
        Portata dessert5 = new Dessert("Dessert", "Torta di mele vegan", 5, false, MenuTypeEnum.VEGANO);

        Portata dessert6 = new Dessert("Dessert", "Plumcake fragole e mascarpone", 4, false, MenuTypeEnum.VEGETARIANO);
        Portata dessert7 = new Dessert("Dessert", "Muffin al cioccolato", 3, true, MenuTypeEnum.VEGETARIANO);

        menuClassico.aggiungerePiattoClassico(dessert1);
        menuClassico.aggiungerePiattoClassico(dessert2);
        menuClassico.aggiungerePiattoClassico(dessert3);
        menuClassico.aggiungerePiattoClassico(dessert4);
        menuClassico.aggiungerePiattoClassico(dessert5);
        menuClassico.aggiungerePiattoClassico(dessert6);
        menuClassico.aggiungerePiattoClassico(dessert7);
        menuClassico.aggiungereListaALMenu(menuClassico.getPortateMenuClassico());

        menuVegano.aggiungerePiattoVegano(dessert4);
        menuVegano.aggiungerePiattoVegano(dessert5);
        menuVegano.aggiungereListaALMenu(menuVegano.getPortateMenuVegano());

        menuVegetariano.aggiungerePiattoVegetariano(dessert6);
        menuVegetariano.aggiungerePiattoVegetariano(dessert7);
        menuVegetariano.aggiungereListaALMenu(menuVegetariano.getPortateMenuVegetariano());

        Drink drink = new Drink("Bevanda", "Coca-cola", 2, false);
        Drink drink1 = new Drink("Bevanda", "Aranciata", 2, true);
        Drink drink2 = new Drink("Bevanda", "The alla pesca o limone", 2, false);
        Drink drink3 = new Drink("Bevanda", "Acqua liscia o gassata", 1, false);
        Drink drink4 = new Drink("Bevanda", "Vino rosso", 7, true);
        Drink drink5 = new Drink("Bevanda", "Vino bianco", 7, false);

        menuClassico.aggiungiBibita(drink);
        menuClassico.aggiungiBibita(drink1);
        menuClassico.aggiungiBibita(drink2);
        menuClassico.aggiungiBibita(drink3);
        menuClassico.aggiungiBibita(drink4);
        menuClassico.aggiungiBibita(drink5);










        System.out.println("============================================================================================================================");
        menuClassico.stampaMenuClassico();
        System.out.println("============================================================================================================================");
        menuVegano.stampaMenuVegano();
        System.out.println("============================================================================================================================");
        menuVegetariano.stampaMenuVegetariano();
        System.out.println("============================================================================================================================");
        menuClassico.stampaBibite();
        System.out.println("============================================================================================================================");
        menuClassico.stampaPiattoDelGiorno();
        System.out.println("============================================================================================================================");
        menuVegano.stampaPiattoDelGiornoVegano();
        System.out.println("============================================================================================================================");
        menuVegetariano.stampaPiattoDelGiornoVegetariano();
        System.out.println("============================================================================================================================");
        menuClassico.stampaBevandaDelGiorno();
        System.out.println("============================================================================================================================");

        System.out.println("============SEZIONE CLIENTE============");
        Cliente cliente = new Cliente("Rossi",  MenuTypeEnum.CLASSICO,"25 Dicembre 20:00");
        Cliente cliente1 = new Cliente("De paolo", MenuTypeEnum.VEGANO,"25 Dicembre 21:00");
        Cliente cliente2 = new Cliente("De luca", MenuTypeEnum.VEGETARIANO,"25 Dicembre 22:00");


        cliente.infoCliente();
        cliente1.infoCliente();
        cliente2.infoCliente();

        System.out.println("============================================================================================================================");

        menuClassico.stampaPiattoInBaseAlCliente(cliente);

        System.out.println("============================================================================================================================");


        menuClassico.stampaPiattoInBaseAlCliente(cliente1);

        System.out.println("============================================================================================================================");


        menuClassico.stampaPiattoInBaseAlCliente(cliente2);

        System.out.println("============================================================================================================================");

        Prenotazione prenotazione = new Prenotazione(new ArrayList<>());

        List<Cliente> clienteList = new ArrayList<>();

        clienteList.add(cliente);
        clienteList.add(cliente1);
        clienteList.add(cliente2);
        prenotazione.aggiungerePrenotazioni(clienteList);

        prenotazione.stampaPrenotazioni();












    }
}
