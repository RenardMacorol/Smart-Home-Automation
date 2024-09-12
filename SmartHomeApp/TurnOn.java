public class TurnOn implements Command {
	Device device;

	TurnOn(Device device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.turnOn();
	}

}
