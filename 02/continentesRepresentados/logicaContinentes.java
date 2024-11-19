package continentesRepresentados;
import java.util.*;
import java.util.stream.Collectors;



public class logicaContinentes {

    //verificar si hay asi sea al menos una persona de cada continente
    public static boolean continentesRepresentados(List<Developer> desarrolladores) {
        Set<String> continentes = new HashSet<>();
        
        for (Developer dev : desarrolladores) {
            continentes.add(dev.getContinent());
        }
        
        List<String> continentesRequeridos = Arrays.asList("Africa", "Americas", "Asia", "Europe", "Oceania");
        
        return continentes.containsAll(continentesRequeridos);
    }

    // contar cuántos desarrolladores de JavaScript vienen de Europa
    public static long contarJavaScriptDesarrolladoresEuropa(List<Developer> desarrolladores) {
        return desarrolladores.stream()
                .filter(dev -> "JavaScript".equals(dev.getLanguage()) && "Europe".equals(dev.getContinent()))
                .count();
    }

    //agregar la propiedad Saludo
    public static List<Map<String, String>> agregarSaludo(List<Developer> desarrolladores) {
        List<Map<String, String>> result = new ArrayList<>();
        
        for (Developer dev : desarrolladores) {
            Map<String, String> devMap = new HashMap<>();
            devMap.put("primerNombre: ", dev.getprimerNombre());
            System.out.println("");
            devMap.put("Saludo", String.format("HOLA %s, QUE ES LO QUE MAS TE GUSTA DE %s?", dev.getprimerNombre(), dev.getLanguage()));
            System.out.println("");
            result.add(devMap);
        }
        
        return result;
    }

    //listar los lenguajes representados sin repetir
    public static List<String> lenguajesRepresentados(List<Developer> desarrolladores) {
        return desarrolladores.stream()
                .map(Developer::getLanguage)
                .distinct()
                .collect(Collectors.toList());
    }

    public  void continentesRun() {
        List<Developer> desarrolladores = Arrays.asList(
            new Developer("Fatima", "A.", "Algeria", "Africa", 25, "JavaScript"),
            new Developer("Agustín", "M.", "Chile", "Americas", 37, "C"),
            new Developer("Jing", "X.", "China", "Asia", 39, "Ruby"),
            new Developer("Laia", "P.", "Andorra", "Europe", 55, "Ruby"),
            new Developer("Oliver", "Q.", "Australia", "Oceania", 65, "PHP")
        );

        // hacer correr el programa o mas bien los tests
        System.out.println(continentesRepresentados(desarrolladores)); // true
        System.out.println(contarJavaScriptDesarrolladoresEuropa(desarrolladores)); // 0
        System.out.println(agregarSaludo(desarrolladores)); // Imprime los Saludos
        System.out.println(lenguajesRepresentados(desarrolladores)); // [JavaScript, C, Ruby, PHP]
    }
}