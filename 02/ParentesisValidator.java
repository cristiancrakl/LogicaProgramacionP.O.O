public class ParentesisValidator {

    public static boolean esOrdenValido(String s) {
        int contador = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                contador++; // incrementa el contador por cada '('
            } else if (c == ')') {
                contador--; // decrementa el contador por cada ')'
            }

            // si el contador es negativo entonces falta un parentesis
            if (contador < 0) {
                return false;
            }
        }

        //el contador debe ser 0 para que los paréntesis estén balanceados
        return contador == 0;
    }

    public static void main(String[] args) {
        System.out.println(esOrdenValido("()"));              // true
        System.out.println(esOrdenValido(")(()))"));          // false
        System.out.println(esOrdenValido("("));               // false
        System.out.println(esOrdenValido("(())((()())())"));  // true
    }
}