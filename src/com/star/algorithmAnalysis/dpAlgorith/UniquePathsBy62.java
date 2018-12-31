/**  
 * All rights Reserved, Designed By 吉大16沈通
 * @Title:  UniquePathsBy62.java   
 * @Package com.star.algorithmAnalysis.dpAlgorith   
 * @Description:  基于二维dp求解的算法
 * @author: 吉大16沈通 
 * @date:   2018年12月26日 上午10:36:55   
 * @version V1.0 
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.algorithmAnalysis.dpAlgorith;

/**   
 * @ClassName:  UniquePathsBy62   
 * @Description:一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
				机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
				问总共有多少条不同的路径？.
 * @author: 吉大16沈通
 * @date:   2018年12月26日 上午10:36:55   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class UniquePathsBy62 {
	
	/**   
	 * @Title: uniquePaths   
	 * @Description: 不同路径算法求解,使用二维dp求解,关键:dp[i][j] = dp[i][j-1] + dp[i-1][j].
	 * @param: @param m 网格行数
	 * @param: @param n 网格列数
	 * @param: @return      
	 * @return: int   返回不同路径数
	 * @throws   
	 */
	public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        for(int i = 0;i < m;i++) {
        	for (int j = 0; j <n; j++) {
        		if (i == 0 || j == 0) {
					dp[i][j] = 1;
				}else {
					dp[i][j] = dp[i][j-1] + dp[i-1][j];
				}
        		
			}
        }
        
        return dp[m-1][n-1];
    }

}
