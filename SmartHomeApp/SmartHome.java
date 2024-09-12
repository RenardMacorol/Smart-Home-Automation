public class SmartHome {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Light light = new Light();

		Command lightOff = new TurnOff(light);
		Command lightOn = new TurnOff(light);
		CentralHub centralHub = new CentralHub();

		centralHub.setCommand(lightOff);
		centralHub.pressButon();

	}

}
