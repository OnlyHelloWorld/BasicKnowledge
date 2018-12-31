package com.star.dataStructure.linkedList;


/**   
 * @ClassName:  ListOperation   
 * @Description:链表一系列操作的实现.
 * @author: 吉大16沈通
 * @date:   2018年12月24日 下午4:42:04   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class ListOperation {

	public static ListNode1 reverseList(ListNode1 head) {
		ListNode1 newList = new ListNode1(-1,null);
		
		while (head != null) {
			ListNode1 next = head.next;
			head.next = newList.next;
			newList.next = head;
			head = next;
		}
		return newList.next;
	}
	
}
