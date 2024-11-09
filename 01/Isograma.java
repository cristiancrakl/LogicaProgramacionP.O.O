import java.text.Normalizer;
import java.util.HashSet;
import java.util.Set;

public class Isograma {

    public static boolean isIsograma(String input) {
        // Limpiar el input
        if (input == null || input.trim().isEmpty()) {
            return true; // Un string vacío es un isograma
        }

        // Convertir a minúsculas y eliminar acentos
        String cleanedInput = normalizeString(input.toLowerCase());

        // Verificar si hay más de una palabra
        if (cleanedInput.split("\\s+").length > 1) {
            return false; // Más de una palabra
        }

        // Usar un Set para verificar letras repetidas
        Set<Character> charSet = new HashSet<>();
        for (char c : cleanedInput.toCharArray()) {
            if (charSet.contains(c)) {
                return false; // Letra repetida
            }
            charSet.add(c);
        }

        return true; // Es un isograma
    }

    private static String normalizeString(String input) {
        // Normaliza el string para eliminar acentos
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        return normalized.replaceAll("[^\\p{ASCII}]", ""); // Eliminar caracteres no ASCII
    }

    public static void main(String[] args) {
        System.out.println(isIsograma("Murciélago")); // true
        System.out.println(isIsograma("reto")); // true
        System.out.println(isIsograma("Casa")); // false
        System.out.println(isIsograma("PeRrO")); // false
        System.out.println(isIsograma("GaTo")); // true
        System.out.println(isIsograma("")); // true
        System.out.println(isIsograma("Hola Mundo")); // false
    }
}