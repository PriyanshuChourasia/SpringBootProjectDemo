package com.priyanshu.SpringbootProjectDemo.services.impl;

import com.priyanshu.SpringbootProjectDemo.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements BluePrinter {
    @Override
    public String print(){
        return "blue";
    }
}
