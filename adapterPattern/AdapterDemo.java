package br.com.bridi.adapterPattern;

import br.com.bridi.adapterPattern.interfaces.ILightningConnector;
import br.com.bridi.adapterPattern.interfaces.IUSBConnector;

public class AdapterDemo {

	static void rechargeMicroUsbPhone(IUSBConnector phone) {
        phone.useUSBConnector();
        phone.recharge();
    }

    static void rechargeLightningPhone(ILightningConnector phone) {
        phone.useLightningConnector();
        phone.recharge();
    }
	
	public static void main(String[] args) {
		AndroidPhone android = new AndroidPhone();
		ApplePhone apple = new ApplePhone();
		
        System.out.println("Recharging android with MicroUsb");
        rechargeMicroUsbPhone(android);

        System.out.println("Recharging iPhone with Lightning");
        rechargeLightningPhone(apple);

        System.out.println("Recharging iPhone with MicroUsb");
        rechargeMicroUsbPhone(new AndroidAdapterLightning(apple));	    
	}
	
}
