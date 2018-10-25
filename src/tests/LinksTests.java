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

        String capybara = animals.get(2); // �������� �������� ������
        capybara = "Slon"; // �������� ������? �� ����� ���� ������ ������� ����� � ���������
        System.out.println("animals: " + animals); // ������ � ��������� �� ����������, ��� ��� ������ Immutable

        // 2 mutable objects
        List<Unit> units = new ArrayList<>();
        units.add(new Warrior(800, "Hulk"));
        units.add(new Mage(100, "Dr. Strange"));
        units.add(new Archer(100, "Merida"));

        Unit hulk = units.get(0); // �������� ������ �� ������ �����
        hulk = new Warrior(600, "Wonder Woman"); // ������� ����� ������ � �������� � ���������� �����, ������ �� ������� ������ �������
        System.out.println("Hulk before: " + units); // � ��������� ������ �� ����������
        Unit hulk2 = units.get(0); // ����� �������� ������ �� ������ �����
        hulk2.setHitpoints(700); // �������� ��� ������ �����
        System.out.println("Hulk after: " + units); // � ��������� ����� ��� ������ ���������

        // todo ������ Mage ������� ���������� � ������, �������� toString ����� ��� ������ Mage
    }

}
