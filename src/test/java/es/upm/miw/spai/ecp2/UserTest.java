package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private User usuario;

    @Before
    public void inicializar() {
        usuario = new User(2, "Leire", "Herranz");
    }

    @Test
    public void testUser() {
        assertEquals(2, usuario.getNumber());
        assertEquals("Leire", usuario.getName());
        assertEquals("Herranz", usuario.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Leire Herranz", usuario.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("L.", usuario.initials());
    }
    
    @Test
    public void testNameUser(){
        assertEquals("Leire" + " " + 2, usuario.getNameNumber());
    }

}
