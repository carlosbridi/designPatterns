package br.com.bridi.adapterPattern;

import br.com.bridi.adapterPattern.interfaces.ILightningConnector;
import br.com.bridi.adapterPattern.interfaces.IUSBConnector;

public class AndroidAdapterLightning implements IUSBConnector {

	private ILightningConnector iLightningConnector; 
	
	public AndroidAdapterLightning(ILightningConnector a ) {
		this.iLightningConnector = a;
	}
	
	@Override
	public void recharge() {
		iLightningConnector.recharge();
		
	}

	@Override
	public void useUSBConnector() {
		iLightningConnector.useLightningConnector();		
	}
	
}
