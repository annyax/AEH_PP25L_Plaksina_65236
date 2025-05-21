package pl.pp;

import java.util.*;

public class mojaDziesiataAplikacja {
    public static void main(String[] args) {
        int[] a = new int[100];
        long b[] = new long[10];
        String[] c = new String[5];
        c[0] = "Test 0";
        c[3] = "Test 3";

        System.out.println(c[0]);

        for (var i = 0; i < 100; i++) {
            a[i] = i;
        }
        for (var i = 0; i < 100; i++) {
            System.out.println(a[i]);
        }

        for (var i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        System.out.println("==================================================");
        for (var element : c) {
            System.out.println(element);
        }

        System.out.println("LISTY");
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(0, 5);
        list1.addAll(2, list2);

        for (var element : list1) {
            System.out.println(element);
        }
        System.out.println(list1.get(0));
        System.out.println(list1.get(3));

        System.out.println("Pozycja liczby 3 to: " + list1.indexOf(3));
        list1.remove(2);
        System.out.println("Pozycja liczby 3 to: " + list1.indexOf(3));

        list1.set(0, 10);
        System.out.println("Pierwszy element kolekcji: " + list1.get(0));

        System.out.println("Liczba elementów przed czyszczeniem: " + list1.size());
        list1.clear();
        System.out.println("Liczba elementów po czyszczeniu: " + list1.size());

        System.out.println("ZBIORY");
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(5);
        set2.add(4);

        set1.addAll(set2);

        System.out.println("Elementy: ");
        for (var element : set1) {
            System.out.println(element);
        }

        System.out.println("Liczba elementów: " + set1.size());
        set1.remove(2);
        System.out.println("Liczba elementów: " + set1.size());

        set1.clear();
        System.out.println("Liczba elementów: " + set1.size());

        System.out.println("MAPY");
        Map<Integer, String> map1 = new TreeMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        map1.put(1, "jeden");
        map1.put(2, "dwa");
        map1.put(3, "trzy");

        map2.put(5, "pięć");
        map2.put(4, "cztery");

        map1.putAll(map2);

        System.out.println("Klucze: ");
        for (var key : map1.keySet()) {
            System.out.println(key);
        }

        System.out.println("Wartości: ");
        for (var value : map1.values()) {
            System.out.println(value);
        }

        System.out.println("Pary: ");
        for (var entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Liczba elementów: " + map1.size());
        map1.remove(2);
        System.out.println("Liczba elementów: " + map1.size());

        map1.clear();
        System.out.println("Liczba elementów: " + map1.size());

        int[] input = {4, -432, 647, 32, -345, -53, 342, 801, 65, -456 , 563};
        int[] result = countAndSumElements(input);
        System.out.println("Negative count: " + result[0] + ", Positive sum: " + result[1]);

        int[] emptyInput = {};
        result = countAndSumElements(emptyInput);
        System.out.println("Empty array result: " + Arrays.toString(result));

        result = countAndSumElements(null);
        System.out.println("Null array result: " + Arrays.toString(result));
    }

    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }

        int negativeCount = 0;
        int positiveSum = 0;

        for (int num : input) {
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {positiveSum += num;
            }
        }

        return new int[]{negativeCount, positiveSum};
    }
}