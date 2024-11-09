public class StringTerminaCon {
    public static boolean func(String str1, String str2) {
        return str1.endsWith(str2);
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        System.out.println(func("abc", "bc")); // retorna verdadero
        System.out.println(func("abc", "d"));  // retorna falso
    }
}