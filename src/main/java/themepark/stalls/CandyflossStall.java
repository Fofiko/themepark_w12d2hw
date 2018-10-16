package themepark.stalls;

import themepark.Visitor;

public class CandyflossStall extends Stall {

    public CandyflossStall(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public double defaultPrice() {
        return 4.20;
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }


}
