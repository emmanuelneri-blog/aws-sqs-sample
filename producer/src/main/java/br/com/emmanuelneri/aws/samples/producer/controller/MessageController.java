package br.com.emmanuelneri.aws.samples.producer.controller;

import br.com.emmanuelneri.aws.samples.producer.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/messages")
@Slf4j
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(method = RequestMethod.POST)
    public void send(@RequestBody String message) {
        messageService.sentToQueue(message);
    }

    @RequestMapping(value="/batch", method = RequestMethod.POST)
    public void batchSend(@RequestBody List<String> messages) {
        messageService.sentToQueue(messages);
    }

    @RequestMapping(value="/with-attributes", method = RequestMethod.POST)
    public void sendWithAttributes(@RequestBody String message) {
        messageService.sentToQueueWithAttributes(message);
    }
}
