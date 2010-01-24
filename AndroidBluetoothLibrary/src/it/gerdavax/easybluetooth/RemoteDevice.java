package it.gerdavax.easybluetooth;

import java.util.UUID;

public abstract class RemoteDevice {

	public abstract String getFriendlyName();

	public abstract String getAddress();

	public abstract BtSocket openSocket(UUID serviceId ) throws Exception;
	
	public abstract BtSocket openSocket(int port) throws Exception;
	
	public abstract int getRSSI();
	
	public abstract void ensurePaired();
	
	@Override
	public String toString() {
		return getFriendlyName()+"@"+getAddress();
	}
}