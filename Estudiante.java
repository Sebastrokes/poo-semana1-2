public class Estudiante {
    private String nombre;
    private int nota;

    public Estudiante(String nombre, int nota){
        this.nombre = nombre;
        this.nota = nota;
    }

    public void mostrar(){
        System.out.println(nombre + " - " + nota);
    }
}