package com.onlineshopping.flipcart.Controller;

import com.onlineshopping.flipcart.model.Flipcart;
import com.onlineshopping.flipcart.repository.Flipcartrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public  class Flipcartcont {
    @Autowired
    private Flipcartrepo flipcartrepo;

    @PostMapping
public void createflipcartrecord(@RequestBody Flipcart flipcart){
        flipcartrepo.save(flipcart);
    }
    @RequestMapping
    public  List<Flipcart>allgetdetails() {
        List<Flipcart> all = flipcartrepo.findAll();
        return all;
    }
}

