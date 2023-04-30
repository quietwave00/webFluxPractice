package com.alertPractice.reactivestreams;


import lombok.RequiredArgsConstructor;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class MySubscriber implements Subscriber {

    private Subscription subscription;
    private int bufferSize = 2;

    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        System.out.println("Subscriber: 구독 정보를 받았습니다. 앞으로 " + bufferSize + "개씩 주세요.");
        subscription.request(bufferSize); //한번에 받을 request 수량
    }

    @Override
    public void onNext(Object o) {
        System.out.println("onNext(): "+ o);
        bufferSize--;
        if(bufferSize == 0) {
            System.out.println("=== 기준점 ===");
            bufferSize = 2;
            subscription.request(bufferSize);
        }
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
