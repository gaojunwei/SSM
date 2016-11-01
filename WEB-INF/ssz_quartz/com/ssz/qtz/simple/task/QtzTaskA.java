package com.ssz.qtz.simple.task;

import org.springframework.stereotype.Component;

/**
 * 功能描述：定时任务A
 * @author：gjw
 */
@Component("taskA")
public class QtzTaskA {
	private static int counter = 0;
	protected void todoTaskA() {
		System.out.println("任务A："+(++counter));
	}
}
