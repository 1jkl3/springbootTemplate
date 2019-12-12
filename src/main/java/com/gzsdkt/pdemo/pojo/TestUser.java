package com.gzsdkt.pdemo.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Data
@Component
public class TestUser implements Serializable {
    private int uid;
    private String u_name;
    private List<String> data;
    public TestUser(){
        super();
    }
    public TestUser(int uid,String u_name,List<String> data){
        this.uid=uid;
        this.u_name=u_name;
        this.data=data;
    }
}
