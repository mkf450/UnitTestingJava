package id.ifundip.coba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import id.ifundip.coba.Appointment;
import id.ifundip.coba.Date;

class AppointmentTest {

	@Test
	public void AppointmentTest() {
		Appointment instance = new Appointment(new Date(2022,02,22), "See dentist");
		
		// Testing
		Date expResult = new Date(2022,02,22);
		System.out.println(expResult);
		Date result = instance.getDate();
		assertEquals(expResult, result);
	}

}
