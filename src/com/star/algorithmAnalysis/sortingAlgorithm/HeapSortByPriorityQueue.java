/**  
 * All rights Reserved, Designed By ����16��ͨ
 * @Title:  HeapSortByPriorityQueue.java   
 * @Package com.star.algorithmAnalysis.sortingAlgorithm   
 * @Description:   ͨ�����ȶ��н��ж�����
 * @author: ����16��ͨ 
 * @date:   2019��1��5�� ����10:58:54   
 * @version V1.0 
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.algorithmAnalysis.sortingAlgorithm;

import java.util.PriorityQueue;

/**   
 * @ClassName:  HeapSortByPriorityQueue   
 * @Description:java�������ȶ���ʵ�ֶ�����,�������ڽ��top-k����
 * @author: ����16��ͨ
 * @date:   2019��1��5�� ����10:58:54   
 *     
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class HeapSortByPriorityQueue {

	/**   
	 * @Title: HeapByPriortyQueue   
	 * @Description: ������ .
	 * @param: @param nums ����������.
	 * @param: @return      
	 * @return: int[]  �����������.    
	 * @throws   
	 */
	public static int[] HeapByPriortyQueue(int[] nums) {
		if (nums == null || nums.length == 1) {
			return nums;
		}
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		int[] res = new int[nums.length];
		for (int i : nums) {
			queue.offer(i);
		}
		for (int i = 0; i < nums.length; i++) {  //ע���ʱ�ٽ�����������queue.size(),��Ϊ����������size�ᷢ���仯
			res[i] = queue.poll();
		}
		
		return res;
	}
	
}
