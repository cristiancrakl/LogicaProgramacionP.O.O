import java.text.Normalizer;

public class letrasPorNumeros {
    public static void main(String[] args) {
        String entrada = "juanito alimaña";
        String resultado = convertirAlfabetoIndex(entrada);
        System.out.println(resultado); // salida: "10 21 1 14 9 20 15 1 12 9 13 1 14 1"
    }

    public static String convertirAlfabetoIndex(String entrada) {
        // elimino espacios, acentos, etc.
        String entradaLimpia = limpiarCadena(entrada);

        StringBuilder resultado = new StringBuilder();

        for (char c : entradaLimpia.toCharArray()) {
            if (Character.isLetter(c)) {
                // convierto las letras a minúsculas para obtener el número en el alfabeto
                int indice = Character.toLowerCase(c) - 'a' + 1;
                resultado.append(indice).append(" ");
            }
        }

        // Elimino el espacio final y retorno el resultado
        return resultado.toString().trim();
    }

    private static String limpiarCadena(String entrada) {
        // Normalizo la cadena para eliminar acentos
        String normalizada = Normalizer.normalize(entrada, Normalizer.Form.NFD);
        // Elimino caracteres que no sean del alfabeto y espacios
        String cadenaLimpia = normalizada.replaceAll("[^a-zA-Z]", "");
        return cadenaLimpia;
    }
}