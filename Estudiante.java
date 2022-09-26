
/**
 *  Descripción de un estudiante
 * 
 * @author - Montse 
 *  
 */
public class Estudiante
{
    private String nombre;
    private int nota;

    /**
     * Constructor  
     */
    public Estudiante(String queNombre, int queNota)    {
        nombre = queNombre;
        nota = queNota;

    }

    /**
     * Accesor para el nombre
     */
    public String getNombre() {
        return nombre;

    }

    /**
     * Accesor para la nota
     */
    public int getNota() {
        return nota;

    }

    /**
     * Mostrar datos del estudiante
     */
    public void printEstudiante() {
        System.out.println("Nombre: " + nombre +
            "\nNota: " + nota);

    }

}
