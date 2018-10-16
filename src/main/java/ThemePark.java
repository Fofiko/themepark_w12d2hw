import attractions.*;
import org.w3c.dom.Attr;
import stalls.Stall;

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
}
