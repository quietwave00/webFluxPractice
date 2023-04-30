package com.alertPractice.reactivestreams;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

import java.util.Arrays;
import java.util.Iterator;

public class MyPublisher implements Publisher<Integer> {

    //어떤 데이터를 갖고 있는지
    Iterable<Integer> dataList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    @Override
    public void subscribe(Subscriber<? super Integer> subscriber) {
        System.out.println("Subscriber: 구독할게요");
        System.out.println("Publisher: 구독 정보 만들어서 줄게요 기다려주세요");
        MySubscription mySubscription = new MySubscription(subscriber, dataList);
        System.out.println("Publisher: 구독 정보 생성 완료");
        subscriber.onSubscribe(mySubscription);
    }
}
