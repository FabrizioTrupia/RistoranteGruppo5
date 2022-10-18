public class Menu {

    public String type;
    public String name;
    public String price;

    public Menu(String type, String name, String price){
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return type + " Nome piatto: " + name + " Prezzo: " + price;
    }
}
