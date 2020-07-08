package br.com.bridi.observerPattern;

public class ConcreteObserver implements IObserver {

	private IObservable observable;
	
	/**
	 * It is sent as a parameter to get the data without having to make a request and see what has been changed
	 */
	public ConcreteObserver(IObservable e) {
		this.observable = e;
	}
	
	@Override
	public void update() {
		//read data from observable
		System.out.println(this.observable.getLockedStatus());
	}

}
