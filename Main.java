public class Main {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Sebastian", 18);
        e1.mostrar();

        Calculadora calc = new Calculadora();

        System.out.println("Suma 1: " + calc.sumar(5, 3));
        System.out.println("Suma 2: " + calc.sumar(2.5, 3.5));
        System.out.println("Suma 3: " + calc.sumar(1, 2, 3));

        calc.mostrarHistorial();

        System.out.println("Total operaciones: " + Calculadora.getTotalOperaciones());
    }
}