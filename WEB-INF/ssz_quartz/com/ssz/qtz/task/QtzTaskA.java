package com.ssz.qtz.task;

import org.springframework.stereotype.Component;

/**
 * ������������ʱ����A
 * @author��gjw
 */
@Component("myBean")
public class QtzTaskA {
	private static int counter = 0;
	protected void todoTask() {
		System.out.println("����A��"+(++counter));
	}
}
