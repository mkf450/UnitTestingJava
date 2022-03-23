package id.ifundip.Dagang;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SayuranTest {

	@Test
	void test() {
		Sayuran bayam = new Sayuran("Bayam Merah", /*75, */3000);
		Sayuran kangkung = new Sayuran("Kangkung Air", /*25, */2500);
		Sayuran brokoli = new Sayuran("Brokoli Ungu", /*25, */2000);
		
		assertNotNull(bayam);
		assertNotNull(kangkung);
		assertNotNull(brokoli);
		
		assertEquals(bayam.beliSayur(2), 6000);
		assertEquals(kangkung.beliSayur(3), 7500);
		assertEquals(brokoli.beliSayur(4), 8000);
		
		assertEquals(bayam.beliSayur(10), kangkung.beliSayur(12));
		assertEquals(bayam.beliSayur(2), brokoli.beliSayur(3));
		assertEquals(kangkung.beliSayur(4), brokoli.beliSayur(5));
		
	}

}
