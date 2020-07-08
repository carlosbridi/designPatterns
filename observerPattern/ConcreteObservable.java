package br.com.bridi.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable implements IObservable {

	List<IObserver> observerList = new ArrayList<IObserver>();
	
	//When status changed, notify all subscribers;
	private boolean statusLocked;
	
	@Override
	public void add(IObserver observer) {
		observerList.add(observer);
	}

	@Override
	public void remove(IObserver observer) {
		try {
			observerList.remove(observer);
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public void notifyObservers() {
		observerList.forEach(IObserver::update);
	}

	public List<IObserver> getObserverList() {
		return observerList;
	}

	public boolean isStatusLocked() {
		return statusLocked;
	}

	public void setStatusLocked(boolean statusLocked) {
		this.statusLocked = statusLocked;
	}

	@Override
	public boolean getLockedStatus() {
		return this.statusLocked;
	}

	@Override
	public void setLockedMode(boolean locked) {
		this.setStatusLocked(locked);
		notifyObservers();		
	}

}
