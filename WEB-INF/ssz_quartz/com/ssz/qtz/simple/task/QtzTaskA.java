package com.ssz.qtz.simple.task;

import org.springframework.stereotype.Component;

/**
 * ������������ʱ����A
 * @author��gjw
 */
@Component("taskA")
public class QtzTaskA {
	private static int counter = 0;
	protected void todoTaskA() {
		System.out.println("����A��"+(++counter));
	}
}
