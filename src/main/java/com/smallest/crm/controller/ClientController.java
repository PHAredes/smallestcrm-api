package com.smallest.crm.controller;

import com.smallest.crm.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @GetMapping
    public List<Client> list(){
        return null;
    }
}
