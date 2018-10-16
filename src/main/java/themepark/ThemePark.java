package themepark;

import themepark.attractions.Attraction;
import themepark.stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(String name){
        this.name = name;
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public void removeAttraction(Attraction attraction){
        this.attractions.remove(attraction);
    }

    public int countAttractions() {
        return attractions.size();
    }

    public void addStall(Stall stall){
        this.stalls.add(stall);
    }

    public void removeStall(Stall stall){
        this.stalls.remove(stall);
    }


    public String visit(Visitor visitor, Attraction attraction){
        return visitor.getId() + " has visited " + attraction.getName();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> reviewedLocations = new ArrayList<>();
        for (Attraction attraction : attractions){
            if (attraction instanceof IReviewed) {
                reviewedLocations.add(attraction);
            }
        }
        for (IReviewed stall : this.stalls) {
            if (stall instanceof IReviewed) {
                reviewedLocations.add(stall);
            }
        }
        return reviewedLocations;
    }
}
