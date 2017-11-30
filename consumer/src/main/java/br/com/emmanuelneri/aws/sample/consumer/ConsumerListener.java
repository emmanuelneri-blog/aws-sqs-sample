package br.com.emmanuelneri.aws.sample.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    @JmsListener(destination = "${consumer.sqs.queue.name}")
    public void recive(String message) {
        // Do something
        System.out.println(message);
    }

}
