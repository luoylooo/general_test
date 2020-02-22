package com.luoylooo.general.test.service.dubbo.spi.activate;

import com.alibaba.dubbo.common.extension.Activate;

@Activate(order = 1, group = {"order"})
public class OrderActivateExtImpl2 implements ActivateExt1 {
    public String echo(String msg) {
        return msg;
    }
}
