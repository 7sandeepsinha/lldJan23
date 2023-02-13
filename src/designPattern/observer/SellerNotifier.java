package designPattern.observer;

public class SellerNotifier implements OrderPlacedSubscriber{

    public SellerNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData r = new ReturnData("Notifying all seller after order placed");
        System.out.println("SellerNotifier listener - notify sellers");
        return r;
    }
}
