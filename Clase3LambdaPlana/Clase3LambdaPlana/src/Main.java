import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main (String[] args)
    {

/*        EJERCICIO 1
        Implemente un método que reciba como parámetro una lista de strings y devuelva una nueva
        lista con los strings en mayúscula.*/


        String cadenaEnMinusculas = "hola mundo";
        String otraCadenaEnMinusculas = "adios mundo";

        List<String> listaDeStringsMinusculas = new ArrayList<>();

        listaDeStringsMinusculas.add(cadenaEnMinusculas);
        listaDeStringsMinusculas.add(otraCadenaEnMinusculas);

        List<String> listaDeStringsMayusculas = listaDeStringsMinusculas.stream().map(cadena -> cadena.toUpperCase()).collect(Collectors.toList());

        for (String cadenAux : listaDeStringsMayusculas)
        {
            System.out.println(cadenAux);
        }

/*        EJERCICIO 2
        Implementar un método que reciba como parámetro una lista de strings y un entero "n". El
        método debe devolver un String que concatene separando por coma y espacio todas las
        palabras, en la lista, que tengan más de "n" caracteres.*/

        String cadena1 = "hola";
        String cadena2 = "mundo";
        String cadena3 = "adios";

        List<String> listaDeCadenas = new ArrayList<>();

        listaDeCadenas.add(cadena1);
        listaDeCadenas.add(cadena2);
        listaDeCadenas.add(cadena3);

        List<String> cadenaResultante = new ArrayList<>();

        //combino foreach con joining
        listaDeCadenas.stream().forEach(cadena -> {
            if (cadena.length()>4) //debo refactorizar para pasar este int como parametro
            {
                cadenaResultante.add(cadena);
            }
        });


        String cadenaUnida = cadenaResultante.stream().collect(Collectors.joining(", "));

        System.out.println(cadenaUnida);
    }
}
