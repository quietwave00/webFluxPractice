package com.alertPractice.reactivestreams;

import lombok.RequiredArgsConstructor;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.Iterator;

//구독 정보(구독자, 어떤 데이터를 구독할지)
public class MySubscription implements Subscription {

    private Subscriber subscriber;
    private Iterator<Integer> dataList;

    public MySubscription(Subscriber subscriber, Iterable<Integer> dataList) {
        this.subscriber = subscriber;
        this.dataList = dataList.iterator();
    }

    @Override
    public void request(long n) {
        while(n > 0) {
            if(dataList.hasNext()) {
                subscriber.onNext(dataList.next());
            } else {
                subscriber.onComplete();
                break;
            }
            n--;
        }

    }

    @Override
    public void cancel() {

    }
}
