import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    void sumarDosPositivos() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(3, 4);
        assertEquals(7, resultado);
    }

    @Test
    void sumarConNumeroNegativo() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(-2, 5);
        assertEquals(3, resultado);
    }

    @Test
    void restarPositivos() {
        Calculadora calc = new Calculadora();
        int resultado = calc.restar(10, 4);
        assertEquals(6, resultado);
    }

    @Test
    void restarResultadoNegativo() {
        Calculadora calc = new Calculadora();
        int resultado = calc.restar(3, 5);
        assertEquals(-2, resultado);
    }

    @Test
    void multiplicarPositivos() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(3, 5);
        assertEquals(15, resultado);
    }

    @Test
    void multiplicarPorCero() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(9, 0);
        assertEquals(0, resultado);
    }

    @Test
    void dividirNumerosValidos() {
        Calculadora calc = new Calculadora();
        int resultado = calc.dividir(10, 2);
        assertEquals(5, resultado);
    }

    @Test
    void dividirEntreCeroLanzaExcepcion() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
    }
}
