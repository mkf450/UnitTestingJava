package id.ifundip.suhu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SuhuTest {

	@Test
	public void suhuTest() {
		Suhu semarang = new Suhu();
		assertEquals(27, semarang.jumlah(13, 14));
		assertEquals(15, semarang.selisih(18, 33));
	}
}
