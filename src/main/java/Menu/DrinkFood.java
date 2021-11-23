package Menu;

public class DrinkFood implements Menu {
    private String name;
    private int price;
    private String waterVolume;
    private boolean isSparkling;
    private String description;
    private boolean vegeterian;

    public static class Builder {
        private String name;
        private int price;
        private String waterVolume;
        private boolean isSparkling;
        private String description;
        private boolean vegeterian;

        public static Builder newInstance(String name, int price) {
            return new Builder(name, price);
        }

        public Builder (String name, int price) {
            this.name = name;
            this.price = price;
        }

        public Builder weight(String waterVolume) {
            this.waterVolume = waterVolume;
            return this;
        }

        public Builder calories(boolean isSparkling) {
            this.isSparkling = isSparkling;
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

        public DrinkFood build() {
            return new DrinkFood(this.name, this.price, this.waterVolume, this.isSparkling, this.description, this.vegeterian);
        }
    }

    public DrinkFood(String name, int price, String waterVolume, boolean isSparkling, String description, boolean vegeterian) {
        this.name = name;
        this.price = price;
        this.waterVolume = waterVolume;
        this.isSparkling = isSparkling;
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

    public String getWaterVolume() {
        return waterVolume;
    }

    public boolean isSparkling() {
        return isSparkling;
    }
}
