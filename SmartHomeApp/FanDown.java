public class FanDown implements Command {
	ElectricFan electricFan;

	FanDown(ElectricFan electricFan) {
		this.electricFan = electricFan;
	}

	@Override
	public void execute() {
		electricFan.fanDown();
	}

}
