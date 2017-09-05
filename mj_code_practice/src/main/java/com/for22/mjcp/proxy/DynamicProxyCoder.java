package com.for22.mjcp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * The Type DynamicProxyCoder
 *
 * @author lx
 * @Description:
 * @Date 2017/8/23
 */
public class DynamicProxyCoder implements InvocationHandler {

    private Object icoder;

    public DynamicProxyCoder(Object icoder) {
        this.icoder = icoder;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("dynamic proxy start invoke "+ System.currentTimeMillis());
        Object result = method.invoke(icoder,args);
        System.out.println("dynamic proxy end invoke "+ System.currentTimeMillis());
        return result;
    }
}
 