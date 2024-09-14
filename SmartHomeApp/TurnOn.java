public class TurnOn implements Command {
	private Device device;

	TurnOn(Device device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.turnOn();
	}

}
