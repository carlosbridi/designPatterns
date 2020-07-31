package br.com.bridi.commandPattern;

import java.util.ArrayList;
import java.util.List;

public class Switch {

	private List<ICommand> history = new ArrayList<ICommand>();

	public void storeAndExecute(ICommand cmd) {
		this.history.add(cmd); // optional
		cmd.execute();
	}

}
