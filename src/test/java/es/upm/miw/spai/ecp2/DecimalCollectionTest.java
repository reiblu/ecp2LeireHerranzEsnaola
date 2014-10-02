package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

    private DecimalCollection lista;

    @Before
    public void inicializar() {
        lista = new DecimalCollection();
        lista.add(1);
        lista.add(1.5);
        lista.add(2.5);
        lista.add(4.5);
    }

    @Test
    public void testSize() {
        assertEquals(4, lista.size());
    }

    @Test
    public void testSum() {
        assertEquals(9.5, lista.sum(), 10e-2);
    }

    @Test
    public void testHigher() {
        assertEquals(4.5, lista.higher(), 10e-2);
    }
    @Test
    public void testMenor(){
    	assertEquals(1,lista.menor());
    }

}
