package com.priyanshu.SpringbootProjectDemo.services.impl;

import com.priyanshu.SpringbootProjectDemo.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreenPrinter implements GreenPrinter {
    @Override
    public String print(){
        return "green";
    }
}
