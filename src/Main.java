public class Main {
    public static void main(String[] args) {

        System.out.println("ANTIPASTI");
        Antipasto antipasto1 = new Antipasto("Antipasto:" , "Tartare di carne" , "8 euro");
        Antipasto antipasto2 = new Antipasto("Antipasto:" , "Tagliere di salumi" , "10 euro");
        Antipasto antipasto3 = new Antipasto("Antipasto:" , "Rusticini allo spiedo" , "6 euro");

        System.out.println(antipasto1);
        System.out.println(antipasto2);
        System.out.println(antipasto3);





        System.out.println("PRIMI PIATTI");
    Primo primoPiatto = new Primo("primo piatto", "spaghetti alla carbonara", "13 euro");
    Primo primoPiatto2 = new Primo("primo piatto", "fettuccine alla bolognese", "10 euro");
        Primo primoPiatto3 = new Primo("primo piatto", "cavatelli funghi e salsiccia", "11 euro");
        System.out.println(primoPiatto);
        System.out.println(primoPiatto2);
        System.out.println(primoPiatto3);





        System.out.println("BEVANDE");
        Drink drink1 = new Drink("Bevanda:" , "Vino" , "12 euro");
        Drink drink2 = new Drink("Bevanda:" , "Acqua" , "2 euro");
        Drink drink3 = new Drink("Bevanda:" , "Birra" , "4 euro");

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
