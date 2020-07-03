package br.com.bridi.adapterPattern;

import br.com.bridi.adapterPattern.interfaces.IUSBConnector;

public class AndroidPhone implements IUSBConnector {

	private boolean connected;
	
	@Override
	public void recharge() {
		if (connected) {
            System.out.println("Recharge started");
            System.out.println("Recharge finished");
        } else {
            System.out.println("Connect Android first");
        }		
	}

	@Override
	public void useUSBConnector() {
		this.connected = true;
		System.out.println("Connected Android");
	}

}
