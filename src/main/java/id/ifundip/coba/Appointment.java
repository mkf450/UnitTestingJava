/**
 * 
 */
package id.ifundip.coba;

/**
 * @author Muhammad Keenan Fathurrahman - 24060119130052
 * Appointment merupakan kelas ...
 *
 */
public class Appointment {
	private static int antrian = 0;
	Date date;
	String description;
    
	/**
	 * Method Constructor with
	 * @param date, description
	 */
	public Appointment(Date date, String description) {
    	super();
		this.date = date;
		this.description = description;
	}

	/**
	 * Method Getter untuk date
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	
}

