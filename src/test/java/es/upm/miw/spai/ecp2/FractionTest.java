package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    private Fraction fraccion;

    @Before
    public void inicializar() {
        fraccion = new Fraction(6, 3);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(6, fraccion.getNumerator());
        assertEquals(3, fraccion.getDenominator());
    }

    @Test
    public void testFraction() {
        fraccion = new Fraction();
        assertEquals(1, fraccion.getNumerator());
        assertEquals(1, fraccion.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(2, fraccion.decimal(), 10e-1);
    }
    
    @Test
    public void testPropia() {
        assertTrue(fraccion.propia());
    }

}
