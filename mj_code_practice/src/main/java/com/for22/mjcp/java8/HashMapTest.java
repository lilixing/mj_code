package com.for22.mjcp.java8;

import org.junit.*;

/**
 * The Type HashMapTest
 *
 * @author lx
 * @Description:
 * @Date 2017/8/23
 */
public class HashMapTest {

    @org.junit.Test
    public void test(){
        int n = 11;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        System.out.println(n);
    }
}
 