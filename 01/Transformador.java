import java.util.ArrayList;
import java.util.List;

class Persona {
    private String id;
    private String nombre;
    private int edad;

    public Persona(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "{" + "id='" + id + '\'' + ", nombre='" + nombre + '\'' + ", edad=" + edad + '}';
    }
}

public class Transformador {
    public static List<Persona> transformarDatos(Data data) {
        List<Persona> output = new ArrayList<>();
        for (int i = 0; i < data.nombres.length; i++) {
            String id = String.valueOf(i + 1); // Generar ID como cadena
            String nombre = data.nombres[i];
            int edad = data.edades[i];
            output.add(new Persona(id, nombre, edad));
        }
        return output;
    }

    public static void main(String[] args) {
        Data data = new Data(new String[] { "Bruno", "Andrea" }, new int[] { 20, 19 });
        List<Persona> resultado = transformarDatos(data);
        System.out.println(resultado);
    }
}

class Data {
    String[] nombres;
    int[] edades;

    public Data(String[] nombres, int[] edades) {
        this.nombres = nombres;
        this.edades = edades;
    }
}