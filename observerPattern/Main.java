package br.com.bridi.observerPattern;

public class Main {
	
	public static void main(String[] args) {
		
		IObservable observable = new ConcreteObservable();
		IObserver observer1 = new ConcreteObserver(observable);
		IObserver observer2 = new ConcreteObserver(observable);
		IObserver observer3 = new ConcreteObserver(observable);
		
		observable.add(observer1);
		observable.add(observer2);
		observable.add(observer3);
		
		
		observable.setLockedMode(true);
		
		System.out.println("/***************Changed to false***************/");
		
		observable.setLockedMode(false);
		
	}

}
