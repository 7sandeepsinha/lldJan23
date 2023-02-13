package designPattern.observer;

public class CustomerNotifier implements OrderPlacedSubscriber, OrderCancelledSubscriber{

    public CustomerNotifier() {
        //do something
        Amazon a = Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
        a.registerOrderCancelledSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData r = new ReturnData("Notifying customer after order placed");
        System.out.println("CustomerNotifier listener - notify customer");
        return r;
    }

    @Override
    public ReturnData orderCancelledEvent() {
        ReturnData r = new ReturnData("Notifying customer after order cancelled");
        System.out.println("CustomerNotifier listener - notify customer - cancellation");
        return r;
    }
}
