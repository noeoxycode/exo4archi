import java.util.ArrayList;
import java.util.List;

public class Bill {
    private final Meal meal;
    private final Beverage beverage;
    private final Desert desert;
    private final Coffee coffee;

    public Meal getMeal() {
        return meal;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public Desert getDesert() {
        return desert;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    private Bill(Builder builder) {
        this.meal = builder.meal;
        this.beverage = builder.beverage;
        this.desert = builder.desert;
        this.coffee = builder.coffee;
    }

    public static class Builder {
        private Meal meal;
        private Beverage beverage;
        private Desert desert;
        private Coffee coffee;

        public Builder withMeal(Meal meal) {
            this.meal = meal;
            return this;
        }

        public Builder withBeverage(Beverage beverage) {
            this.beverage = beverage;
            return this;
        }

        public Builder withDesert(Desert desert) {
            this.desert = desert;
            return this;
        }

        public Builder withCoffee(Coffee coffee) {
            this.coffee = coffee;
            return this;
        }

        public Bill build() {
            return new Bill(this);
        }
    }
}


