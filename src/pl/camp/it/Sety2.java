package pl.camp.it;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sety2 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("ZZZ");
        set.add("BS");

        set.add("ABC");

        set.add("RESD");

        System.out.println(set);

        Set<Integer> set1 = new TreeSet<>();

        set1.add(4);
        set1.add(2);
        set1.add(45);
        set1.add(35);

        System.out.println(set1);

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
