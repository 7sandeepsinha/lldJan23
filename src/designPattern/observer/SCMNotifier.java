package designPattern.observer;

public class SCMNotifier implements OrderPlacedSubscriber{

    public SCMNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData r = new ReturnData("Notifying all SCMs after order placed");
        System.out.println("SCMNotifier listener - notify SCM");
        return r;
    }
}
