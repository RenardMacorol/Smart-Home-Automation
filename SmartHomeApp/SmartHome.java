public class SmartHome {

	public static void main(String[] args) {
		// Devices Connected Should Connected in centalHub
		Light light = new Light();
		MusicPlayer musicPlayer = new MusicPlayer();
		Thermostat thermostat = new Thermostat();
		ElectricFan electricFan = new ElectricFan();

		// Light Commands
		Command lightOffCommand = new TurnOff(light);
		Command lightOnCommand = new TurnOn(light);

		// Music Player Commands
		Command musicPlayerOnCommand = new TurnOn(musicPlayer);
		Command musicPlayerOffCommand = new TurnOff(musicPlayer);
		Command prevSongCommand = new PrevSong(musicPlayer);
		Command nextSongCommand = new NextSong(musicPlayer);
		Command increaseVolumeCommand = new IncreaseVolume(musicPlayer);
		Command decreaseVolumeCommand = new DecreaseVolume(musicPlayer);

		// Thermostat Commands
		Command themostatOnCommand = new TurnOn(thermostat);
		Command themostatOffCommand = new TurnOff(thermostat);
		Command increaseTemperatureCommand = new IncreaseTemperature(thermostat);
		Command decreaseTemperatureCommand = new DecreaseTemperature(thermostat);

		// Electric Fan Commans
		Command electricFanOnCommand = new TurnOn(electricFan);
		Command electricFanOffCommand = new TurnOff(electricFan);
		Command fanDownCommand = new FanDown(electricFan);
		Command fanUpCommand = new FanUp(electricFan);

		// CentalHub Instance
		CentralHub centralHub = new CentralHub();

		// Light functionality Test
		centralHub.setCommand(lightOnCommand);
		centralHub.clickButton();
		centralHub.setCommand(lightOffCommand);
		centralHub.clickButton();

		// Music Player functionality Test
		centralHub.setCommand(musicPlayerOnCommand);
		centralHub.clickButton();
		centralHub.setCommand(increaseVolumeCommand);
		centralHub.clickButton();
		centralHub.setCommand(decreaseVolumeCommand);
		centralHub.clickButton();
		centralHub.setCommand(prevSongCommand);
		centralHub.clickButton();
		centralHub.setCommand(nextSongCommand);
		centralHub.clickButton();
		centralHub.setCommand(musicPlayerOffCommand);
		centralHub.clickButton();

		// Thermostat functionality Test
		centralHub.setCommand(themostatOnCommand);
		centralHub.clickButton();
		centralHub.setCommand(increaseTemperatureCommand);
		centralHub.clickButton();
		centralHub.setCommand(decreaseTemperatureCommand);
		centralHub.clickButton();
		centralHub.setCommand(themostatOffCommand);
		centralHub.clickButton();

		// Electic Fan functionality Test
		centralHub.setCommand(electricFanOnCommand);
		centralHub.clickButton();
		centralHub.setCommand(fanUpCommand);
		centralHub.clickButton();
		centralHub.setCommand(fanDownCommand);
		centralHub.clickButton();
		centralHub.setCommand(electricFanOffCommand);
		centralHub.clickButton();
	}

}
