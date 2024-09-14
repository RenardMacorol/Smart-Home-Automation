public class PrevSong implements Command {
	MusicPlayer musicPlayer;

	PrevSong(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

	@Override
	public void execute() {
		musicPlayer.prevSong();
	}

}
