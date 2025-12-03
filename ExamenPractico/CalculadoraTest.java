package equipo4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculadoraDividirTest {

      @Test
      void dividirNumerosValidos() {
          Calculadora calc = new Calculadora();
          int resultado = calc.dividir(10, 2);
          assertEquals(5, resultado);
    }

         @Test
          void dividirEntreCeroLanzaExcepcion() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class,
                () -> calc.dividir(10, 0));
    }
  }
