package themepark.attractions;

import themepark.ISecurity;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name) {
        super(name);
    }


    public boolean isAllowedTo(themepark.Visitor visitor) {
        return (visitor.getAge() <= 15);
    }

}
