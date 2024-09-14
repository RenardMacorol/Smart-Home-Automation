public class NextSong implements Command {
	private MusicPlayer musicPlayer;

	NextSong(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

	@Override
	public void execute() {
		musicPlayer.nextSong();
	}

}
