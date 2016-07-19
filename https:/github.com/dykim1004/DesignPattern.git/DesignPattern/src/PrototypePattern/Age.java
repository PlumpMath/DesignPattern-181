package PrototypePattern;

public class Age {
	private int year;
	private int value;
	
	public Age(int year, int value) {
		super();
		this.year = year;
		this.value = value;
	}
	/**
	 * 
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	
}
