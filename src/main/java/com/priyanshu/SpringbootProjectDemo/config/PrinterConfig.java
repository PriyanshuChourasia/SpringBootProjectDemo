package com.priyanshu.SpringbootProjectDemo.config;

import com.priyanshu.SpringbootProjectDemo.services.BluePrinter;
import com.priyanshu.SpringbootProjectDemo.services.ColourPrinter;
import com.priyanshu.SpringbootProjectDemo.services.GreenPrinter;
import com.priyanshu.SpringbootProjectDemo.services.RedPrinter;
import com.priyanshu.SpringbootProjectDemo.services.impl.ColourPrinterImpl;
import com.priyanshu.SpringbootProjectDemo.services.impl.EnglishBluePrinter;
import com.priyanshu.SpringbootProjectDemo.services.impl.EnglishGreenPrinter;
import com.priyanshu.SpringbootProjectDemo.services.impl.EnglishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public RedPrinter redPrinter(){
        return new EnglishRedPrinter();
    }

    @Bean
    public BluePrinter bluePrinter(){
        return new EnglishBluePrinter();
    }

    @Bean
    public GreenPrinter greenPrinter(){
        return new EnglishGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter){
        return new ColourPrinterImpl(redPrinter,bluePrinter,greenPrinter);
    }
}
