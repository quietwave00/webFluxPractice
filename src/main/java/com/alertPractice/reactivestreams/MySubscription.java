package com.alertPractice.reactivestreams;

import lombok.RequiredArgsConstructor;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

//구독 정보(구독자, 어떤 데이터를 구독할지)
@RequiredArgsConstructor
public class MySubscription implements Subscription {

    private final Subscriber subscriber;
    private final Iterable<Integer> dataList;

    @Override
    public void request(long n) {

    }

    @Override
    public void cancel() {

    }
}
