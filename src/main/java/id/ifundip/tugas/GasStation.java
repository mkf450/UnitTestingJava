/**
 * 
 */
package id.ifundip.tugas;

/**
 * @author Rashif Dhafin Fairiza - 24060119140079
 * Kelas GasStation
 * 
 */
public class GasStation {
	private Vehicle vehicle;
	private String fuel_type;
	private int price;
	
	/**
	 * Method Constructor GasStation with
	 * @param fuel_type, price
	 * 
	 */
	public GasStation(Vehicle vehicle, String fuel_type) {
		this.vehicle = vehicle;  
		this.fuel_type = fuel_type;
	}
	
	/**
	 * Check fuel_type
	 * @return boolean
	 */
	public boolean isGasoline() {
		if(this.fuel_type=="Gasoline") {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Getter and Setter price
	 * @return the price
	 */
	public int BuyFuel(int amount) {
		if(isGasoline()) {
			this.price = amount * 10000;
		} else {
			this.price = amount * 13500;
		} return price;
	}
	
	@Override
    public String toString() {
        return "Kendaraan ini mempunyai id: " + String.valueOf(Vehicle.getVehicleId());
    }
	
}
