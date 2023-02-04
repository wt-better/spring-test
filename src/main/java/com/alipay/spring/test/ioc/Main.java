package com.alipay.spring.test.ioc;

import com.alipay.spring.test.ioc.bean.ABean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yi.xia
 * @date Create At 2021/5/24
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
            "spring/1.xml");
        ABean bean = classPathXmlApplicationContext.getBean(ABean.class);

        System.out.println(bean.getClass().getName());

        classPathXmlApplicationContext.close();
    }
}
