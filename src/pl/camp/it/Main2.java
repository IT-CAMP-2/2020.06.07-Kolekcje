package pl.camp.it;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        metoda(lista);
    }

    public static void metoda(List<String> lista) {
        // cos robi z listą
        lista.add("ABC");
        lista.remove(0);

    }
}
