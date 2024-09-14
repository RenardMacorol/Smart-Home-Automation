public class Thermostat implements Device {

	@Override
	public void turnOn() {
		System.out.println("Thermostat is On");
		System.out.println();
	}

	@Override
	public void turnOff() {
		System.out.println("Thermostate is Off");
		System.out.println();
	}

	public void increaseTemperature() {
		System.out.println("Increase the Temperature");
		System.out.println();
	}

	public void decreaseTemperature() {
		System.out.println("Decrease the Temperature");
		System.out.println();
	}

}
