package memin.coffee.shop.application.v2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> drinkList = new ArrayList<String>();

    static Espresso espresso = new Espresso();
    static DoubleEspresso doubleEspresso = new DoubleEspresso();
    static Cappuccino cappuccino = new Cappuccino();
    static CaffeLatte caffeLatte = new CaffeLatte();
    static Mocha mocha = new Mocha();
    static Americano americano = new Americano();
    static HotWater hotWater = new HotWater();

    public static void main(String[] args) {
        setDrinkList();
        showDrinkList();

        int selectedDrinkId = getSelectedDrinkIdFromUser();
        if (selectedDrinkId != 0) {
            showDrinkInfo(selectedDrinkId);
        } else {
            System.out.println("Yanlış değer girdiniz!");
        }
    }

    public static int getSelectedDrinkIdFromUser() {

        System.out.print("Seçiminiz: ");
        Scanner input = new Scanner(System.in);
        if (!input.hasNextInt()) {
            return 0;
        }
        return input.nextInt();
    }

    public static void setDrinkList() {

        drinkList.add(espresso.getId() + ". "
                + espresso.getName() + "(" + espresso.getPrice() + "₺)");
        drinkList.add(doubleEspresso.getId() + ". "
                + doubleEspresso.getName() + "(" + doubleEspresso.getPrice() + "₺)");
        drinkList.add(cappuccino.getId() + ". "
                + cappuccino.getName() + "(" + cappuccino.getPrice() + "₺)");
        drinkList.add(caffeLatte.getId() + ". "
                + caffeLatte.getName() + "(" + caffeLatte.getPrice() + "₺)");
        drinkList.add(mocha.getId() + ". "
                + mocha.getName() + "(" + mocha.getPrice() + "₺)");
        drinkList.add(americano.getId() + ". "
                + americano.getName() + "(" + americano.getPrice() + "₺)");
        drinkList.add(hotWater.getId() + ". "
                + hotWater.getName() + "(" + hotWater.getPrice() + "₺)");
    }

    public static void showDrinkList() {

        for (String s : drinkList) {
            System.out.println(s);
        }
    }

    public static void showDrinkInfo(int selectedDrinkId) {
        int id = selectedDrinkId;

        if (id == espresso.getId()) {
            getEspressoInfo();

        } else if (id == doubleEspresso.getId()) {
            getDoubleEspressoInfo();

        } else if (id == cappuccino.getId()) {
            getCappuccinoInfo();

        } else if (id == caffeLatte.getId()) {
            getCaffeLatteInfo();

        } else if (id == mocha.getId()) {
            getMochaInfo();

        } else if (id == americano.getId()) {
            getAnmericanoInfo();

        } else if (id == hotWater.getId()) {
            getHotWaterInfo();

        } else {
            System.out.println("Lütfen doğru ürün numarasını girin");
            id = getSelectedDrinkIdFromUser();
            showDrinkInfo(id);
        }
    }

    public static void getEspressoInfo() {

        System.out.println(espresso.getName() + " seçtiniz. Bu içeceğimiz " +
                espresso.getEspressoAmount() + " doz espresso içermektedir.");
    }

    public static void getDoubleEspressoInfo() {

        System.out.println(doubleEspresso.getName() + " seçtiniz. Bu içeceğimiz " +
                doubleEspresso.getEspressoAmount() + " doz espresso içermektedir.");
    }

    public static void getCappuccinoInfo() {

        System.out.println(cappuccino.getName() + " seçtiniz. Bu içeceğimiz " +
                cappuccino.getEspressoAmount() + " doz espresso, " +
                cappuccino.getSteamedMilkAmount() + " doz Steamed Milk ve " +
                cappuccino.getMilkFoamAmount() + " doz Milk Foam içermektedir.");
    }

    public static void getCaffeLatteInfo() {

        System.out.println(caffeLatte.getName() + " seçtiniz. Bu içeceğimiz " +
                caffeLatte.getEspressoAmount() + " doz espresso, " +
                caffeLatte.getSteamedMilkAmount() + " doz Steamed Milk ve " +
                caffeLatte.getMilkFoamAmount() + " doz Milk Foam içermektedir.");
    }

    public static void getMochaInfo() {

        System.out.println(mocha.getName() + " seçtiniz. Bu içeceğimiz " +
                mocha.getEspressoAmount() + " doz espresso, " +
                mocha.getSteamedMilkAmount() + " doz Steamed Milk, " +
                mocha.getMilkFoamAmount() + " doz Milk Foam, ve " +
                mocha.getHotChocolateAmount() + " doz Hot Chocolate içermektedir.");
    }

    public static void getAnmericanoInfo() {

        System.out.println(americano.getName() + " seçtiniz. Bu içeceğimiz " +
                americano.getHotWaterAmount() + " doz sıcak su ve " +
                americano.getEspressoAmount() + " doz espresso içermektedir.");
    }

    public static void getHotWaterInfo() {

        System.out.println(hotWater.getName() + " seçtiniz. Bu içeceğimiz " +
                hotWater.getHotWaterAmount() + " doz sıcak su içermektedir.");
    }
}
