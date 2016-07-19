package BuilderPattern.b02;

public class Computer {
	private String cpu;
	private String ram;
	private String storage;
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + "]";
	}

	public Computer(String cpu, String ram, String storage) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.storage = storage;
	}
	
	/**
	 * @return the cpu
	 */
	public String getCpu() {
		return cpu;
	}
	/**
	 * @param cpu the cpu to set
	 */
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	/**
	 * @return the ram
	 */
	public String getRam() {
		return ram;
	}
	/**
	 * @param ram the ram to set
	 */
	public void setRam(String ram) {
		this.ram = ram;
	}
	/**
	 * @return the storage
	 */
	public String getStorage() {
		return storage;
	}
	/**
	 * @param storage the storage to set
	 */
	public void setStorage(String storage) {
		this.storage = storage;
	}
}
