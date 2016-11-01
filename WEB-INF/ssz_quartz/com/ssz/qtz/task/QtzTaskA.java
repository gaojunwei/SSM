package com.ssz.qtz.task;

import org.springframework.stereotype.Component;

/**
 * 功能描述：定时任务A
 * @author：gjw
 */
@Component("myBean")
public class QtzTaskA {
	private static int counter = 0;
	protected void todoTask() {
		System.out.println("任务A："+(++counter));
	}
}
