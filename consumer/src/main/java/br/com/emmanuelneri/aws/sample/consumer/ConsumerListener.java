package br.com.emmanuelneri.aws.sample.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ConsumerListener {

    @JmsListener(destination = "${consumer.sqs.queue.name}")
    public void recive(@Headers Map<String, Object> messageAttributes,
                       @Payload String message) {
        // Do something
        System.out.println("Messages attributes: " + messageAttributes);
        System.out.println("Body: " + message);
    }

}
