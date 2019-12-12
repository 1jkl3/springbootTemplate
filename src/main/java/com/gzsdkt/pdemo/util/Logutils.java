package com.gzsdkt.pdemo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Logutils {
    public static Logger getBussinessLogger(){
        return LoggerFactory.getLogger(LogEnum.BUSSINESS.getCategory());
    }
    public static Logger getplatformLogger(){
        return LoggerFactory.getLogger(LogEnum.PLATFORM.getCategory());
    }
    public static Logger getDBLogger(){
        return LoggerFactory.getLogger(LogEnum.DB.getCategory());
    }
    public static Logger getExceptionLogger(){
        return LoggerFactory.getLogger(LogEnum.EXCEPTION.getCategory());
    }
}
