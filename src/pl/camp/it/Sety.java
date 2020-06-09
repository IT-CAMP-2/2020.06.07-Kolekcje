package pl.camp.it;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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


    }
}
