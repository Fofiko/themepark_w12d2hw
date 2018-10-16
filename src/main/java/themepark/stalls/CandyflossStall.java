package themepark.stalls;

import themepark.Visitor;

public class CandyflossStall extends Stall {

    public CandyflossStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public double defaultPrice() {
        return 4.20;
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }


}
