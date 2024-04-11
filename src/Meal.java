import org.apache.commons.lang3.StringUtils;

import java.util.NoSuchElementException;

public enum Meal {
    COUSCOUS_PLATE("couscous_plate", "couscous sur assiette", 15, Container.plate),
    COUSCOUS_DOGYBAG("coucous_sandwich", "couscous dogybag", 10, Container.sandwich);

    private final String id;

    public Container getContainer() {
        return container;
    }

    private final String name;
    private final double price;
    private final Container container;

    Meal(String id, String name, double price, Container container) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.container = container;
    }

    public static Meal getFromId(String id) {
        for (Meal meal : values()) {
            if (StringUtils.equals(meal.id, id)) {
                return meal;
            }
        }
        throw new NoSuchElementException("Status with id: " + id + " not found");
    }

    public double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }
}