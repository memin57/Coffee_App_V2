package memin.coffee.shop.application.v2;

public class CaffeLatte {

    private int id = 4;
    private String name = "Caffe Latte";
    private int price = 12;
    private int espressoAmount = 1;
    private int steamedMilkAmount = 3;
    private int milkFoamAmount = 1;

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

    public int getSteamedMilkAmount() {
        return steamedMilkAmount;
    }

    public void setSteamedMilkAmount(int steamedMilkAmount) {
        this.steamedMilkAmount = steamedMilkAmount;
    }

    public int getMilkFoamAmount() {
        return milkFoamAmount;
    }

    public void setMilkFoamAmount(int milkFoamAmount) {
        this.milkFoamAmount = milkFoamAmount;
    }
}
