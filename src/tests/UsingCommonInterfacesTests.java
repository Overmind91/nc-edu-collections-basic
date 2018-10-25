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

        // ������� ����� ���������, ��������� � ��� ��� �������� ����� � ����
        // �� ������ ���������� � ��� ����� ��� ��� ���������, �� ��� ��� � �� ������ �����
        Collection<String> totalCollection = new ArrayList<>(); // �� ����� ���� ��� ������ ���� � ����� ������
        totalCollection.addAll(list);
        totalCollection.addAll(set);
        print(totalCollection);
    }

    // ��������� �� List/ArrayList/Set/HashSet, � Collection, ��� ��������� �������� � ������ �����������
    private static void print(Collection<String> anyCollection) {
        System.out.println(anyCollection + " size = " + anyCollection.size());
    }

}
