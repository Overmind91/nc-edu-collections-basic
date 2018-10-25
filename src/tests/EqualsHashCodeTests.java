package tests;

import entities.Archer;
import entities.Unit;
import entities.Warrior;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Overmind on 25.10.2018.
 */
public class EqualsHashCodeTests {

    public static void run() {
        System.out.println("\n*** Equals and Hashcode tests Begin! ***");

        Set<Unit> warriors = new HashSet<>();
        warriors.add(new Warrior(800, "Hulk", "Warrior"));
        warriors.add(new Warrior(800, "Warrior", "Hulk"));
        warriors.add(new Archer(800, "Warrior", "Hulk"));
        System.out.println("warriors: " + warriors); // todo fix, надо поправить чтобы было 3 элемента
    }

}
