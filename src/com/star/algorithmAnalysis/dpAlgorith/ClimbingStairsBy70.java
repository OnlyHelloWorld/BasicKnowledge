/**  
 * All rights Reserved, Designed By 吉大16沈通
 * @Title:  ClimbingStairs.java   
 * @Package com.star.algorithmAnalysis.dpAlgorith   
 * @Description: 基于一维dp求解的算法
 * @author: 吉大16沈通 
 * @date:   2018年12月25日 下午4:34:00   
 * @version V1.0 
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.algorithmAnalysis.dpAlgorith;

/**   
 * @ClassName:  ClimbingStairs   
 * @Description:假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
				每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
				注意：给定 n 是一个正整数。.
 * @author: 吉大16沈通
 * @date:   2018年12月25日 下午4:34:00   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class ClimbingStairsBy70 {

	/**   
	 * @Title: climbStairs   
	 * @Description: 爬楼梯题目求解算法(实质为斐波那契数列),通过dp求解:f(n) = f(n -1) + f(n - 2).   
	 * @param: @param n 传进的参数:楼梯阶数.
	 * @param: @return      
	 * @return: int      
	 * @throws   
	 */
	public static int climbStairs(int n) {
		
		//防止输入为1时,下面的res[2] = 2报数组越界错误
		if(n == 1)
			return 1;
		int[] res = new int[n+1];
		res[0] = 0; res[1] = 1; res[2] = 2;
		for(int i = 3; i < n+1;i++)
			res[i] = res[i-1] + res[i-2];
		return res[n];
	}
	
}
