package com.alipay.spring.test.aop.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yi.xia
 * @date Create At 2023/2/3
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
@Component
public class AServiceImpl implements AService {

    @Autowired
    private BService bService;

    public String getName() {
        return "AService";
    }
}
