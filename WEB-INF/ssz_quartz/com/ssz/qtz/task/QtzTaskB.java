package com.ssz.qtz.task;

/**
 * ������������ʱ����B
 * @author��gjw
 */
public class QtzTaskB {
	private static int counter = 0;
	protected void execute() {
		System.out.println("-->����B��"+(++counter));
	}
}
