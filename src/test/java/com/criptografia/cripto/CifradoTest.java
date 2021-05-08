package com.criptografia.cripto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CifradoTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void cesarCifradoA()
    {
        assertEquals("B",CifradoCesar.cifradoCesar("A", 1));
    }
    
    @Test
    public void cesarCifradoA_fallo()
    {
        assertNotEquals("C",CifradoCesar.cifradoCesar("A", 1));
    }

    @Test
    public void cesarCifradoCadena()
    {
        assertEquals("BC",CifradoCesar.cifradoCesar("AB", 1));
    }
}
