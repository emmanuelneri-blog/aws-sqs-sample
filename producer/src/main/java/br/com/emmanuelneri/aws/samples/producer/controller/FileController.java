package br.com.emmanuelneri.aws.samples.producer.controller;

import br.com.emmanuelneri.aws.samples.producer.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/files")
@Slf4j
public class FileController {

    @Autowired
    private FileService fileService;

    @RequestMapping(method = RequestMethod.POST)
    public void send(@RequestBody String file) {
        fileService.sentToQueue(file);
    }

    @RequestMapping(value="/batch", method = RequestMethod.POST)
    public void batchSend(@RequestBody List<String> files) {
        fileService.sentToQueue(files);
    }

    @RequestMapping(value="/with-attributes", method = RequestMethod.POST)
    public void sendWithAttributes(@RequestBody String file) {
        fileService.sentToQueueWithAttributes(file);
    }
}
