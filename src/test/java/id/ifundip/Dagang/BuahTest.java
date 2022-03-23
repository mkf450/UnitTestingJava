package id.ifundip.Dagang;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuahTest {

	@Test
	public void test() {
		Buah jeruk = new Buah("Jeruk Bali", /*100, */5000);
		Buah apel = new Buah("Apel Fuji", /*50, */4000);
		Buah pisang = new Buah("Pisang Ambon", /*50, */3000);
		
		assertNotNull(jeruk);
		assertNotNull(apel);
		assertNotNull(pisang);
		
		assertEquals(jeruk.beliBuah(1), 5000);
		assertEquals(apel.beliBuah(2), 8000);
		assertEquals(pisang.beliBuah(3), 9000);
		
		assertEquals(jeruk.beliBuah(4), apel.beliBuah(5));
		assertEquals(jeruk.beliBuah(3), pisang.beliBuah(5));
		assertEquals(apel.beliBuah(3), pisang.beliBuah(4));
		
	}

}
