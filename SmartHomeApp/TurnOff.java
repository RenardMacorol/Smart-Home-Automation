public class TurnOff implements Command {
	Device device;

	TurnOff(Device device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.turnOff();
	}

}
