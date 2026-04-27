public class Estudiante {

    private String nombre;
    private int promedio;

    public Estudiante(String nombre, int promedio){
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getNombre(){
        return nombre;
    }

    public int getPromedio(){
        return promedio;
    }

    public void setPromedio(int promedio){
        this.promedio = promedio;
    }

    public void mostrar(){
        System.out.println(nombre + " - " + promedio);
    }
}