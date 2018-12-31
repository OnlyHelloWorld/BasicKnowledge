/**  
 * All rights Reserved, Designed By 吉大16沈通
 * @Title:  XOfAKindInADeckOfCardsBy914.java   
 * @Package com.star.dataStructure.array   
 * @Description:    TODO 
 * @author: 吉大16沈通 
 * @date:   2018年12月25日 上午10:22:34   
 * @version V1.0 
 * @Copyright: 2018 吉大16沈通 Inc. All rights reserved.
 */
package com.star.dataStructure.array;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**   
 * @ClassName:  XOfAKindInADeckOfCardsBy914   
 * @Description:给定一副牌，每张牌上都写着一个整数。
				此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
				每组都有 X 张牌。
				组内所有的牌上都写着相同的整数。
				仅当你可选的 X >= 2 时返回 true。    --leetcode914.
 * @author: 吉大16沈通
 * @date:   2018年12月25日 上午10:22:34   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class XOfAKindInADeckOfCardsBy914 {

	/**   
	 * @Title: hasGroupsSizeX   
	 * @Description: 通过hashmap统计每个数字出现的次数,如果次数公约数大于等于2,返回true.   
	 * @param: @param deck 需要判断的数组.
	 * @param: @return     是否满足 
	 * @return: boolean      
	 * @throws   
	 */
	public static boolean hasGroupsSizeX(int[] deck) {
		
		//键值对,key(数字)--value(出现次数)
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < deck.length; i++) {
			if (!map.containsKey(deck[i])) {
				map.put(deck[i], 1);
			}else {
				map.put(deck[i], map.get(deck[i])+1);
			}
		}
	    
	    Collection<Integer> value = map.values();
	    System.out.println("次数长度:"+value.size());
	    int[] values = new int[value.size()];
	    Iterator<Integer> iterator = value.iterator();
	    int i = 0;
	    while (iterator.hasNext()) {
			values[i] = iterator.next();
			System.out.println("出现次数 :"+values[i]);
			i++;
		}
	    
	    System.out.println(getMaxCommonDivisor(values));
	    
	    //辗转相除法求最大公约数
	    if (getMaxCommonDivisor(values) >= 2) {
			return true;
		}else {
			return false;
		}
	        
	        
	}

	/**   
	 * @Title: getMaxCommonDivisor   
	 * @Description: 辗转相除法求解最大公约数.   
	 * @param: @param values 求解数组.
	 * @return: int 最大公约数.      
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
	 * @Description: 得到两个数的最大公约数.
	 * @param: @param a 数组1.
	 * @param: @param b 数字2.
	 * @param: @return 
	 * @return: int    数字1和数字2的最大公约数.  
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
