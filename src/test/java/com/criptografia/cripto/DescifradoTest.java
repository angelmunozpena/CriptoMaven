package com.criptografia.cripto;

import static org.junit.Assert.*;

import org.junit.Test;

public class DescifradoTest {

	@Test
	public void cesarDescifradoB() {
		assertEquals("A", CifradoCesar.descifradoCesar("B", 1));
	}

	@Test
	public void cesarDescifradoB_fallo() {
		assertNotEquals("A", CifradoCesar.descifradoCesar("C", 1));
	}
}
