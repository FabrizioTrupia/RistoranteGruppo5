import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Menu {

    public String type;
    public String name;
    public int coperto;

    public List<Portata> portataList = new ArrayList<>();
    public List<Drink> drinkList = new ArrayList<>();

    public Menu(String type, String name , int coperto){
        this.type = type;
        this.name = name;
        this.coperto = coperto;
    }

    @Override
    public String toString() {
        return type + " Nome piatto: " + name + " Coperto: " + coperto + " euro";
    }

    public void addPortata(Portata portata){

        portataList.add(portata);
    }

    public void addDrink(Drink drink){

        drinkList.add(drink);
    }

    public void removePortata(Portata portata){

        portataList.remove(portata);
    }

    public void stampaMenu() {
        portataList.forEach(System.out::println);

        drinkList.forEach(System.out::println);

    }

    public void piattoDelGiorno() {
        Random random = new Random();
        System.out.println("piatto del giorno: " +
                portataList.get( random.nextInt(portataList.size())));
    }



}
