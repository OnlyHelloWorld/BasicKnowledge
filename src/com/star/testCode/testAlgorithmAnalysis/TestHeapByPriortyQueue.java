/**  
 * All rights Reserved, Designed By 吉大16沈通
 * @Title:  TestHeapByPriortyQueue.java   
 * @Package com.star.testCode.testAlgorithmAnalysis   
 * @Description:    TODO 
 * @author: 吉大16沈通 
 * @date:   2019年1月5日 上午11:19:12   
 * @version V1.0 
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.testCode.testAlgorithmAnalysis;

import static org.junit.Assert.*;

import org.junit.Test;

import com.star.algorithmAnalysis.sortingAlgorithm.HeapSortByPriorityQueue;

/**   
 * @ClassName:  TestHeapByPriortyQueue   
 * @Description:TODO
 * @author: 吉大16沈通
 * @date:   2019年1月5日 上午11:19:12   
 *     
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class TestHeapByPriortyQueue {

	@Test
	public void test() {
		int[] nums = {5,2,8,1,6,7,9};
		int[] res = HeapSortByPriorityQueue.HeapByPriortyQueue(nums);
		for (int i : res) {
			System.out.println(i);
		}
	}

}
