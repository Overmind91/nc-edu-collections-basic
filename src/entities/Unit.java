package entities;

/**
 * Created by Overmind on 25.10.2018.
 */
public interface Unit {

    void setHitpoints(int hitpoints);
    void setName(String name);
    void setType(String type);

    int getHitPoints();
    String getName();
    String getType();
}
