public class Calculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resSuma = calc.sumar(10, 2);
        int resResta = calc.sumar(10, 2);
        int resMulti = calc.sumar(10, 2);
        int resDiv = calc.sumar(10, 2);
        System.out.println("Suma: " + resSuma);
        System.out.println("Resta: " + resResta);
        System.out.println("Multiplicacion: " + resMulti);
        System.out.println("Division: " + resDiv);
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
    