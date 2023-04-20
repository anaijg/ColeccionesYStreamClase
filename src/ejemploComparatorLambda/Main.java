package ejemploComparatorLambda;

import ejemploComparator.ComparaFNacimiento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio(3, "Valentin", LocalDate.of(2001, 2, 8));
        Socio socio2 = new Socio(2, "Claudia", LocalDate.of(2002, 10, 16));
        Socio socio3 = new Socio(1, "Javier", LocalDate.of(1996, 10, 14));
        Socio socio4 = new Socio(4, "Victor", LocalDate.of(1991, 5, 10));

        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);

        System.out.println("Según entran en el arraylist:");
        imprimirSocios(socios);
        System.out.println();
        // instanciamos Comparator
//        Comparator comparatorFNac = (o1, o2) -> {
//            Socio s1 = (Socio) o1;
//            Socio s2 = (Socio) o2;
//            if (s1.fNacimiento.isBefore(s2.fNacimiento)) {
//                return -1;
//            } else if (socio1.fNacimiento.isAfter(socio2.fNacimiento)) {
//                return 1;
//            } else {
//                return 0;
//            }
//        };
        // podemos saltarnos un paso, metiendo directamente la expresión lambda como argumento del método sort
        socios.sort((s1, s2) -> {
            if (s1.fNacimiento.isBefore(s2.fNacimiento)) {
                return -1;
            } else if (socio1.fNacimiento.isAfter(socio2.fNacimiento)) {
                return 1;
            } else {
                return 0;
            }
        });
        imprimirSocios(socios);
    }

    static void imprimirSocios(ArrayList<Socio> socios) {
        for (Socio elemento: socios) {
            System.out.println(elemento);
        }
    }
}
