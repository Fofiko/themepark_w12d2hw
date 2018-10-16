package themepark.stalls;

import themepark.Visitor;

public class TobaccoStall extends Stall{

    public TobaccoStall(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedTo(themepark.Visitor visitor) {
        return (visitor.getAge() >= 18);
    }

    public double defaultPrice() {
        return 6.60;
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }


}
