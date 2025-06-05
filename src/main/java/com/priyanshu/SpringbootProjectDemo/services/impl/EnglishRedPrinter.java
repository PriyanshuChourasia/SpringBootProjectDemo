package com.priyanshu.SpringbootProjectDemo.services.impl;

import com.priyanshu.SpringbootProjectDemo.services.RedPrinter;

public class EnglishRedPrinter implements RedPrinter {
    @Override
    public String print(){
        return "red";
    }
}
