public class MusicPlayer implements Device {

	@Override
	public void turnOn() {
		System.out.println("The Music Player is On");
		System.out.println();
	}

	@Override
	public void turnOff() {
		System.out.println("The Music Player is Off");
		System.out.println();
	}

	public void nextSong() {
		System.out.println("Next Song");
		System.out.println();
	}

	public void prevSong() {
		System.out.println("Previous Song");
		System.out.println();
	}

	public void increaseVolume() {
		System.out.println("Volume Increase ");
		System.out.println();
	}

	public void decreaseVolume() {
		System.out.println("Volume Decrease");
		System.out.println();
	}

}
