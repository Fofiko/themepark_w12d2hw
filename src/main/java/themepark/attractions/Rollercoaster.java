package themepark.attractions;

import themepark.Visitor;

public class Rollercoaster extends Attraction{


    public Rollercoaster(String name) {
        super(name);
    }


    public boolean isAllowedTo(themepark.Visitor visitor) {
        return (visitor.getHeight() >= 1.45 && visitor.getAge() > 12);
    }

    public double defaultPrice(){
        return 8.40;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getHeight() >= 2.00) {
            return defaultPrice() * 2;
        }
        else {
            return defaultPrice();
        }
    }
}
