import java.util.ArrayList;
import java.util.List;

public class Menu {

    public String type;
    public String name;
    public String price;

    public List<Portata> portataList = new ArrayList<>();

    public Menu(String type, String name){
        this.type = type;
        this.name = name;

    }

    @Override
    public String toString() {
        return type + " Nome piatto: " + name + " Prezzo: " + price;
    }

    public void addPortata(Portata portata){

        portataList.add(portata);
    }
    public void removePortata(Portata portata){

        portataList.remove(portata);
    }

    public String stampaMenu() {

        //qui stampare il menù sul teminale usando la lista portate
        return "";
    }



}
