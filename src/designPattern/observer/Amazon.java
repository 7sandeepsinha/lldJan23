package designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    private List<OrderPlacedSubscriber> orderPlacedSubscribers;
    private List<OrderCancelledSubscriber> orderCancelledSubscribers;
    private static Amazon instance;

    private Amazon() {
        orderPlacedSubscribers = new ArrayList<>();
        orderCancelledSubscribers = new ArrayList<>();
    }

    public static Amazon getInstance(){
        if(instance == null){
            synchronized (Amazon.class){
                if(instance == null){
                    instance = new Amazon();
                }
            }
        }
        return instance;
    }

    public void registerOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void unRegisterOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public void registerOrderCancelledSubscriber(OrderCancelledSubscriber orderCancelledSubscriber){
        orderCancelledSubscribers.add(orderCancelledSubscriber);
    }

    public void unRegisterOrderCancelledSubscriber(OrderCancelledSubscriber orderCancelledSubscriber){
        orderCancelledSubscribers.remove(orderCancelledSubscriber);
    }

    public void orderPlaceEvent(){
        //scmNotifier.notify();
        //customerNotifier.notify();
        //sellerNotifier.notify();
        for(OrderPlacedSubscriber o : orderPlacedSubscribers){
            o.orderPlaceEvent();
        }
    }

    public void orderCancelledEvent(){
        for(OrderCancelledSubscriber o : orderCancelledSubscribers){
            o.orderCancelledEvent();
        }
    }
}


/*
    Amazon a1 -> <customerNotifier>
    Amazon a2 -> <sellerNotifier>
    Amazon a3 -> <scmNotifier>

    a1.placeOrder();
 */