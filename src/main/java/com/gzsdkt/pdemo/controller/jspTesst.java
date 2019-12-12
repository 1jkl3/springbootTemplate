package com.gzsdkt.pdemo.controller;
import com.gzsdkt.pdemo.util.Logutils;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jspTesst {
    @Autowired
    private Logutils logutils;
    @RequestMapping("/")
    public String index(){
//        Logger logger = logutils.getExceptionLogger();
//        Logger dbLogger = logutils.getDBLogger();
//        logger.error("错误日志");
//        dbLogger.info("数据层");
        return "index";
    }
}
