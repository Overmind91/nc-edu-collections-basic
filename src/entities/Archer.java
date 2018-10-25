package entities;

/**
 * Created by Overmind on 25.10.2018.
 */
public class Archer implements Unit {

    private int hitpoints = 0;
    private String name = "";
    private String type = "Archer";

    public Archer(int hitpoints, String name) {
        this.hitpoints = hitpoints;
        this.name = name;
    }

    public Archer(int hitpoints, String name, String type) {
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

    @Override
    public String toString() {
        return "Archer{" +
                "hitpoints=" + hitpoints +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode(); // todo fix
    }

    @Override
    public int hashCode() {
        return this.getHitPoints() + this.getName().hashCode() + this.getType().hashCode(); // todo fix
    }
}
