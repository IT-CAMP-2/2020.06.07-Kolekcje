package pl.camp.it;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        lista.add(5);

        System.out.println(lista.get(0));
        System.out.println(lista.size());

        lista.add(6);
        lista.add(7);

        System.out.println(lista.size());

        lista.remove(0);

        System.out.println(lista.size());
        System.out.println(lista.get(0));
        System.out.println(lista.remove(0));

        lista.add("String");

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        ArrayList listaStringow = new ArrayList<String>();
        ArrayList<String> listaStringow2 = new ArrayList<>();

        listaStringow.add("ABC");
        listaStringow2.add("ABC");

        listaStringow.add(5);
        //listaStringow2.add(5);
        System.out.println(listaStringow.size());

        System.out.println(listaStringow.get(1) instanceof String);


        //LinkedList<Car> samochody = new LinkedList<>();
    }
}
