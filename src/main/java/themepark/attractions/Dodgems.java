package themepark.attractions;

import themepark.Visitor;

public class Dodgems extends Attraction{

    public Dodgems(String name) {
        super(name);
    }

    public double defaultPrice(){
        return 4.50;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getAge() <= 12) {
            return defaultPrice() / 2;
        }
        else {
            return defaultPrice();
        }
    }
}
