//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//les arguments:
//"couscous_plate" "coca_medium" "panacota_large" "large_coffee"
public class Main {
    public static void main(String[] args) {
        BillCalculator app = new BillCalculator();
        Bill bill = new Bill.Builder()
                .withMeal(Meal.getFromId(args[0]))
                .withBeverage(Beverage.getFromId(args[1]))
                .withDesert(Desert.getFromId(args[2]))
                .withCoffee(Coffee.getFromId(args[3]))
                .build();
        double price = app.calculateBill(bill);
        System.out.println("Prix à payer : " + price + "€");
    }
}