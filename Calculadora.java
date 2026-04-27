public class Calculadora {

    private String historial;
    private static int totalOperaciones = 0;

    public Calculadora() {
        this.historial = "";
    }

    public int sumar(int a, int b) {
        int resultado = a + b;
        totalOperaciones++;
        historial += a + "+" + b + "=" + resultado + "\n";
        return resultado;
    }

    public double sumar(double a, double b) {
        double resultado = a + b;
        totalOperaciones++;
        historial += a + "+" + b + "=" + resultado + "\n";
        return resultado;
    }

    public int sumar(int a, int b, int c) {
        int resultado = a + b + c;
        totalOperaciones++;
        historial += a + "+" + b + "+" + c + "=" + resultado + "\n";
        return resultado;
    }

    public static int getTotalOperaciones() {
        return totalOperaciones;
    }

    public void mostrarHistorial() {
        System.out.println(historial);
    }
}
