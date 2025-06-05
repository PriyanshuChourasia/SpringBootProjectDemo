package com.priyanshu.SpringbootProjectDemo.services.impl;

import com.priyanshu.SpringbootProjectDemo.services.GreenPrinter;

public class EnglishGreenPrinter implements GreenPrinter {
    @Override
    public String print(){
        return "green";
    }
}
