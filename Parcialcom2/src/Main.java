import java.io.BufferedWriter;
import java.io.File;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        File file = new File(“mi_archivo.json”);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        Persona persona = new Persona("Juan", "Gson");

        Gson gson = new Gson();

        gson.toJson(persona, Persona.class, bufferedWriter);








        //Crear las clases Java necesarias para guardar toda la información del archivo. Aquí deben
        //procesar el JSON y convertirlo en clases java. 20 pts

        // Agregar a una lista las personas que solo sean mayor o igual a 18 años. Cuando
        //encuentren una persona menor, lanzar una excepción (creada por ustedes, no las
        //genéricas). Dicha excepción deberá tener la edad de la persona y al mostrar la excepción,
        //mostrar esa edad. 20 pts

        //La lista del punto 1 deberá ser creada en una clase genérica donde deberán aplicar
        //restricción de genericidad para acceder a los métodos pertinentes. 20 pts

        //Desde la lista genérica pasar a un hashset todos los autores. Implementar el equals. 14 pts

        //Desde la lista genérica pasar un hashmap todas las etiquetas. La clave será el id de la
        //persona y el valor un arraylist con las etiquetas. 13 pts

        //Hacer un función que devuelva la cantidad de etiquetas según un parámetro enviado por
        //parámetro. También se envía el id del usuario. Si la clave no existe, lanzar una excepción
        //propia. 13 p






    }
}