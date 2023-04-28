package ejercicios.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        // Los números se irán insertando en una colección, pudiéndose repetir.
        List<Integer> números = new ArrayList<>();
        do {
            System.out.print("Número: ");
            numero = sc.nextInt();
            if (numero != -1) {
                números.add(numero);
            }
        } while (numero != -1);
        // Al terminar, se mostrará la colección por pantalla.
        números.forEach(n -> System.out.print(n + " "));
        System.out.println();
        // A continuación, se mostrarán todos los valores pares.
//        for (int n: números) {
//            if (n % 2 == 0) {
//                System.out.print(n + " ");
//            }
//        }
        números.stream()
                .filter(n -> n % 2 == 0) // filtro los pares
                .forEach(n -> System.out.print(n + " ")); // los imprimo


    }
}
