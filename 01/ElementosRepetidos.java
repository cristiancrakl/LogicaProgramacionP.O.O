import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementosRepetidos {

    public static List<Object> elementosRepetidosPares(List<Object> lista, int n) {
        // Crear un mapa para contar las ocurrencias de cada elemento
        Map<Object, Integer> contador = new HashMap<>();

        // Contar las ocurrencias de cada elemento
        for (Object elemento : lista) {
            contador.put(elemento, contador.getOrDefault(elemento, 0) + 1);
        }

        // Filtrar los elementos que aparecen n veces y son pares
        List<Object> resultado = new ArrayList<>();
        for (Map.Entry<Object, Integer> entry : contador.entrySet()) {
            Object elemento = entry.getKey();
            int cantidad = entry.getValue();

            if (cantidad == n) {
                // Verificar si el elemento es un número par o una cadena
                if (elemento instanceof Integer) {
                    if ((Integer) elemento % 2 == 0) {
                        resultado.add(elemento);
                    }
                } else if (elemento instanceof String) {
                    resultado.add(elemento);
                }
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        
        List<Object> lista1 = List.of("A", "B", "A", "C", "C", "C", "C");
        List<Object> lista2 = List.of(1, 2, 3, 1, 2);

        System.out.println(elementosRepetidosPares(lista1, 2)); // -> ["A"]
        System.out.println(elementosRepetidosPares(lista2, 2)); // -> [1, 2]
    }
}