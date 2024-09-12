public class Light implements Device {

	@Override
	public void turnOn() {
		System.out.println("The Light is On");
	}

	@Override
	public void turnOff() {
		System.out.println("The Light is Off");
	}

}
