package Ristorante;

import Ristorante.consumatore.Cliente;
import Ristorante.consumatore.Prenotazione;
import Ristorante.foodAndDrink.*;
import Ristorante.foodAndDrink.drinkEntities.BevandaAlcolica;
import Ristorante.foodAndDrink.drinkEntities.BevandaAnalcolica;
import Ristorante.foodAndDrink.dishEntities.Antipasti;
import Ristorante.foodAndDrink.dishEntities.Dessert;
import Ristorante.foodAndDrink.dishEntities.PrimiPiatti;
import Ristorante.foodAndDrink.dishEntities.SecondiPiatti;

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

        Menu menu = new Menu("Ristorante a base di carne", "Team 5" , 2);

        /**
         *Antipasti classici
         */

        Portata antipasto1 = new Antipasti("Antipasto", "Tagliere di salumi" , 8,false, TipoPortate.CLASSICO);
        Portata antipasto2 = new Antipasti("Antipasto", "Rustici di carne" , 6,true, TipoPortate.CLASSICO);
        Portata antipasto3 = new Antipasti("Antipasto", "Tartare di manzo", 8,false, TipoPortate.CLASSICO);

        /**
         *Antipasti vegani
         */
        Portata antipasto4 = new Antipasti("Antipasto", "Tartare di zucchine e tartufo", 8,true, TipoPortate.VEGANO);
        Portata antipasto5 = new Antipasti("Antipasto", "Toast con Avocado e melanzane", 8,false, TipoPortate.VEGANO);

        /**
         *Antipasti vegetariani
         */
        Portata antipasto6 = new Antipasti("Antipasto", "Bruschette con pomodoro", 8,false, TipoPortate.VEGETARIANO);
        Portata antipasto7 = new Antipasti("Antipasto", "Grigliata di verdura mista", 8,true, TipoPortate.VEGETARIANO);

        menu.addPortata(antipasto1);
        menu.addPortata(antipasto2);
        menu.addPortata(antipasto3);
        menu.addPortata(antipasto4);
        menu.addPortata(antipasto5);
        menu.addPortata(antipasto6);
        menu.addPortata(antipasto7);

        /**
         *Primi piatti classici
         */
        Portata primoPiatto1 = new PrimiPiatti("Primo piatto", "Spaghetti alla carbonara", 11,true, TipoPortate.CLASSICO);
        Portata primoPiatto2 = new PrimiPiatti("Primo piatto", "Rigatoni alla bolognese", 9,false, TipoPortate.CLASSICO);
        Portata primoPiatto3 = new PrimiPiatti("Primo piatto", "Tortiglioni salsiccia e cipolla", 8,false, TipoPortate.CLASSICO);

        /**
         *Primi piatti vegani
         */
        Portata primoPiatto4 = new PrimiPiatti("Primo piatto", "Linguine pompelmo e pistacchio", 12,false, TipoPortate.VEGANO);
        Portata primoPiatto5 = new PrimiPiatti("Primo piatto", "Parmigiana vegana", 8,true, TipoPortate.VEGANO);

        /**
         * Primi piatti vegetariani
         */
        Portata primoPiatto6 = new PrimiPiatti("Primo piatto", "Lasagna zucchine, speck e besciamella", 10,false, TipoPortate.VEGETARIANO);
        Portata primoPiatto7 = new PrimiPiatti("Primo piatto", "Orecchiette con broccoli", 7,true, TipoPortate.VEGETARIANO);

        menu.addPortata(primoPiatto1);
        menu.addPortata(primoPiatto2);
        menu.addPortata(primoPiatto3);
        menu.addPortata(primoPiatto4);
        menu.addPortata(primoPiatto5);
        menu.addPortata(primoPiatto6);
        menu.addPortata(primoPiatto7);

        /**
         *Secondi piatti classici
         */
        Portata secondoPiatto1 = new SecondiPiatti("Secondo piatto" , "Fiorentina" , 15,false, TipoPortate.CLASSICO);
        Portata secondoPiatto2 = new SecondiPiatti("Secondo piatto" , "Involtini di carne" , 8,false, TipoPortate.CLASSICO);
        Portata secondoPiatto3 = new SecondiPiatti("Secondo piatto" , "Cotoletta di pollo" , 7,true, TipoPortate.CLASSICO);

        /**
         *Secondi piatti vegani
         */
        Portata secondoPiatto4 = new SecondiPiatti("Secondo piatto" , "Frittata di fagiolini" , 7,true, TipoPortate.VEGANO);
        Portata secondoPiatto5 = new SecondiPiatti("Secondo piatto" , "Cotoletta di ceci" , 7,false, TipoPortate.VEGANO);

        /**
         *Secondi piatti vegetariani
         */
        Portata secondoPiatto6 = new SecondiPiatti("Secondo piatto" , "Uova al tegamini con pomodoro" , 7,true, TipoPortate.VEGETARIANO);
        Portata secondoPiatto7 = new SecondiPiatti("Secondo piatto" , "Zuppa di ceci e cavolo nero" , 7,false, TipoPortate.VEGETARIANO);

        menu.addPortata(secondoPiatto1);
        menu.addPortata(secondoPiatto2);
        menu.addPortata(secondoPiatto3);
        menu.addPortata(secondoPiatto4);
        menu.addPortata(secondoPiatto5);
        menu.addPortata(secondoPiatto6);
        menu.addPortata(secondoPiatto7);

        Portata dessert1 = new Dessert("Dessert", "tortini ripieni", 3,false, TipoPortate.CLASSICO);
        Portata dessert2 = new Dessert("Dessert", "torta di ciliege", 9,true, TipoPortate.CLASSICO);
        Portata dessert3 = new Dessert("Dessert", "crostata di mele", 6,false, TipoPortate.CLASSICO);

        menu.addPortata(dessert1);
        menu.addPortata(dessert2);
        menu.addPortata(dessert3);

        Drink drink1 = new BevandaAnalcolica("Bevanda analcolica" , "Acqua" , 1, false);
        Drink drink2 = new BevandaAnalcolica("Bevanda analcolica" , "Coca-Cola" , 3, true);
        Drink drink3 = new BevandaAnalcolica("Bevanda analcolica" , "The pesca/limone" , 3, false);

        Drink drink4 = new BevandaAlcolica("Bevanda alcolica", "Vino rosso", 10, false);
        Drink drink5 = new BevandaAlcolica("Bevanda alcolica", "Birra alla spina", 5, true);
        Drink drink6 = new BevandaAlcolica("Bevanda alcolica", "Vino bianco", 12, false);

        menu.addDrink(drink1);
        menu.addDrink(drink2);
        menu.addDrink(drink3);
        menu.addDrink(drink4);
        menu.addDrink(drink5);
        menu.addDrink(drink6);


        menu.stampaMenu();

        System.out.println("============================================================================================================================");

        menu.stampaPiattoDelGiorno();
        menu.stampaBevandaDelGiorno();

        System.out.println("============================================================================================================================");

        Cliente cliente = new Cliente("Rossi",  TipoPortate.CLASSICO,"25 Dicembre 20:00");
        Cliente cliente1 = new Cliente("De paolo", TipoPortate.VEGANO,"25 Dicembre 21:00");
        Cliente cliente2 = new Cliente("De luca", TipoPortate.VEGETARIANO,"25 Dicembre 22:00");

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


        Prenotazione prenotazione = new Prenotazione();

        prenotazione.aggiungiPrenotazione(cliente);
        prenotazione.aggiungiPrenotazione(cliente1);
        prenotazione.aggiungiPrenotazione(cliente2);

        prenotazione.rimuoviPrenotazione(cliente2);

        prenotazione.stampaPrenotoazioni();





    }
}
