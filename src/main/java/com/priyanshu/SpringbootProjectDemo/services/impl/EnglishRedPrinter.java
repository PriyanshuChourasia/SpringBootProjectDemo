package com.priyanshu.SpringbootProjectDemo.services.impl;

import com.priyanshu.SpringbootProjectDemo.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {
    @Override
    public String print(){
        return "red";
    }
}
