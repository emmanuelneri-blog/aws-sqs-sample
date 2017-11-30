package br.com.emmanuelneri.aws.samples.producer.controller;

import br.com.emmanuelneri.aws.samples.producer.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/files")
@Slf4j
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping
    public ResponseEntity insert(@RequestBody String file) {
       try {
           fileService.sentToQueue(file);
           return ResponseEntity.ok().build();
       } catch (Exception ex) {
           log.error("Error sending file to queue", ex);
           return ResponseEntity.badRequest().build();
       }
    }
}
