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

        Menu menu = new Menu(new ArrayList<>());

        /**
         *Antipasti classici
         */

        List<Portata> antipastoLista = new ArrayList<>();
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

        antipastoLista.add(antipasto1);
        antipastoLista.add(antipasto2);
        antipastoLista.add(antipasto3);
        antipastoLista.add(antipasto4);
        antipastoLista.add(antipasto5);
        antipastoLista.add(antipasto6);
        antipastoLista.add(antipasto7);
        menu.aggiungereListaALMenu(antipastoLista);

        /**
         *Primi piatti classici
         */

        List<Portata> primiPiattiLista = new ArrayList<>();
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

        primiPiattiLista.add(primoPiatto1);
        primiPiattiLista.add(primoPiatto2);
        primiPiattiLista.add(primoPiatto3);
        primiPiattiLista.add(primoPiatto4);
        primiPiattiLista.add(primoPiatto5);
        primiPiattiLista.add(primoPiatto6);
        primiPiattiLista.add(primoPiatto7);
        menu.aggiungereListaALMenu(primiPiattiLista);

        /**
         *Secondi piatti classici
         */

        List<Portata> secondiPiattiLista = new ArrayList<>();
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

        secondiPiattiLista.add(secondoPiatto1);
        secondiPiattiLista.add(secondoPiatto2);
        secondiPiattiLista.add(secondoPiatto3);
        secondiPiattiLista.add(secondoPiatto4);
        secondiPiattiLista.add(secondoPiatto5);
        secondiPiattiLista.add(secondoPiatto6);
        secondiPiattiLista.add(secondoPiatto7);
        menu.aggiungereListaALMenu(secondiPiattiLista);



        List<Portata> dessertLista = new ArrayList<>();
        Portata dessert1 = new Dessert("Dessert", "tortini ripieni", 3,false, TipoPortate.CLASSICO);
        Portata dessert2 = new Dessert("Dessert", "torta di ciliege", 9,true, TipoPortate.CLASSICO);
        Portata dessert3 = new Dessert("Dessert", "crostata di mele", 6,false, TipoPortate.CLASSICO);

        dessertLista.add(dessert1);
        dessertLista.add(dessert2);
        dessertLista.add(dessert3);
        menu.aggiungereListaALMenu(dessertLista);




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

        Prenotazione prenotazione = new Prenotazione(new ArrayList<>());

        List<Cliente> clienteList = new ArrayList<>();

        clienteList.add(cliente);
        clienteList.add(cliente1);
        clienteList.add(cliente2);
        prenotazione.aggiungerePrenotazioni(clienteList);

        prenotazione.stampaPrenotazioni();










    }
}
