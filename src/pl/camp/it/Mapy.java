package pl.camp.it;

import java.util.*;

public class Mapy {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(6, "ABC");
        mapa.put(3, "BBB");
        mapa.put(10, "BBB");
        mapa.put(1, "BBB");
        mapa.put(38, "BBB");
        mapa.put(0, "BBB");

        System.out.println(mapa.size());

        System.out.println(mapa.get(1));

        Set<Map.Entry<Integer, String>> entries = mapa.entrySet();

        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> wpis = iterator.next();

            System.out.println("Klucz : " + wpis.getKey() +
                    " Wartość : " + wpis.getValue());
        }

        Set<Entry> naszaMapa = new HashSet<>();

        Map<String, String> mapa2 = new HashMap<>();

        mapa2.put("ABAW", "jshadfjtas");
        mapa2.put("iusygr", "jshadfjtas");
        mapa2.put("hjsdfyt", "jshadfjtas");
        mapa2.put("uyastdu", "jshadfjtas");

        Iterator<Map.Entry<String, String>> iterator2 = mapa2.entrySet().iterator();

        while (iterator2.hasNext()) {
            Map.Entry<String, String> wpis = iterator2.next();

            System.out.println("Klucz : " + wpis.getKey() +
                    " Wartość : " + wpis.getValue());
        }

        mapa2.put(null, "SADFGD");

        System.out.println(mapa2.get(null));

    }
}
