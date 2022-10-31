public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu("Ristorante a base di carne", "Team 5" , 2);



        Portata primoPiatto1 = new PrimiPiatti(EnumType.primiPiatti, "Spaghetti alla carbonara", 11);
        Portata primoPiatto2 = new PrimiPiatti(EnumType.primiPiatti, "Rigatoni alla bolognese", 13);
        Portata primoPiatto3 = new PrimiPiatti(EnumType.primiPiatti, "Fettuccine panna e funghi", 10);

        menu.addPortata(primoPiatto1);
        menu.addPortata(primoPiatto2);
        menu.addPortata(primoPiatto3);



        Portata secondoPiatto1 = new SecondiPiatti(EnumType.secondiPiatti , "fiorentina" , 15);
        Portata secondoPiatto2 = new SecondiPiatti(EnumType.secondiPiatti , "involtini di carne" , 8);
        Portata secondoPiatto3 = new SecondiPiatti(EnumType.secondiPiatti , "cotoletta di pollo" , 7);

        menu.addPortata(secondoPiatto1);
        menu.addPortata(secondoPiatto2);
        menu.addPortata(secondoPiatto3);



        Drink drink1 = new Drink(EnumType.drink , "Acqua" , 1);
        Drink drink2 = new Drink(EnumType.drink , "Vino" , 4);
        Drink drink3 = new Drink(EnumType.drink , "Birra" , 3);

        menu.addDrink(drink1);
        menu.addDrink(drink2);
        menu.addDrink(drink3);



        menu.stampaMenu();
        menu.piattoDelGiorno();

    }
}
