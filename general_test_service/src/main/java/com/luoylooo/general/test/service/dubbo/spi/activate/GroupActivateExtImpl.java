package com.luoylooo.general.test.service.dubbo.spi.activate;

import com.alibaba.dubbo.common.extension.Activate;

@Activate(group = {"group1", "group2"})
public class GroupActivateExtImpl implements ActivateExt1 {
    public String echo(String msg) {
        return msg;
    }
}
