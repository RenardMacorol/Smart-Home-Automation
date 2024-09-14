public class ElectricFan implements Device {

	@Override
	public void turnOn() {
		System.out.println("Electric Fan is On");
		System.out.println();
	}

	@Override
	public void turnOff() {
		System.out.println("Electric Fan if Off");
		System.out.println();
	}

	public void fanUp() {
		System.out.println("Electric Fan Speeds Up");
		System.out.println();
	}

	public void fanDown() {
		System.out.println("Electric Fan Speeds Down");
		System.out.println();
	}

}
