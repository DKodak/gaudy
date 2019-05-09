package com.example.springboootscheduleddemo.Scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @company 宏图
 * @User Kodak
 * @create 2019-05-09 -8:31
 */
@Component
public class Scheduler{
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//@Scheduled参数描述
//@Scheduled(fixedRate=3000)：上一次开始执行时间点后3秒再次执行；
//@Scheduled(fixedDelay=3000)：上一次执行完毕时间点3秒再次执行；
//@Scheduled(initialDelay=1000, fixedDelay=3000)：第一次延迟1秒执行，然后在上一次执行完毕时间点3秒再次执行；
//@Scheduled(cron="* * * * * ?")：按cron规则执行；

    //每隔2秒执行一次
    @Scheduled(fixedRate = 2000)
    public void testTasks() {
        System.out.println("定时任务执行时间：" + dateFormat.format(new Date()));
    }

//    cron规则
//    cron表达式中各时间元素使用空格进行分割，表达式有至少6个（也可能7个）分别表示如下含义：
//
//秒（0~59）
//分钟（0~59）
//小时（0~23）
//天（月）（0~31，但是你需要考虑你月的天数）
//月（0~11）
//天（星期）（1~7 1=SUN 或 SUN，MON，TUE，WED，THU，FRI，SAT）
//7.年份（1970－2099）
//    https://www.cnblogs.com/pejsidney/p/9046818.html  详细参考

    //每天3：05执行
    @Scheduled(cron = "0 05 03 ? * *")
    public void testTaskss() {
        System.out.println("定时任务执行时间：" + dateFormat.format(new Date()));
    }


}
