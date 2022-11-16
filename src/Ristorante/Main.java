package Ristorante;

import Ristorante.FoodAndDrink.*;
import Ristorante.FoodAndDrink.DrinEnti.BevandaAlcolica;
import Ristorante.FoodAndDrink.DrinEnti.BevandaAnalcolica;
import Ristorante.FoodAndDrink.PortEnti.Antipasti;
import Ristorante.FoodAndDrink.PortEnti.Dessert;
import Ristorante.FoodAndDrink.PortEnti.PrimiPiatti;
import Ristorante.FoodAndDrink.PortEnti.SecondiPiatti;

/**
 * In questa classe sono stati creati delle istanze di oggetti nelle varie classi e aggiunti alla lista
 *  con il metodo stampaMenu viene stampato il menu
 *  con il metodo piatto del giorno viene stampato un piatto randomico
 * La classe che fa riferimento al main
 * @author Fabrizio Trupia , Alessandro Trupia , Nicola Boniello , Andrea Sciscioli
 * @version 1
 */

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu("Ristorante a base di carne", "Team 5" , 2);

        Portata antipasto1 = new Antipasti("Antipasto", "tagliere di salumi" , 8,false, TypeMenuEnum.MENU_CLASSIC);
        Portata antipasto2 = new Antipasti("Antipasto", "rustici di carne" , 6,true, TypeMenuEnum.MENU_CLASSIC);
        Portata antipasto3 = new Antipasti("Antipasto", "tartare di manzo", 8,false, TypeMenuEnum.MENU_CLASSIC);

        menu.addPortata(antipasto1);
        menu.addPortata(antipasto2);
        menu.addPortata(antipasto3);

        Portata primoPiatto1 = new PrimiPiatti("Primo piatto", "Spaghetti alla carbonara", 11,true, TypeMenuEnum.MENU_CLASSIC);
        Portata primoPiatto2 = new PrimiPiatti("Primo piatto", "Rigatoni alla bolognese", 13,false, TypeMenuEnum.MENU_CLASSIC);
        Portata primoPiatto3 = new PrimiPiatti("Primo piatto", "Fettuccine panna e funghi", 10,false, TypeMenuEnum.MENU_CLASSIC);

        menu.addPortata(primoPiatto1);
        menu.addPortata(primoPiatto2);
        menu.addPortata(primoPiatto3);

        Portata secondoPiatto1 = new SecondiPiatti("Secondo piatto" , "fiorentina" , 15,false, TypeMenuEnum.MENU_CLASSIC);
        Portata secondoPiatto2 = new SecondiPiatti("Secondo piatto" , "involtini di carne" , 8,false, TypeMenuEnum.MENU_CLASSIC);
        Portata secondoPiatto3 = new SecondiPiatti("Secondo piatto" , "cotoletta di pollo" , 7,true, TypeMenuEnum.MENU_CLASSIC);

        menu.addPortata(secondoPiatto1);
        menu.addPortata(secondoPiatto2);
        menu.addPortata(secondoPiatto3);

        Portata dessert1 = new Dessert("Ristorante.FoodAndDrink.PortEnti.Dessert", "tortini ripieni", 3,false, TypeMenuEnum.MENU_CLASSIC);
        Portata dessert2 = new Dessert("Ristorante.FoodAndDrink.PortEnti.Dessert", "torta di ciliege", 9,true, TypeMenuEnum.MENU_CLASSIC);
        Portata dessert3 = new Dessert("Ristorante.FoodAndDrink.PortEnti.Dessert", "crostata di mele", 6,false, TypeMenuEnum.MENU_CLASSIC);

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
        System.out.println("---------------------------------------------------------------------------------");
        menu.stampaPiattoDelGiorno();
        menu.stampaBevandaDelGiorno();




    }
}
