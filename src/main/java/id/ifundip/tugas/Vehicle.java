/**
 * 
 */
package id.ifundip.tugas;

/**
 * @author Mualana Zia Ulhaq - 24060119140084
 * Kelas Vehicle
 * 
 */
public class Vehicle {
	private int fuel_capacity;
	private int fuel_now;
	private static int id=0;
	
	/**
	 * Method Constructor Vehicle with
	 * @param fuel_capacity, fuel_now
	 * 
	 */
	public Vehicle(int fuel_capacity, int fuel_now) {
		this.fuel_capacity = fuel_capacity;
		this.fuel_now = fuel_now;
		Vehicle.id++;
	}

	/**
	 * Getter fuel_capacity
	 * @return the fuel_capacity
	 */
	public int getfuel_capacity() {
		return fuel_capacity;
	}
	
	/**
	 * Setter fuel_capacity
	 * @param set the fuel_now a new value
	 */
	public void setfuel_capacity(int fuel_now) {
		this.fuel_capacity = fuel_now;
	}

	/**
	 * Getter fuel_now
	 * @return the fuel_now
	 */
	public int getfuel_now() {
		return fuel_now;
	}

	/**
	 * Setter fuel_now
	 * @param set the fuel_now a new value
	 */
	public void setfuel_now(int fuel_now) {
		if (this.fuel_now == this.fuel_capacity) {
			max_capacity();
		} this.fuel_now = fuel_now;
	}
	
	public String max_capacity() {
		return "The fuel is on max capacity";
	}
	
	/**
	 * Check isAvailable
	 * @return boolean
	 */
	public boolean isAvailable() {
        return false;
    }
	
	/**
	 * Check isFull
	 * @return boolean
	 */
	public boolean isFullCapacity() {
        return false;
    }
	
	/**
	 * Check getVehicleId
	 * @return int
	 */
	public static int getVehicleId() {
        return Vehicle.id;
    }	
}
