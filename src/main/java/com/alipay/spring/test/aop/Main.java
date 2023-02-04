package com.alipay.spring.test.aop;

import com.alipay.spring.test.aop.base.service.AService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yi.xia
 * @date Create At 2023/2/3
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
            MainConfig.class);

        AService bean = annotationConfigApplicationContext.getBean(AService.class);
        System.out.println(bean.getName());

        annotationConfigApplicationContext.close();
    }
}
