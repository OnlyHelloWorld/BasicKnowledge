package com.star.dataStructure.linkedList;


/**   
 * @ClassName:  ListNode1   
 * @Description:链表结点的定义.  
 * @author: 吉大16沈通
 * @date:   2018年12月24日 下午4:33:40   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class ListNode1 {

	public int val;
	public ListNode1 next;
	
	
	/**   
	 * @Title:  ListNode1   
	 * @Description: 链表结点构造函数
	 * @param:  @param val 结点值
	 * @param:  @param next  下一个结点引用
	 * @throws   
	 */
	public ListNode1(int val,ListNode1 next) {
		// TODO Auto-generated constructor stub
		this.val = val;
		this.next = next;
	}


	/**  
	 * @Title:  getVal <BR>  
	 * @Description: 得到val值 <BR>  
	 * @return: int <BR>  
	 */
	public int getVal() {
		return val;
	}
	
	
}
