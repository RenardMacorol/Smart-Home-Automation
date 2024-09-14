public class DecreaseTemperature implements Command {
	Thermostat thermostat;

	DecreaseTemperature(Thermostat thermostat) {
		this.thermostat = thermostat;
	}

	@Override
	public void execute() {
		thermostat.decreaseTemperature();
	}

}
