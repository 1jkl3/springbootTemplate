package com.gzsdkt.pdemo;

import org.junit.Test;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;
public class Test01 {
    @Test
    public void test(){
        Vector vector = new Vector(3,1);
        vector.add("你好");
        vector.add("我好");
        vector.add("大家好 ");
        vector.add("吃饭");
        vector.add("喝水");
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            System.out.println(elements.nextElement());
        }
    }
    public @Test void test3(){
        Stack<Integer> st=new Stack();
        st.push(12);
        st.push(123);
        for (Integer integer : st) {
            System.out.println(integer);
        }
    }
    @Test
    public void test2(){
        //求0~100的整数数字之和
        int max=100;
        int init=0;
        for(int i=0;i<=max;i++){
            init+=i;
        }
        System.out.println(init);
    }
}
