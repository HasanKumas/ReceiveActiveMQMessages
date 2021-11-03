package com.example.receiveactivemqmessages;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceiverController {
    @Autowired
    private Receiver receiver;

    @RequestMapping("/receiver")
    public void receiveMessage() throws Exception{
        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);

    }
}
