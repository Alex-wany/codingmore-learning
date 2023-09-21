package top.codingmore.service;

import org.quartz.Job;
import org.quartz.SchedulerException;

import java.util.Date;

/**
 * 微信搜索「沉默王二」，回复 Java
 *
 * @author 沉默王二
 * @date 5/21/22
 */
public interface IScheduleService {
    /**
     * 通过 Cron 表达式来调度任务
     */
    String scheduleJob(Class<? extends Job> jobBeanClass, String cron, String data) throws SchedulerException;

    /**
     * 指定时间来调度任务
     */
    String scheduleFixTimeJob(Class<? extends Job> jobBeanClass, Date startTime, String data) throws SchedulerException;

    /**
     * 取消定时任务
     */
    Boolean cancelScheduleJob(String jobName) throws SchedulerException;
}
