public class Calculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultado = calc.sumar(10, 2);
        System.out.println("Resultado: " + resultado);
    }

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
      return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return a / b;
    }   
}
    