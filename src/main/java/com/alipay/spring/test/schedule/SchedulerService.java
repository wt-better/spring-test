package com.alipay.spring.test.schedule;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author yi.xia
 * @date Create At 2021/4/21
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
@Component
@EnableScheduling
public class SchedulerService {

    @Scheduled(fixedDelay = 1)
    public void schedule() {
        try {
            System.out.println("Hello -b");
            Thread.sleep(1000);
            System.out.println("Hello -a");
        } catch (InterruptedException e) {
            System.out.println("响应中断");
        }
    }
}
