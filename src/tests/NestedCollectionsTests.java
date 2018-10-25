package tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Overmind on 25.10.2018.
 */
public class NestedCollectionsTests {

    public static void run() {
        System.out.println("\n*** Nested Collections tests Begin! ***");

        List<List<String>> people = new ArrayList<>();
        List<String> students = new ArrayList<>();
        students.add("Ivan");
        students.add("Pavel");
        List<String> lecturers = new ArrayList<>();
        lecturers.add("Slava");
        lecturers.add("Eugene");
        people.add(students);
        people.add(lecturers);

        List<List<String>> groups = new ArrayList<>();
        List<String> programmers = new ArrayList<>();
        programmers.add("P-01");
        programmers.add("P-02");
        List<String> economics = new ArrayList<>();
        economics.add("E-01");
        economics.add("E-02");
        groups.add(programmers);
        groups.add(economics);

        Map<String, List<List<String>>> data = new HashMap<>();
        data.put("People", people);
        data.put("Groups", groups);
        System.out.println("Data Map: "+data);
    }

}
