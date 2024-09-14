public class FanUp implements Command {
	ElectricFan electricFan;

	FanUp(ElectricFan electricFan) {
		this.electricFan = electricFan;
	}

	@Override
	public void execute() {
		electricFan.fanUp();
	}

}
