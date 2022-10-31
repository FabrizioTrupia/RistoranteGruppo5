public class Drink {

    public EnumType type;
    public String name;
    public int price;

    public Drink(EnumType type, String name,int price){
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bibita: " + type + " , Nome della bevanda: " + name + " , Prezzo: " + price + " euro";
    }


}
