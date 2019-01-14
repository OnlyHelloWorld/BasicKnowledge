/**  
 * All rights Reserved, Designed By ����16��ͨ
 * @Title:  TwoSum2By167.java   
 * @Package com.star.algorithmAnalysis.doublePointer   
 * @Description:  ����˫ָ������һ����(167. Two Sum II - Input array is sorted)
 * @author: ����16��ͨ 
 * @date:   2019��1��13�� ����8:58:44   
 * @version V1.0 
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.algorithmAnalysis.doublePointer;

/**   
 * @ClassName:  TwoSum2By167   
 * @Description:����һ���Ѱ����������� ���������飬�ҵ�������ʹ���������֮�͵���Ŀ������
				����Ӧ�÷����������±�ֵ index1 �� index2������ index1 ����С�� index2��
				˵��:
				���ص��±�ֵ��index1 �� index2�����Ǵ��㿪ʼ�ġ�
				����Լ���ÿ������ֻ��ӦΨһ�Ĵ𰸣������㲻�����ظ�ʹ����ͬ��Ԫ�ء�
				ʾ��:
				����: numbers = [2, 7, 11, 15], target = 9
				���: [1,2]
				����: 2 �� 7 ֮�͵���Ŀ���� 9 ����� index1 = 1, index2 = 2 ��
 * @author: ����16��ͨ
 * @date:   2019��1��13�� ����8:58:44   
 *     
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class TwoSum2By167 {

	/**   
	 * @Title: twoSum   
	 * @Description: ����ָ��ֱ�ָ����������,���С��Ŀ��ֵ��ָ����ǰ�ƶ�,��������ָ������ƶ�.   
	 * @param: @param numbers  ��������.
	 * @param: @param target   Ŀ��ֵ.
	 * @param: @return      
	 * @return: int[]   �����±�������   
	 * @throws   
	 */
	public static int[] twoSum(int[] numbers, int target) {
		
		int i = 0,j = numbers.length-1;
		
		while (i < j) {
			int sum = numbers[i] + numbers[j];
			if (sum == target) {
				return new int[]{i+1,j+1};
			}
			if (sum < target) {
				i++;
			}else {
				j--;
			}
		}
		
        return null;
    }
	
}
