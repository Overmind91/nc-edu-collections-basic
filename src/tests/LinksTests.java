package tests;

import entities.Archer;
import entities.Mage;
import entities.Unit;
import entities.Warrior;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Overmind on 25.10.2018.
 */
public class LinksTests {

    public static void run() {
        System.out.println("\n*** Linkss tests Begin! ***");

        // 1 immutable objects
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("capybara");

        String capybara = animals.get(2); // получили значение строки
        capybara = "Slon"; // поменяли строку? На самом деле просто создали новую и присвоили
        System.out.println("animals: " + animals); // строка в коллекции не изменилась, так как объект Immutable

        // 2 mutable objects
        List<Unit> units = new ArrayList<>();
        units.add(new Warrior(800, "Hulk"));
        units.add(new Mage(100, "Dr. Strange"));
        units.add(new Archer(100, "Merida"));

        Unit hulk = units.get(0); // получили ссылку на объект Халка
        hulk = new Warrior(600, "Wonder Woman"); // создали новый объект и записали в переменную халка, ссылка из верхней строки пропала
        System.out.println("Hulk before: " + units); // в коллекции ничего не поменялось
        Unit hulk2 = units.get(0); // снова получили ссылку на объект Халка
        hulk2.setHitpoints(700); // изменили сам объект Халка
        System.out.println("Hulk after: " + units); // в коллекции видим что объект изменился

        // todo объект Mage неверно приводится к строке, написать toString метод для класса Mage
    }

}
