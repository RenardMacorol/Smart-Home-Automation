public class DecreaseVolume implements Command {

	private MusicPlayer musicPlayer;

	DecreaseVolume(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

	@Override
	public void execute() {
		musicPlayer.decreaseVolume();
	}

}
