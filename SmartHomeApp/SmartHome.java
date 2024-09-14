import java.util.Scanner;

public class SmartHome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;

		Light light = new Light();
		MusicPlayer musicPlayer = new MusicPlayer();

		Command lightOffCommand = new TurnOff(light);
		Command lightOnCommand = new TurnOn(light);
		Command musicPlayerOn = new TurnOn(musicPlayer);
		Command musicPlayerOff = new TurnOff(musicPlayer);
		Command prevSongCommand = new PrevSong(musicPlayer);
		Command nextSongCommand = new NextSong(musicPlayer);

		CentralHub centralHub = new CentralHub();

		centralHub.setCommand(lightOnCommand);
		centralHub.clickButton();

		centralHub.setCommand(lightOffCommand);
		centralHub.clickButton();

		centralHub.setCommand(musicPlayerOn);
		centralHub.clickButton();
		centralHub.setCommand(prevSongCommand);
		centralHub.clickButton();
		centralHub.setCommand(nextSongCommand);
		centralHub.clickButton();
		centralHub.setCommand(musicPlayerOff);
		centralHub.clickButton();
	}

}
