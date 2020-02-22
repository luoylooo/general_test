package com.luoylooo.general.test.service.dubbo.spi.activate;

import com.alibaba.dubbo.common.extension.Activate;

@Activate(value = {"value1"}, group = {"value"})
public class ValueActivateExtImpl implements ActivateExt1 {
    public String echo(String msg) {
        return msg;
    }
}
