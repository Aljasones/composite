package Menu;

public class HotFood implements Menu {
    private String name;
    private int price;
    private String weight;
    private String calories;
    private String description;
    private boolean vegeterian;

    public static class Builder {
        private String name;
        private int price;
        private String weight;
        private String calories;
        private String description;
        private boolean vegeterian;

        public static Menu.DrinkFood.Builder newInstance(String name, int price) {
            return new Menu.DrinkFood.Builder(name, price);
        }

        public Builder (String name, int price) {
            this.name = name;
            this.price = price;
        }

        public Builder weight(String weight) {
            this.weight = weight;
            return this;
        }

        public Builder calories(String calories) {
            this.calories = calories;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder vegeterian(boolean vegeterian) {
            this.vegeterian = vegeterian;
            return this;
        }

        public HotFood build() {
            return new HotFood(this.name, this.price, this.weight, this.calories, this.description, this.vegeterian);
        }
    }

    public HotFood(String name, int price, String weight, String calories, String description, boolean vegeterian) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.calories = calories;
        this.description = description;
        this.vegeterian = vegeterian;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getWeight() {
        return weight;
    }

    public String getCalories() {
        return calories;
    }

}
