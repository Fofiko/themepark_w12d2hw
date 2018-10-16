package themepark.stalls;

import themepark.Visitor;

public class IcecreamStall extends Stall {

    public IcecreamStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public double defaultPrice() {
        return 2.80;
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }
}
