package themepark.attractions;

import themepark.ISecurity;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }


    public boolean isAllowedTo(themepark.Visitor visitor) {
        return (visitor.getAge() <= 15);
    }

}
