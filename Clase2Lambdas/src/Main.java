import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        String cadenaEnMinusculas = "hola mundo";
        String otraCadenaEnMinusculas = "adios mundo";

        List<String> cadenaDeStrings = new ArrayList<>();

        cadenaDeStrings.add(cadenaEnMinusculas);
        cadenaDeStrings.add(otraCadenaEnMinusculas);

        //expresion lambda simple
        StringCaps lambdaMayusculas = (String a) -> a.toUpperCase();

        String cadenaEnMayusculas = lambdaMayusculas.toCaps(cadenaEnMinusculas);

        //expresion lambda con listas
        StringCapsList lambdaMayusculasLista = (List<String> laLista) -> {
            List<String> listaEnMayusculas = new ArrayList<>();
            for (String aux : laLista)
            {
                listaEnMayusculas.add(aux.toUpperCase());
            }
            return listaEnMayusculas;
        };

        List<String> cadenaMayusculas = lambdaMayusculasLista.toCapsList(cadenaDeStrings);

        System.out.println(cadenaEnMayusculas);

        for (String auxi : cadenaMayusculas)
        {
            System.out.println(auxi);
        }

    }

    //primero definir una interfaz funcional
    //normalmente deberia ser un archivo aparte
    //pero las interfaces funcionales puedo declararlas adentro de la misma clase (aunque afuera de main)
    @FunctionalInterface
    public interface StringCaps
    {
        String toCaps(String a);
    }

    //defino otra interface funcional que reciba listas y devuelva listas
    @FunctionalInterface
    public interface StringCapsList
    {
        List<String> toCapsList(List<String> stringList);
    }
}