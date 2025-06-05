package com.priyanshu.SpringbootProjectDemo.services.impl;

import com.priyanshu.SpringbootProjectDemo.services.BluePrinter;
import com.priyanshu.SpringbootProjectDemo.services.ColourPrinter;
import com.priyanshu.SpringbootProjectDemo.services.GreenPrinter;
import com.priyanshu.SpringbootProjectDemo.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter){
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }
    @Override
    public String print(){
        return String.join(",", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
