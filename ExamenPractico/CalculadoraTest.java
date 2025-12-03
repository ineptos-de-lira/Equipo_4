import static org.junit.jupiter.api.Assertions.assertEquals;
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
}
