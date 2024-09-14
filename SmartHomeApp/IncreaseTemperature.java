public class IncreaseTemperature implements Command {
	Thermostat thermostat;

	IncreaseTemperature(Thermostat thermostat) {
		this.thermostat = thermostat;
	}

	@Override
	public void execute() {
		thermostat.increaseTemperature();
	}

}
