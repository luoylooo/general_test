package com.luoylooo.general.test.service.dubbo.spi.adaptive;

import com.alibaba.dubbo.common.URL;

public class ThriftAdaptiveExt2 implements AdaptiveExt2 {

    public String echo(String msg, URL url) {
        return "thrift";
    }
}
