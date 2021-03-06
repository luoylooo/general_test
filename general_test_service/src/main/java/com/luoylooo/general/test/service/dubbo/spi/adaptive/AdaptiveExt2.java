package com.luoylooo.general.test.service.dubbo.spi.adaptive;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI("dubbo")
public interface AdaptiveExt2 {

    @Adaptive({"t"})
    String echo(String msg, URL url);
}
