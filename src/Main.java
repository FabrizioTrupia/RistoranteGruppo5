public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu("ristorante 5 menu", "PIPPO");

        System.out.println("ANTIPASTI");
        Portata antipasto1 = new Antipasti("Antipasto:" , 8);
        Portata primoPiatto = new PrimiPiatti("spaghetti alla carbonara",13);
        Portata secondoPiatto = new SecondiPiatti("spaghetti alla carbonara",13);
        Portata dessert = new Desser("torta di ciliege",13);

        menu.addPortata(antipasto1);
        menu.addPortata(primoPiatto);
        menu.addPortata(secondoPiatto);
        menu.addPortata(dessert);

        menu.stampaMenu();
        menu.piattoDelGiorno();

    }
}
