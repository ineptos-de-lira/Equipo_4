public class Calculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultado = calc.sumar(10, 2);
        System.out.println("Resultado: " + resultado);
    }

    public int sumar(int a, int b) {
        return a + b;
    }

}
