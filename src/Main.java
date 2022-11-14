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

        Portata antipasto1 = new Antipasti("Antipasto", "tagliere di salumi" , 8);
        Portata antipasto2 = new Antipasti("Antipasto", "rustici di carne" , 6);
        Portata antipasto3 = new Antipasti("Antipasto", "tartare di manzo", 8);

        menu.addPortata(antipasto1);
        menu.addPortata(antipasto2);
        menu.addPortata(antipasto3);

        Portata primoPiatto1 = new PrimiPiatti("Primo piatto", "Spaghetti alla carbonara", 11);
        Portata primoPiatto2 = new PrimiPiatti("Primo piatto", "Rigatoni alla bolognese", 13);
        Portata primoPiatto3 = new PrimiPiatti("Primo piatto", "Fettuccine panna e funghi", 10);

        menu.addPortata(primoPiatto1);
        menu.addPortata(primoPiatto2);
        menu.addPortata(primoPiatto3);

        Portata secondoPiatto1 = new SecondiPiatti("Secondo piatto" , "fiorentina" , 15);
        Portata secondoPiatto2 = new SecondiPiatti("Secondo piatto" , "involtini di carne" , 8);
        Portata secondoPiatto3 = new SecondiPiatti("Secondo piatto" , "cotoletta di pollo" , 7);

        menu.addPortata(secondoPiatto1);
        menu.addPortata(secondoPiatto2);
        menu.addPortata(secondoPiatto3);

        Portata dessert1 = new Dessert("Dessert", "tortini ripieni", 3);
        Portata dessert2 = new Dessert("Dessert", "torta di ciliege", 9);
        Portata dessert3 = new Dessert("Dessert", "crostata di mele", 6);

        menu.addPortata(dessert1);
        menu.addPortata(dessert2);
        menu.addPortata(dessert3);

        Drink drink1 = new Drink("Bevanda" , "Acqua" , 1);
        Drink drink2 = new Drink("Bevanda" , "Vino" , 4);
        Drink drink3 = new Drink("Bevanda" , "Birra" , 3);

        menu.addDrink(drink1);
        menu.addDrink(drink2);
        menu.addDrink(drink3);

        menu.stampaMenu();
        System.out.println("---------------------------------------------------------------------------------");
        menu.piattoDelGiorno();


    }
}
