package themepark.stalls;

import themepark.Visitor;

public class IcecreamStall extends Stall {

    public IcecreamStall(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public double defaultPrice() {
        return 2.80;
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }
}
