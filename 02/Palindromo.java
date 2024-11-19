import java.util.HashMap;

public class Palindromo {
    
    public static boolean canFormPalindrome(int number) {
        //  aqui Convierto el número a cadena para facilitar el manejo de dígitos
        String numStr = String.valueOf(number);
        HashMap<Character, Integer> digitCount = new HashMap<>();

        // Cuento la frecuencia de cada dígito
        for (char digit : numStr.toCharArray()) {
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
        }

        // Contar cuántos dígitos tienen una frecuencia impar
        int oddCount = 0;
        for (int count : digitCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // si hay más de un dígito con frecuencia impar no se puede formar el dichoso palindromo
        return oddCount <= 1;
    }

    public static void main(String[] args) {
        System.out.println(canFormPalindrome(5));        // true
        System.out.println(canFormPalindrome(2121));     // true
        System.out.println(canFormPalindrome(1331));     // true
        System.out.println(canFormPalindrome(3357665));  // true
        System.out.println(canFormPalindrome(1294));     // false
        System.out.println(canFormPalindrome(332));     // true
    }
}