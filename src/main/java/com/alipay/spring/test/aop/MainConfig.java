package com.alipay.spring.test.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yi.xia
 * @date Create At 2023/2/3
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
@ComponentScan(basePackages = {"com.alipay.spring.test.aop.base"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MainConfig {
}
