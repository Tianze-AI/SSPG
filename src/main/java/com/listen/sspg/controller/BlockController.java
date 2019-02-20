package com.listen.sspg.controller;

import com.listen.sspg.entity.blocknoinfo;
import com.listen.sspg.service.BlockServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Test")
public class BlockController {
    @Autowired
    public BlockServiceImpl testService;

    @RequestMapping(value = "/hello", method = { RequestMethod.GET, RequestMethod.POST }, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public blocknoinfo getShipControlRule() {
        return testService.getBlock("");
    }

}