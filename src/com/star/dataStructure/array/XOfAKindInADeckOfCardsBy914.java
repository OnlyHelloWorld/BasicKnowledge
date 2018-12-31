/**  
 * All rights Reserved, Designed By ����16��ͨ
 * @Title:  XOfAKindInADeckOfCardsBy914.java   
 * @Package com.star.dataStructure.array   
 * @Description:    TODO 
 * @author: ����16��ͨ 
 * @date:   2018��12��25�� ����10:22:34   
 * @version V1.0 
 * @Copyright: 2018 ����16��ͨ Inc. All rights reserved.
 */
package com.star.dataStructure.array;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**   
 * @ClassName:  XOfAKindInADeckOfCardsBy914   
 * @Description:����һ���ƣ�ÿ�����϶�д��һ��������
				��ʱ������Ҫѡ��һ������ X��ʹ���ǿ��Խ������ư���������ֳ� 1 �������飺
				ÿ�鶼�� X ���ơ�
				�������е����϶�д����ͬ��������
				�������ѡ�� X >= 2 ʱ���� true��    --leetcode914.
 * @author: ����16��ͨ
 * @date:   2018��12��25�� ����10:22:34   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class XOfAKindInADeckOfCardsBy914 {

	/**   
	 * @Title: hasGroupsSizeX   
	 * @Description: ͨ��hashmapͳ��ÿ�����ֳ��ֵĴ���,���������Լ�����ڵ���2,����true.   
	 * @param: @param deck ��Ҫ�жϵ�����.
	 * @param: @return     �Ƿ����� 
	 * @return: boolean      
	 * @throws   
	 */
	public static boolean hasGroupsSizeX(int[] deck) {
		
		//��ֵ��,key(����)--value(���ִ���)
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < deck.length; i++) {
			if (!map.containsKey(deck[i])) {
				map.put(deck[i], 1);
			}else {
				map.put(deck[i], map.get(deck[i])+1);
			}
		}
	    
	    Collection<Integer> value = map.values();
	    System.out.println("��������:"+value.size());
	    int[] values = new int[value.size()];
	    Iterator<Integer> iterator = value.iterator();
	    int i = 0;
	    while (iterator.hasNext()) {
			values[i] = iterator.next();
			System.out.println("���ִ��� :"+values[i]);
			i++;
		}
	    
	    System.out.println(getMaxCommonDivisor(values));
	    
	    //շת����������Լ��
	    if (getMaxCommonDivisor(values) >= 2) {
			return true;
		}else {
			return false;
		}
	        
	        
	}

	/**   
	 * @Title: getMaxCommonDivisor   
	 * @Description: շת�����������Լ��.   
	 * @param: @param values �������.
	 * @return: int ���Լ��.      
	 * @throws   
	 */
	private static int getMaxCommonDivisor(int[] values) {
		// TODO Auto-generated method stub
		int k = getTwoDivisor(values[0],values[1]);
		for (int i = 2; i < values.length; i++) {
			int j = values[i];
			k = getTwoDivisor(j, k);
			System.out.println("k = "+k);
		}
		return k;
	}
	/**   
	 * @Title: getTwoDivisor   
	 * @Description: �õ������������Լ��.
	 * @param: @param a ����1.
	 * @param: @param b ����2.
	 * @param: @return 
	 * @return: int    ����1������2�����Լ��.  
	 * @throws   
	 */
	private static int getTwoDivisor(int a,int b) {
		if (a == b) {
			return a;
		}
		int c = (a < b) ? a : b;
		int d = (a < b) ? b : a;
		while (c != 0) {
			int r = d % c;
			d = c;
			c = r;
		}
		return d;
	}
	
}
