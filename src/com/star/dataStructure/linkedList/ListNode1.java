package com.star.dataStructure.linkedList;


/**   
 * @ClassName:  ListNode1   
 * @Description:������Ķ���.  
 * @author: ����16��ͨ
 * @date:   2018��12��24�� ����4:33:40   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class ListNode1 {

	public int val;
	public ListNode1 next;
	
	
	/**   
	 * @Title:  ListNode1   
	 * @Description: �����㹹�캯��
	 * @param:  @param val ���ֵ
	 * @param:  @param next  ��һ���������
	 * @throws   
	 */
	public ListNode1(int val,ListNode1 next) {
		// TODO Auto-generated constructor stub
		this.val = val;
		this.next = next;
	}


	/**  
	 * @Title:  getVal <BR>  
	 * @Description: �õ�valֵ <BR>  
	 * @return: int <BR>  
	 */
	public int getVal() {
		return val;
	}
	
	
}
