public class Portata {

    public String name;
    public int price;

    public Portata(String name,int price){
        this.name = name;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Portata{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }



}
