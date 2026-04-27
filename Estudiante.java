public class Estudiante {

    private String nombre;
    private int notaFinal;

    public Estudiante(String nombre, int notaFinal){
        this.nombre = nombre;
        this.notaFinal = notaFinal;
    }

    public String getNombre(){
        return nombre;
    }

    public int getNotaFinal(){
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal){
        this.notaFinal = notaFinal;
    }

    public void mostrar(){
        System.out.println(nombre + " - " + notaFinal);
    }
}