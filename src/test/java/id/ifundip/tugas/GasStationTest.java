/**
 * 
 */
package id.ifundip.tugas;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.when;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.*;

/**
 * @author Muhammad Keenan - 24060119130052
 * Kelas GasStationTest
 * 
 */

@ExtendWith(MockitoExtension.class)  
class GasStationTest {
	@Mock
	Vehicle vehicleMock;
	
	@Test
	public void testGasStation() {
		assertNotNull(vehicleMock);
		        
		Vehicle ferrari = new Vehicle(1000, 500);
        GasStation Pertamini  = new GasStation(ferrari, "Gasoline");             		
		ferrari.setfuel_capacity(1000);
		assertEquals(ferrari.getfuel_capacity(), 1000);
		
		ferrari.setfuel_now(1000);
		assertEquals(ferrari.getfuel_now(), 1000);
	}

}
