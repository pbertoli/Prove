package prove;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] v1 = {10, 20, 30, 70, 50, 60, 70, 80, 90, 10, 110, 120};
        // uso di ArrayList
//
//        ArrayList lista = new ArrayList();
//        for (int i = 0; i < 10; i++) {
//            lista.add(11 * i);
//        }
//        lista.add(1, 5);
//        lista.remove(4);
//        lista.add(0, 3.2);
//        lista.add(0, "Siamo in tanti");
//        System.out.println(lista.indexOf(44));
//        System.out.println(lista);
//        lista.set(0, 111);
//        System.out.println(lista);
//        System.out.println(lista.size());
        Anagrafica.test();

    }
}

class Anagrafica {

    String nominativo;
    String comune;
    SimpleDate nascita;

    public Anagrafica(String n, String c, String d) {
        nominativo = n;
        comune = c;
        nascita = new SimpleDate(d);
    }

    public boolean equals(Anagrafica other) {
        if (nominativo.toLowerCase().equals(other.nominativo.toLowerCase())
                && nascita.equals(other.nascita)) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Anagrafica other) {
        if (nominativo.toLowerCase().compareTo(other.nominativo.toLowerCase()) == 0) {
            if (nascita.before(other.nascita)) {
                return -1;
            } else {
                return 1;
            }
        }
        return nominativo.toLowerCase().compareTo(other.nominativo.toLowerCase());
    }

    public String toString() {
        return nominativo + "-" + nascita + "-" + comune;
    }

    public static void test() {
        Anagrafica a1 = new Anagrafica("Pippo Baudo", "Catania", "10/10/1940");
        Anagrafica a2 = new Anagrafica("Vasco Rossi", "Reggio E.", "10-10-1950");
        Anagrafica a3 = new Anagrafica("Pippo Baudo", "Catania", "09/10/1940");
        
        ArrayList list = new ArrayList();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        System.out.println(list);
    }
}
