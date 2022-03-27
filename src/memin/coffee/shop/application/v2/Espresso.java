package memin.coffee.shop.application.v2;

public class Espresso {

    private int id = 1;
    private String name = "Espresso";
    private int price = 7;
    private int espressoAmount = 1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getEspressoAmount() {
        return espressoAmount;
    }

    public void setEspressoAmount(int espressoAmount) {
        this.espressoAmount = espressoAmount;
    }
}
