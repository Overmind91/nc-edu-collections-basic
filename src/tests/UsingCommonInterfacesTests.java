package tests;

import java.util.*;

/**
 * Created by Overmind on 25.10.2018.
 */
public class UsingCommonInterfacesTests {

    public static void run() {
        System.out.println("\n*** Using Common Interfaces tests Begin! ***");

        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        print(list);

        Set<String> set = new HashSet<>();
        set.add("444");
        set.add("555");
        print(set);

        // создаем общую коллекцию, добавляем в нее все элементы листа и сета
        // мы теряем информацию о том какой это тип коллекции, но нам это и не всегда нужно
        Collection<String> totalCollection = new ArrayList<>(); // на самом деле это внутри лист в нашем случае
        totalCollection.addAll(list);
        totalCollection.addAll(set);
        print(totalCollection);
    }

    // принимает не List/ArrayList/Set/HashSet, а Collection, что позволяет работать с любыми коллекциями
    private static void print(Collection<String> anyCollection) {
        System.out.println(anyCollection + " size = " + anyCollection.size());
    }

}
