package themepark.attractions;

import themepark.IReviewed;

public abstract class Attraction implements IReviewed {

    private String name;
    private int rating;

    public Attraction(String name, int rating){

        this.name = name;
        this.rating = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }
}
