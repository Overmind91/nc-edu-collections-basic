package tests;

import java.util.*;

/**
 * Created by Overmind on 25.10.2018.
 */
public class AddTests {

    public static void run() {
        System.out.println("\n*** ADD tests Begin! ***");
        // Array
        String[] arrayNames = new String[5];
        System.out.println("Array elements count: " + arrayNames.length);
        arrayNames[0] = "Sasha";
        arrayNames[1] = "Masha";
        arrayNames[2] = "Dasha";
        arrayNames[3] = "Misha";
        arrayNames[4] = "Natasha";
        //arrayNames[5] = "Nyasha"; // todo fix

        // List без Generic, в такой лист можно добавить любой тип (String, int, boolean.. и что угодно)
        List names = new ArrayList(); // использовать не рекомендуетс€ !
        System.out.println("List elements count Before: " + names.size());
        names.add("Sasha");
        names.add("Natasha");
        names.add("Nyasha");
        names.add(1);
        names.add(false);
        //System.out.println("List elements count After: " + names.length); // todo uncomment and fix

        //¬ такой лист можно добавить только String
        List<String> genericNames = new ArrayList<>(); // <String> - это Generic, <> - diamond operator.
        genericNames.add("Sasha");
        genericNames.add("Natasha");
        genericNames.add("Nyasha");
        genericNames.add("Nyasha");
        genericNames.add("Nyasha");
        //genericNames.add(1); // todo uncomment and fix. ѕомен€ть данные на String
        //genericNames.add(false); // todo uncomment and fix. ѕомен€ть данные на String
        System.out.println("genericNames count : " + genericNames.size());

        // Set, при добавлении выполнитс€ проверка и если элемент уже есть, то он не добавитс€
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Sasha");
        uniqueNames.add("Natasha");
        uniqueNames.add("Nyasha");
        uniqueNames.add("Nyasha");
        uniqueNames.add("Nyasha");
        System.out.println("uniqueNames count: " + uniqueNames.size()); // как видите их не 5, а только 3

        // у мапы есть ключ и значение, ключ кникальный, значение нет
        /*Map<int, String> phoneToName = new HashMap<>(); // todo uncomment and fix. Generic не может быть примитивным типом
        phoneToName.put(555551, "taxi");
        phoneToName.put(202020, "aist");
        phoneToName.put(352590, "friend");
        phoneToName.put(555551, "taxi2");
        System.out.println("phoneToName scount: " + phoneToName.size()); // 3 элемента в ћапе в итоге, не 4
        */

        // —пособ создать коллекцию сразу с данными
        List<String> initializedList = new ArrayList<String>() // здесь diamond не работает ?\_(?)_/?
        {{
                add("111");
                add("222");
        }};

    }

}
