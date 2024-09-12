import java.util.Scanner;

public class SmartHome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		Light light = new Light();
		CentralHub centralHub = new CentralHub();

		Command lightOffCommand = new TurnOff(light);
		Command lightOnCommand = new TurnOn(light);

		System.out.println("Welcome to the Central Hub");

		System.out.println("What you like to do?");
		System.out.println("[1]Light Setting");
		System.out.println("[2]Music Player");
		System.out.println("[3]Themostat");

		switch (input) {
			case 1:
				centralHub.setCommand(lightOnCommand);
				centralHub.clickButton();

				break;
			case 2:
				centralHub.setCommand(lightOffCommand);
				centralHub.clickButton();

				break;
			case 3:

				break;

			default:
				System.out.println("Invalid Input");
				break;
		}
	}
}
