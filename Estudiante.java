public class Estudiante {

    private String nombre;
    private int calificacionFinal;

    public Estudiante(String nombre, int calificacionFinal){
        this.nombre = nombre;
        this.calificacionFinal = calificacionFinal;
    }

    public String getNombre(){
        return nombre;
    }

    public int getCalificacionFinal(){
        return calificacionFinal;
    }

    public void setCalificacionFinal(int calificacionFinal){
        this.calificacionFinal = calificacionFinal;
    }

    public void mostrar(){
        System.out.println(nombre + " - " + calificacionFinal);
    }
}