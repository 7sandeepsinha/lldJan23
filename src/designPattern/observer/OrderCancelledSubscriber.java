package designPattern.observer;

public interface OrderCancelledSubscriber {
    ReturnData orderCancelledEvent();

    //default -> this.registerInAmazon -> orderCancelledEvent
}
