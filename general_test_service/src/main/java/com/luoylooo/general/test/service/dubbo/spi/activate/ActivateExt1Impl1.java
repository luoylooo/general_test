package com.luoylooo.general.test.service.dubbo.spi.activate;

import com.alibaba.dubbo.common.extension.Activate;

@Activate(group = {"default_group"})
public class ActivateExt1Impl1 implements ActivateExt1 {

    public String echo(String msg) {
        return msg;
    }
}
