package com.for22.mjcp.proxy;

/**
 * The Type StaticProxyCoder
 *
 * @author lx
 * @Description:
 * @Date 2017/8/23
 */
public class StaticProxyCoder implements Icoder{

    Icoder icoder;

    public StaticProxyCoder(Icoder icoder) {
        this.icoder = icoder;
    }

    @Override
    public void helloWorld(String name) {
        icoder.helloWorld(name);
    }
}
 