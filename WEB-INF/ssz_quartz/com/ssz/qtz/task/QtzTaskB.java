package com.ssz.qtz.task;

/**
 * 功能描述：定时任务B
 * @author：gjw
 */
public class QtzTaskB {
	private static int counter = 0;
	protected void execute() {
		System.out.println("-->任务B："+(++counter));
	}
}
