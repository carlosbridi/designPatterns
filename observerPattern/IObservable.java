package br.com.bridi.observerPattern;

public interface IObservable {

	void add(IObserver observable);
	void remove(IObserver observable);
	void notifyObservers();
	
	boolean getLockedStatus();
	void setLockedMode(boolean locked);
}
