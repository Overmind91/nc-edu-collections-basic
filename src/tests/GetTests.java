package tests;

import java.util.*;

/**
 * Created by Overmind on 25.10.2018.
 */
public class GetTests {

    public static void run() {
        System.out.println("\n*** GET tests Begin! ***");
        String[] catsArr = new String[]{"Salem", "Fluffy"};

        List<String> cats = new ArrayList<>();
        cats.add("Salem");
        cats.add("Fluffy");
        cats.add("Simon");
        cats.add("Grumpy Cat");

        // 1 toString() - коллекции можно привести к строке в отличии от массива
        System.out.println("Array to string: " + catsArr);
        System.out.println("Collection to string: " + cats);

        // 2 get by index from List
        //System.out.println("by index: " + cats.get(0) + ", " + cats.get(4)); // todo uncomment and fix

        // 3 by forEach loop
        for (String cat : cats) {
            System.out.print(cat + " is Amazing! ");
        }
        System.out.println();

        // 4 java8 forEach lambda
        cats.forEach(cat -> System.out.print(cat + " from Lambda! "));
        System.out.println();

        // 5 iterator
        Iterator<String> iterator = cats.iterator();
        while (iterator.hasNext()) {
            String nextCat = iterator.next();
            System.out.print(nextCat + " iterator cat! ");
        }
        System.out.println();

        // 6 Порядок элементов и уникальность в Set наглядно
        Set<String> numbers = new HashSet<>(); // (можете сравнить с LinkedHashSet, порядок будет верный)
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");
        numbers.add("six");
        numbers.add("seven");
        numbers.add("eight");
        numbers.add("nine");

        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");
        numbers.add("six");
        numbers.add("seven");
        numbers.add("eight");
        numbers.add("nine");
        System.out.println("Order and Uniqueness: " + numbers);

        // 7 получить элемент из Set numbers.
        // Как видите у Set нет get() метода по индексу. Потому что Set не использует индексы,
        // ведь элементы хранятся в "случайном" порядке
        //System.out.println("First element of numbers is: " + numbers.get(0)); // todo uncomment and fix

        // 8 Порядок элементов и уникальность в Map наглядно
        Map<String, String> nickToName = new HashMap<>(); // (можете сравнить с LinkedHashMap, порядок будет верный)
        nickToName.put("TheKiller", "Ivan");
        nickToName.put("FastAndFurious", "Anton");
        nickToName.put("Lucky", "Pavel");
        nickToName.put("Kitty777", "Olga");
        nickToName.put("Kitty777", "Ekaterina");
        nickToName.put("Shatenka", "Olga");
        nickToName.put(null, "test"); // ключом может быть даже null
        nickToName.put("test", null);
        System.out.println("nickToName: " + nickToName);

        System.out.println("nickToName.keySet():" + nickToName.keySet()); // ключи
        System.out.println("nickToName.values():" + nickToName.values()); // значения
    }

}
