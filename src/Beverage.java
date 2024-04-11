import org.apache.commons.lang3.StringUtils;

import java.util.NoSuchElementException;

public enum Beverage {
    COCA_MEDIUM("coca_medium", "coca medium", 3, Size.medium),
    ICE_TEA_SMALL("ice_team_small", "ice tea small", 2, Size.small),
    ICE_TEA_LARGE("ice_team_large", "ice tea large", 4, Size.large);

    private final String id;
    private final String name;

    public Size getSize() {
        return size;
    }

    private final double price;
    private final Size size;

    Beverage(String id, String name, double price, Size size) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public static Beverage getFromId(String id) {
        for (Beverage beverage : values()) {
            if (StringUtils.equals(beverage.id, id)) {
                return beverage;
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


