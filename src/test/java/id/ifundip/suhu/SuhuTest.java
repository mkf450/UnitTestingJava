package id.ifundip.suhu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SuhuTest {

	@Test
	public void suhuTest() {
		Suhu suhu = new Suhu();
		assertEquals(5, suhu.penjumlahan(2, 3));
	}

}
