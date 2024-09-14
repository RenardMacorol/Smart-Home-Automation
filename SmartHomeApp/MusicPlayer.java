public class MusicPlayer implements Device {

	@Override
	public void turnOn() {
		System.out.println("The Music Player is On");
	}

	@Override
	public void turnOff() {
		System.out.println("The Music Player is Off");
	}

	public void nextSong() {
		System.out.println("Next Song");
	}

	public void prevSong() {
		System.out.println("Previous Song");
	}

	public void increaseVolume() {
		System.out.println("Volume Increase ");
	}

	public void decreaseVolume() {
		System.out.println("Volume Decrease");
	}

}
