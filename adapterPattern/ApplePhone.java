package br.com.bridi.adapterPattern;

import br.com.bridi.adapterPattern.interfaces.ILightningConnector;

public class ApplePhone implements ILightningConnector {

	private boolean connected;
	
	@Override
	public void recharge() {
		if (connected) {
            System.out.println("Recharge started");
            System.out.println("Recharge finished");
        } else {
            System.out.println("Connect Lightning first");
        }		
	}

	@Override
	public void useLightningConnector() {
		this.connected = true;
		System.out.println("Connected Lightning");
	}

}
