import org.apache.commons.lang3.StringUtils;

import java.util.NoSuchElementException;

public enum Coffee {
    SMALL("small_coffee", "small coffee", 2),
    LARGE("large_coffee", "large coffee", 7.5);

    private final String id;
    private final String name;
    private final double price;

    Coffee(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static Coffee getFromId(String id) {
        for (Coffee desert : values()) {
            if (StringUtils.equals(desert.id, id)) {
                return desert;
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