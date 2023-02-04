package com.alipay.spring.test.ioc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yi.xia
 * @date Create At 2023/2/3
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
@Component
public class BBean {
    @Autowired
    private ABean aBean;
}
