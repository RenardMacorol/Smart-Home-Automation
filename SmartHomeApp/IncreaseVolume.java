public class IncreaseVolume implements Command {
	private MusicPlayer musicPlayer;

	IncreaseVolume(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

	@Override
	public void execute() {
		musicPlayer.increaseVolume();
	}

}
