package Ristorante.foodAndDrink;


public class Drink {
    /**
     * Tipo della bevanda
     */

    private String type;

    /**
     * Nome della bevanda
     */

    private String name;

    /**
     * Prezzo della bevanda
     */

    private Integer price;

    /**
     * Possibilità di indicare se una bevenda è del giorno o meno
     */

    private boolean bevandaDelGiorno;




    /**
     *
     * @param type
     * @param name
     * @param price
     * @param bevandaDelGiorno
     */
    public Drink(String type, String name, Integer price, boolean bevandaDelGiorno) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.bevandaDelGiorno = bevandaDelGiorno;

    }

    @Override
    public String toString() {
        return "Tipo: " + type + " , Nome della bevanda: " + name + " , Prezzo: " + price + " euro ";
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public boolean isBevandaDelGiorno() {
        return bevandaDelGiorno;
    }

    public void setBevandaDelGiorno(boolean bevandaDelGiorno) {
        this.bevandaDelGiorno = bevandaDelGiorno;
    }


}
