package designPattern.observer;


public class Client {
    public static void main(String[] args) {
        Amazon a = Amazon.getInstance();
        SCMNotifier scmNotifier = new SCMNotifier();
        CustomerNotifier customerNotifier = new CustomerNotifier();
        SellerNotifier sellerNotifier = new SellerNotifier();
        //OrderPlacedSubscriber n = new SCMNotifier();

        a.orderPlaceEvent();
        a.orderCancelledEvent();
    }
}
