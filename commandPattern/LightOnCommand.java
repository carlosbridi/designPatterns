package br.com.bridi.commandPattern;

public class LightOnCommand implements ICommand {

	private Light light;
	
	public LightOnCommand(Light l) {
		this.light = l;
	}
	
	@Override
	public void execute() {
		this.light.turnOn();
	}

}
