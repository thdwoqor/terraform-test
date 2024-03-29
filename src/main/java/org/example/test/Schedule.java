package org.example.test;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Schedule {

    public void sendMessage() throws InterruptedException {
        System.out.println("Start");
        System.out.println("Start");
        Thread.sleep(50000);
        System.out.println("End");
        System.out.println("End");
    }
}
