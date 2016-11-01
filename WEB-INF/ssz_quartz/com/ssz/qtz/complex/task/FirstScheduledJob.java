package com.ssz.qtz.complex.task;

import org.quartz.JobExecutionContext;  
import org.quartz.JobExecutionException;  
import org.springframework.scheduling.quartz.QuartzJobBean;  

import com.ssz.qtz.complex.task.util.AnotherBean;

public class FirstScheduledJob extends QuartzJobBean {  
    
    private AnotherBean anotherBean;  
  
    @Override  
    protected void executeInternal(JobExecutionContext arg0)
            throws JobExecutionException {  
        System.out.println("I am FirstScheduledJob");  
        this.anotherBean.printAnotherMessage();  
  
    }  
  
    public void setAnotherBean(AnotherBean anotherBean) {  
        this.anotherBean = anotherBean;  
    }  
}  