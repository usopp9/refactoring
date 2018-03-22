package refactoring.chap06.extract_superclass;

public class Music{
	private String musicData;

	public Music(String musicData) {
		super();
		this.musicData = musicData;
	}

	public String getMusicData() {
		return musicData;
	}

	public void setMusicData(String musicData) {
		this.musicData = musicData;
	}

	public void play() {
		System.out.printf("%s %s%n",musicData,"play");		
		
	}

	public void loop() {
		System.out.printf("%s %s%n",musicData,"loop");		
		
	}

	public void stop() {
		System.out.printf("%s %s%n",musicData,"stop");		
		
	}
	
	
}
