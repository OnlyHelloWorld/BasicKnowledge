/**  
 * All rights Reserved, Designed By ����16��ͨ
 * @Title:  ClimbingStairs.java   
 * @Package com.star.algorithmAnalysis.dpAlgorith   
 * @Description: ����һάdp�����㷨
 * @author: ����16��ͨ 
 * @date:   2018��12��25�� ����4:34:00   
 * @version V1.0 
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.algorithmAnalysis.dpAlgorith;

/**   
 * @ClassName:  ClimbingStairs   
 * @Description:������������¥�ݡ���Ҫ n ������ܵ���¥����
				ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�
				ע�⣺���� n ��һ����������.
 * @author: ����16��ͨ
 * @date:   2018��12��25�� ����4:34:00   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class ClimbingStairsBy70 {

	/**   
	 * @Title: climbStairs   
	 * @Description: ��¥����Ŀ����㷨(ʵ��Ϊ쳲���������),ͨ��dp���:f(n) = f(n -1) + f(n - 2).   
	 * @param: @param n �����Ĳ���:¥�ݽ���.
	 * @param: @return      
	 * @return: int      
	 * @throws   
	 */
	public static int climbStairs(int n) {
		
		//��ֹ����Ϊ1ʱ,�����res[2] = 2������Խ�����
		if(n == 1)
			return 1;
		int[] res = new int[n+1];
		res[0] = 0; res[1] = 1; res[2] = 2;
		for(int i = 3; i < n+1;i++)
			res[i] = res[i-1] + res[i-2];
		return res[n];
	}
	
}
