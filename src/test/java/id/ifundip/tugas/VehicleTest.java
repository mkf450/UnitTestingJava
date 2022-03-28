/**
 * 
 */
package id.ifundip.tugas;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.when;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;

/**
 * @author Muhammad Keenan - 24060119130052
 * Kelas VehicleTest
 * 
 */

@ExtendWith(MockitoExtension.class)  
class VehicleTest {
	@Mock
	Vehicle vehicleMock;
	
	@Test
	public void testVehicle() {
		assertNotNull(vehicleMock);
		
		GasStation Pertamini  = new GasStation(vehicleMock, "Gasoline");             
		boolean check = Pertamini.isGasoline();                
		assertTrue(check);
		
		assertEquals(Pertamini.BuyFuel(20), 200000);
	}
}
