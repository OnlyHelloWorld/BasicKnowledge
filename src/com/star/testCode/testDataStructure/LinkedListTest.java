package com.star.testCode.testDataStructure;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import com.star.dataStructure.linkedList.ListNode1;
import com.star.dataStructure.linkedList.ListOperation;


/**   
 * @ClassName:  LinkedListTest   
 * @Description:����������ĵ�Ԫ����.
 * @author: ����16��ͨ
 * @date:   2018��12��24�� ����4:54:41   
 *     
 * @Copyright: 2018 ����16��ͨ Inc. All rights reserved. 
 */
public class LinkedListTest {

	
	
	/**   
	 * @Title: testReverseList   
	 * @Description: ���Է�ת����.   
	 * @param:       
	 * @return: void      
	 * @throws   
	 */
	@Test
	public void testReverseList() {

		ListNode1 three = new ListNode1(3, null);
		ListNode1 two = new ListNode1(2, three);
		ListNode1 one = new ListNode1(1, two);
		
		ListNode1 res = ListOperation.reverseList(one);
		while (res != null) {
			System.out.println(res.getVal());
			res = res.next;
		}
		
	}

}
