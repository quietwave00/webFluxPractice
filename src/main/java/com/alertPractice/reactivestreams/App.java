package com.alertPractice.reactivestreams;

public class App {
    public static void main(String[] args) {
        MyPublisher myPublisher = new MyPublisher();
        MySubscriber mySubscriber = new MySubscriber();

        myPublisher.subscribe(mySubscriber);
    }
}
