package com.ssz.qtz.simple.task;

import org.springframework.stereotype.Component;

/**
 * ������������ʱ����B
 * @author��gjw
 */
@Component("taskB")
public class QtzTaskB {
	private static int counter = 0;
	protected void todoTaskB() {
		System.out.println("-->����B��"+(++counter));
	}
}
