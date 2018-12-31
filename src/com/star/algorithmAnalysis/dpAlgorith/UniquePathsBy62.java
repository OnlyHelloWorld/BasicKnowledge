/**  
 * All rights Reserved, Designed By ����16��ͨ
 * @Title:  UniquePathsBy62.java   
 * @Package com.star.algorithmAnalysis.dpAlgorith   
 * @Description:  ���ڶ�άdp�����㷨
 * @author: ����16��ͨ 
 * @date:   2018��12��26�� ����10:36:55   
 * @version V1.0 
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.algorithmAnalysis.dpAlgorith;

/**   
 * @ClassName:  UniquePathsBy62   
 * @Description:һ��������λ��һ�� m x n ��������Ͻ� ����ʼ������ͼ�б��Ϊ��Start�� ����
				������ÿ��ֻ�����»��������ƶ�һ������������ͼ�ﵽ��������½ǣ�����ͼ�б��Ϊ��Finish������
				���ܹ��ж�������ͬ��·����.
 * @author: ����16��ͨ
 * @date:   2018��12��26�� ����10:36:55   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class UniquePathsBy62 {
	
	/**   
	 * @Title: uniquePaths   
	 * @Description: ��ͬ·���㷨���,ʹ�ö�άdp���,�ؼ�:dp[i][j] = dp[i][j-1] + dp[i-1][j].
	 * @param: @param m ��������
	 * @param: @param n ��������
	 * @param: @return      
	 * @return: int   ���ز�ͬ·����
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
