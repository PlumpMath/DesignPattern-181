package SingletonPattern;

public class SystemSpeaker {
	
	static private SystemSpeaker instance;
	private int volume;
	
	private SystemSpeaker(){
		volume = 5;
	}
	
	public static SystemSpeaker getInstance(){
		if(instance == null){
			instance = new SystemSpeaker();
			System.out.println("신규 생성");
		}else {
			System.out.println("이미 생성");
		}
		return instance;
	}

	/**
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
