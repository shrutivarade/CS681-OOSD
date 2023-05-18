package edu.umb.cs681.hw15;


public class TableObserver implements Observer<StockEvent> {

//    StockEvent event = new StockEvent("Shruti", 1027.0);

    @Override
    public void update(Observable<StockEvent> sender, StockEvent event) {
        event.ticker();
        event.quote();
        System.out.println("getTicker: "+event.ticker()+" "+"getQuote: "+event.quote());
        System.out.println("TableObservable: "+sender+" Events: "+event);
    }
}
