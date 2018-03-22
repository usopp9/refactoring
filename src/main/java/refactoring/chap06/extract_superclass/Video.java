package refactoring.chap06.extract_superclass;

public class Video {
	private String videoData;

	public Video(String videoData) {
		super();
		this.videoData = videoData;
	}
	public void play() {
		System.out.printf("%s %s%n",videoData,"play");	
		
	}
	public void loop() {
		System.out.printf("%s %s%n",videoData,"loop");		
		
	}
	public void stop() {
		System.out.printf("%s %s%n",videoData,"stop");		
		
	}

}
