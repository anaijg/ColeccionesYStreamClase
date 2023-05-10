package ejercicio02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ejercicio02 {
    public static void main(String[] args) {
        // Para practicar con lambda:
        //2.1. Crea una lista de Strings y utiliza una expresión lambda para imprimir cada elemento de la lista.
        String reservadas = "abstract,continue,for,new,switch,assert,default,goto,package,synchronized,boolean,do,if,private,this,break,double,implements,protected,throw,byte,else,import,public,throws,case,enum,instanceof,return,transient,catch,extends,int,short,try,char,final,interface,static,void,class,finally,long,strictfp,volatile,const,float,native,super,while";
        String[] palabrasReservadas = reservadas.split(",");
        //System.out.println(Arrays.toString(palabrasReservadas));
        // hay dos formas de pasar este array a una lista
        //List<String> listaPalabras = Arrays.stream(palabrasReservadas).toList();
        List<String> lista = Arrays.asList(palabrasReservadas);
        lista.forEach(n -> System.out.print(n + " "));
        //2.2. Crea una lista de Strings y utiliza una expresión lambda para contar cuántas palabras tienen más de 5 caracteres.
        long filtro = lista.stream()
                .filter(palabra -> palabra.length() > 5)
                .count();
        System.out.println("\n" + filtro);
        //2.3. Crea una lista de números enteros y utiliza una expresión lambda para encontrar el número mayor.
        List<Integer> enteros = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            enteros.add((int) (Math.random() * 200 - 100));
        }
        // para sacar el máximo de una lista, tenemos dos opciones
        // 1) ordenar de mayor a menor y luego coger el primer número
        enteros.sort((n1, n2) -> n2 - n1);
        System.out.println(enteros);
        System.out.println("Máximo: " + enteros.get(0));
        // 2) método max -> ¡¡¡NEW!!! EL PROBLEMA ES QUE max DEVUELVE UN OPTIONAL ¿cómo se utiliza? 1) lo guardamos y 2) utilizamos un if con isPresent() y luego get()
        Optional<Integer> máximo = enteros.stream().max((n1, n2) -> n1 - n2);
        // para sacar el número es así:
        if (máximo.isPresent()) {
            System.out.println("Máximo: " + máximo.get());
        }
        //2.4. Crea una lista de números enteros y utiliza una expresión lambda para encontrar la suma de los números pares.
        //2.5. Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una expresión lambda para encontrar la persona más joven.
    }
}
