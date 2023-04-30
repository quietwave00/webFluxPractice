package com.alertPractice.reactivestreams;


import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class MySubscriber implements Subscriber {
    @Override
    public void onSubscribe(Subscription s) {

    }

    @Override
    public void onNext(Object o) {
        System.out.println("구독 데이터 전달");
    }

    @Override
    public void onError(Throwable t) {
        System.out.println("구독 중 에러");
    }

    @Override
    public void onComplete() {
        System.out.println("구독 완료");

    }
}
