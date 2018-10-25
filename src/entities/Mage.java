package entities;

/**
 * Created by Overmind on 25.10.2018.
 */
public class Mage implements Unit {

    private int hitpoints = 0;
    private String name = "";
    private String type = "Mage";

    public Mage(int hitpoints, String name) {
        this.hitpoints = hitpoints;
        this.name = name;
    }

    public Mage(int hitpoints, String name, String type) {
        this.hitpoints = hitpoints;
        this.name = name;
        this.type = type;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getHitPoints() {
        return hitpoints;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }


}
