package refactoring.chap06.extract_superclass;

public class Player {		
		private Music music = new Music("좋니");
		private Video video = new Video("효리네 민박");
		private boolean isMusic;
		
		public void setCurrentMedia(boolean isMusic) {
			this.isMusic = isMusic;
		}
		
	/*private Media media;
	public void setMedia(Media media) {
		this.media = media;
	}*/
		public void play() {
			if(isMusic) {
				playMusic();
			}else {
				playVideo();
			}
		}
	/*public void play() {
		media.play();
	}*/
	public void loop() {
			if(isMusic) {
				loopMusic();
			}else {
				loopVideo();
			}
		}
		
	/*public void loop() {
		media.loop();
	}*/
		public void stop() {
			if(isMusic) {
				stopMusic();
			}else {
				stopVideo();
			}
		}
	/*public void stop() {
		media.stop();
	}*/
		private void playVideo() {
			
			video.play();	
		}

		private void playMusic() {
			music.play();	
		}

		

		private void loopVideo() {
			video.loop();	
				
		}

		private void loopMusic() {
			
			music.loop();	
		}

		

		private void stopVideo() {
			video.stop();	
				
		}

		private void stopMusic() {
			music.stop();	
				
		}
	}
