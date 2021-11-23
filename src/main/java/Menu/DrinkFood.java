package Menu;

public class DrinkFood implements Menu {
    private String name;
    private String price;
    private String waterVolume;
    private boolean isSparkling;

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getWaterVolume() {
        return waterVolume;
    }

    public boolean isSparkling() {
        return isSparkling;
    }
}
