public class Main {
    public static void main(String[] args) {


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



    }
}
