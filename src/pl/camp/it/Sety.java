package pl.camp.it;

import java.util.*;

public class Sety {
    public static void main(String[] args) {
        Set<String> zbior = new HashSet<>();

        zbior.add("ABC");

        System.out.println(zbior.size());

        zbior.add("ABC");

        System.out.println(zbior.size());

        zbior.add("BBB");
        zbior.add("Cee");

        System.out.println(zbior);

        Iterator<String> iterator = zbior.iterator();

        //iterator.remove();

        while (iterator.hasNext()) {
            String temp = iterator.next();
            System.out.println(temp);
        }

        Iterator<String> iterator2 = zbior.iterator();
        boolean a = true;

        while (iterator2.hasNext() && a) {
            String temp = iterator2.next();
            System.out.println(temp);
        }

        zbior.remove("ABC");

        for(String temp : zbior) {
            System.out.println(temp);
        }
    }
}
