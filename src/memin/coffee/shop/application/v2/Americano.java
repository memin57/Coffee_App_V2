package memin.coffee.shop.application.v2;

public class Americano {

    private int id = 6;
    private String name = "Americano";
    private int price = 10;
    private int hotWaterAmount = 4;
    private int espressoAmount = 0;

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

    public int getHotWaterAmount() {
        return hotWaterAmount;
    }

    public void setHotWaterAmount(int hotWaterAmount) {
        this.hotWaterAmount = hotWaterAmount;
    }

    public int getEspressoAmount() {
        return espressoAmount;
    }

    public void setEspressoAmount(int espressoAmount) {
        this.espressoAmount = espressoAmount;
    }
}



