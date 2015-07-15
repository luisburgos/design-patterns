package observer.examples.auction;

import observer.pattern.Event;
import observer.pattern.Observer;
import observer.pattern.Subject;

/**
 * Created by luisburgos on 15/07/15.
 */
public class AuctionTestDriven {

    public static void main(String[] args) {

        Subject theAuctioneer = new Auctioneer();

        Observer bidderOne = new Bidder();
        Observer bidderTwo = new Bidder();
        Observer bidderThree = new Bidder();

        theAuctioneer.attach(0, bidderOne);
        theAuctioneer.attach(0, bidderTwo);
        theAuctioneer.attach(0, bidderThree);

        theAuctioneer.attach(1, bidderThree);

        Event highBid = new Event(0, "HIGH BID");
        Event lowBid = new Event(1, "LOW BID");

        theAuctioneer.notifyObserver(0, highBid);
        theAuctioneer.notifyObserver(1, lowBid);

    }
}
