/**  
 * All rights Reserved, Designed By 吉大16沈通
 * @Title:  HeapSortByPriorityQueue.java   
 * @Package com.star.algorithmAnalysis.sortingAlgorithm   
 * @Description:   通过优先队列进行堆排序
 * @author: 吉大16沈通 
 * @date:   2019年1月5日 上午10:58:54   
 * @version V1.0 
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.algorithmAnalysis.sortingAlgorithm;

import java.util.PriorityQueue;

/**   
 * @ClassName:  HeapSortByPriorityQueue   
 * @Description:java内置优先队列实现堆排序,经常用于解决top-k问题
 * @author: 吉大16沈通
 * @date:   2019年1月5日 上午10:58:54   
 *     
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class HeapSortByPriorityQueue {

	/**   
	 * @Title: HeapByPriortyQueue   
	 * @Description: 堆排序 .
	 * @param: @param nums 待排序数组.
	 * @param: @return      
	 * @return: int[]  完成排序数组.    
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
		for (int i = 0; i < nums.length; i++) {  //注意此时临界条件不能用queue.size(),因为遍历过程中size会发生变化
			res[i] = queue.poll();
		}
		
		return res;
	}
	
}
