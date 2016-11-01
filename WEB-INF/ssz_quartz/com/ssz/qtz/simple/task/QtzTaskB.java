package com.ssz.qtz.simple.task;

import org.springframework.stereotype.Component;

/**
 * 功能描述：定时任务B
 * @author：gjw
 */
@Component("taskB")
public class QtzTaskB {
	private static int counter = 0;
	protected void todoTaskB() {
		System.out.println("-->任务B："+(++counter));
	}
}
