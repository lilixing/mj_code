package com.for22.mjcp.proxy;

/**
 * The Type CoderA
 *
 * @author lx
 * @Description:
 * @Date 2017/8/23
 */
public class CoderA implements Icoder{

    @Override
    public void helloWorld(String name) {
        System.out.println("coder teamA "+name+" say hello world.");
    }
}
 