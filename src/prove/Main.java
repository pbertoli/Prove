package prove;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(fattoriale(13));
        } catch (ExceptionParamNegativo e) {
        } catch (ExceptionParamGrande e) { }    
    }

    public static int fattoriale(int N)
            throws ExceptionParamNegativo,
            ExceptionParamGrande {
        if (N < 0) {
            throw new ExceptionParamNegativo(
                    "Argomento del fattorile negativo.");
        }
        if (N > 12) {
            throw new ExceptionParamGrande(
                    "Argomento del fattorile grande.");
        }
        if (N < 2) {
            return 1;
        } else {
            return fattoriale(N - 1) * N;
        }
    }
}

class ExceptionParamNegativo extends Exception {

    public ExceptionParamNegativo(String s) {
        System.out.println(s);
    }
}
class ExceptionParamGrande extends Exception {
    public ExceptionParamGrande(String s) {
        System.out.println(s);
    }
}

//class Anagrafica {
//
//    String nominativo;
//    String comune;
//    SimpleDate nascita;
//
//    public Anagrafica(String n, String c, String d) {
//        nominativo = n;
//        comune = c;
//        nascita = new SimpleDate(d);
//    }
//
//    public boolean equals(Anagrafica other) {
//        if (nominativo.toLowerCase().equals(other.nominativo.toLowerCase())
//                && nascita.equals(other.nascita)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public int compareTo(Anagrafica other) {
//        if (nominativo.toLowerCase().compareTo(other.nominativo.toLowerCase()) == 0) {
//            if (nascita.before(other.nascita)) {
//                return -1;
//            } else {
//                return 1;
//            }
//        }
//        return nominativo.toLowerCase().compareTo(other.nominativo.toLowerCase());
//    }
//
//    public String toString() {
//        return nominativo + "-" + nascita + "-" + comune;
//    }
//
//    public static void test() {
//        Anagrafica a1 = new Anagrafica("Pippo Baudo", "Catania", "10/10/1940");
//        Anagrafica a2 = new Anagrafica("Vasco Rossi", "Reggio E.", "10-10-1950");
//        Anagrafica a3 = new Anagrafica("Pippo Baudo", "Catania", "09/10/1940");
//        
//        ArrayList list = new ArrayList();
//        list.add(a1);
//        list.add(a2);
//        list.add(a3);
//        System.out.println(list);
//        list.remove(a3);
//        System.out.println(list);
//    }
//}

