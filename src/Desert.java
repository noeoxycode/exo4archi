import org.apache.commons.lang3.StringUtils;

import java.util.NoSuchElementException;

public enum Desert {
    TIRAMISU("tiramisu_medium", "tiramisu", 9, Size.medium),
    PANACOTA_LARGE("panacota_large", "panacota large", 7.5, Size.large);

    private final String id;
    private final String name;
    private final double price;

    public Size getSize() {
        return size;
    }

    private final Size size;

    Desert(String id, String name, double price, Size size) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public static Desert getFromId(String id) {
        for (Desert desert : values()) {
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