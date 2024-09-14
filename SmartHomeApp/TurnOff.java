public class TurnOff implements Command {
	private Device device;

	TurnOff(Device device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.turnOff();
	}

}
