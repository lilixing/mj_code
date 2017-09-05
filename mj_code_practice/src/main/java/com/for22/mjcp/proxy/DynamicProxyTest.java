package com.for22.mjcp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * The Type DynamicProxyTest
 *
 * @author lx
 * @Description:
 * @Date 2017/8/23
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Icoder icoder = new CoderA();
        InvocationHandler handler = new DynamicProxyCoder(icoder);
        ClassLoader cl = icoder.getClass().getClassLoader();
        Icoder proxy = (Icoder) Proxy.newProxyInstance(cl,icoder.getClass().getInterfaces(),handler);
        proxy.helloWorld("dynamic coder");
    }
}
 