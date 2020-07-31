package br.com.bridi.commandPattern;

public class LightOffCommand implements ICommand {

	public Light light;
	
	public LightOffCommand(Light l) {
		this.light = l;
	}
	
	@Override
	public void execute() {
		this.light.turnOff();		
	}

}
