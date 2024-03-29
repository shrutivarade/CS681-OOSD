package edu.umb.cs681.hw19;


public class DataHandler implements Runnable{

    public StockQuoteObservable obs = new StockQuoteObservable();
    Observer updateQuoteLineChart =  (sender, event) -> System.out.println("StockEvent LineChart Updated");
    Observer updateQuoteTableChart =  (sender, event) -> System.out.println("StockEvent Table Updated");
    Observer updateQuoteThreeDOChart =  (sender, event) -> System.out.println("StockEvent ThreeDO Updated");




    @Override
    public void run() {
        obs.addObserver(updateQuoteLineChart);
        obs.addObserver(updateQuoteTableChart);
        obs.addObserver(updateQuoteThreeDOChart);
        obs.changeQuote("umass", 5463);
    }

    public static void main(String[] args) {

        for(int i = 0; i < 11; i++){
            new Thread(new edu.umb.cs681.hw15.DataHandler()).start();
        }



    }
}
