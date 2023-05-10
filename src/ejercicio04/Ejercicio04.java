package ejercicio04;

import java.util.function.Predicate;

public class Ejercicio04 {
    public static void main(String[] args) {
        // 4. Con la interfaz Predicate:
        //4.1. Define un predicado para comprobar si un entero es múltiplo de 5.
        Predicate<Integer> predicate1 = n -> n % 5 == 0;
        System.out.println(predicate1.test(25));
        //4.2. Define un predicado para comprobar si un String no termina en “s”.
        //4.3. Define un predicado para comprobar si un entero es par y múltiplo de 3.
        //4.4. Define un predicado para comprobar si un carácter es una letra y está en mayúscula.
        //4.5. Define un predicado para comprobar si un entero es impar y múltiplo de 7;
        //4.6. Define un predicado para comprobar si un entero es impar o múltiplo de 7.
    }
}
