public class Main {
    public static void main(String[] args) {

        System.out.println("ANTIPASTI");
        Menu antipasto1 = new Menu("Antipasto:" , "Tartare di carne" , "8 euro");
        Menu antipasto2 = new Menu("Antipasto:" , "Tagliere di salumi" , "10 euro");
        Menu antipasto3 = new Menu("Antipasto:" , "Rusticini allo spiedo" , "6 euro");

        System.out.println(antipasto1);
        System.out.println(antipasto2);
        System.out.println(antipasto3);





        System.out.println("PRIMI PIATTI");
    Menu primoPiatto = new Menu("primo piatto", "spaghetti alla carbonara", "13 euro");
    Menu primoPiatto2 = new Menu("primo piatto", "fettuccine alla bolognese", "10 euro");
        Menu primoPiatto3 = new Menu("primo piatto", "cavatelli funghi e salsiccia", "11 euro");
        System.out.println(primoPiatto);
        System.out.println(primoPiatto2);
        System.out.println(primoPiatto3);





        System.out.println("BEVANDE");
        Menu drink1 = new Menu("Bevanda:" , "Vino" , "12 euro");
        Menu drink2 = new Menu("Bevanda:" , "Acqua" , "2 euro");
        Menu drink3 = new Menu("Bevanda:" , "Birra" , "4 euro");

        System.out.println(drink1);
        System.out.println(drink2);
        System.out.println(drink3);


        System.out.println("DESSERTS");
        Menu dessert1 = new Menu("Dessert", "Torta di fragole", "8 euro");
        Menu dessert2 = new Menu("Dessert", "Sorbetto all' arancia", "3 euro");
        System.out.println(dessert1);
        System.out.println(dessert2);
    }
}
