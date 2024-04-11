public class BillCalculator {
    // java Program "assiette" "couscous" "coca" "moyen" "baba" "normal" "yes"

    // calcule le prix payé par l'utilisateur dans le restaurant, en fonction de type de
    // repas qu'il prend (assiette ou sandwich), de la taille de la boisson (petit, moyen, grand), du dessert et
    // de son type (normal ou special) et si il prend un café ou pas (yes ou no).
    // les prix sont fixes pour chaque type de chose mais des réductions peuvent s'appliquer
    // si cela rentre dans une formule!
    public double calculateBill(Bill bill) {
        double total = 0;

        total += bill.getMeal().getPrice();


        total += bill.getBeverage().getPrice();


        total += bill.getBeverage().getPrice();


        total += bill.getCoffee().getPrice();


        double forumeTotal = formuleChecker(bill);

        return forumeTotal != -1 ? forumeTotal : total;

    }


    public static int formuleChecker(Bill bill) {
        int basePrice = 0;

        switch (bill.getMeal().getContainer()) {
            case Container.plate:
                basePrice += calculatePlatePrice(bill.getBeverage().getSize(), bill.getDesert().getSize());
                break;
            case Container.sandwich:
                basePrice += calculateSandwichPrice(bill.getBeverage().getSize(), bill.getDesert().getSize());
                break;
            default:
                System.out.println("Type de repas non pris en charge.");
                return -1;
        }
        return basePrice;
    }

    public static int calculatePlatePrice(Size beverageSize, Size desertType) {
        int price = 15;

        switch (beverageSize) {
            case Size.small:
                price += 2;
                break;
            case Size.medium:
                if (desertType.equals(beverageSize)) {
                    price += 18;
                } else {
                    price += 7;
                }
                break;
            case Size.large:
                if (desertType.equals(beverageSize)) {
                    price += 6;
                } else {
                    price += 21;
                }
                break;
            default:
                System.out.println("Taille de boisson non prise en charge.");
                return -1;
        }

        return price;
    }

    public static int calculateSandwichPrice(Size beverageSize, Size desertType) {
        int price = 10;

        switch (beverageSize) {
            case Size.small:
                price += 4;
                break;
            case Size.medium:
                if (desertType.equals(beverageSize)) {
                    price += 13;
                } else {
                    price += 7;
                }
                break;
            case Size.large:
                if (desertType.equals(beverageSize)) {
                    price += 6;
                } else {
                    price += 16;
                }
                break;
            default:
                System.out.println("Taille de boisson non prise en charge.");
                return -1;
        }

        return price;
    }


}