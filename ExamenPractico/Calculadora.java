public class Calculadora {
    
  public int dividir(int a, int b) {
      if (b == 0) {
          throw new IllegalArgumentException("No se puede dividir entre cero");
    }
      return a / b;
  }




}
