import java.util.ArrayList;
import java.util.List;

public class MoverCeros {

    public static Object[] moverCeros(Object[] array) {
        List<Object> result = new ArrayList<>();
        
        // Agregar todos los elementos que no son cero
        for (Object item : array) {
            if (!item.equals(0)) {
                result.add(item);
            }
        }
        
        // Agregar ceros al final
        for (Object item : array) {
            if (item.equals(0)) {
                result.add(item);
            }
        }
        
        return result.toArray();
    }

    public static void main(String[] args) {
        Object[] resultado = moverCeros(new Object[]{false, 1, 0, 1, 2, 0, 1, 3, "a"});
        
        // Imprimir el resultado
        for (Object obj : resultado) {
            System.out.print(obj + " ");
        }
    }
}