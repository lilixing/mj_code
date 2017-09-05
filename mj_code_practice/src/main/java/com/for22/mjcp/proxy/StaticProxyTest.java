package com.for22.mjcp.proxy;

/**
 * The Type StaticProxyTest
 *
 * @author lx
 * @Description:
 * @Date 2017/8/23
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        Icoder icoder = new CoderA();
        Icoder proxy = new StaticProxyCoder(icoder);
        System.out.println("coder teamA start to code");
        proxy.helloWorld("static proxy");
        System.out.println("coder teamA end to code");
    }
}
 