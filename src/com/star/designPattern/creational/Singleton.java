/**  
 * All rights Reserved, Designed By 吉大16沈通
 * @Title:  Singleton.java   
 * @Package com.star.designPattern.creational   
 * @Description:  创建型设计模式 
 * @author: 吉大16沈通 
 * @date:   2019年1月14日 下午7:13:38   
 * @version V1.0 
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.designPattern.creational;

import javax.sound.midi.Synthesizer;

/**   
 * @ClassName:  Singleton   
 * @Description:创建型:单例设计模式
 * 				三个条件:
 * 				私有的静态变量
 * 				私有的构造函数
 * 				公共可访问的静态函数
 * 				注:instance有必要使用volatile关键词修饰,防止jvm指令重排
 * @author: 吉大16沈通
 * @date:   2019年1月14日 下午7:13:38   
 *     
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class Singleton {
	
	//懒汉式,线程不安全,当多个线程进入if(instance == null)判断时
	/*private static Singleton instance;			//私有的静态变量
	
	//私有的构造函数
	private Singleton() {
		
	}
	
	//公共可访问的静态函数
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}*/
	
	
	//饿汉式,线程安全
	/*private static Singleton instance = new Singleton();    //私有的静态变量
	
	//私有的构造函数
	private Singleton() {

	}
	
	//公共的可访问的静态函数
	public static Singleton getInstace() {
		return instance;
	}*/
	
	//懒汉式,但是线程安全,通过synchronized关键词来保证
	/*private static Singleton instance;			//私有的静态变量
	
	//私有的构造函数
	private Singleton() {

	}
	
	//公共的可访问的静态函数
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}*/
	
	//懒汉式双重验证,线程安全,只对实例化代码进行加锁,加锁之后进行一次非空判断
	/*private static Singleton instance;			//私有的静态变量
	
	//私有的构造方法
	private Singleton() {
		
	}
	
	//公共的可访问的静态函数
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized(Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}*/
	
	//静态内部类实现,既具有延迟加载的特性,jvm又能保证线程安全
	//内部类生产实例
	private static class InstanceHolder{
		public static Singleton instance = new Singleton();
	}

	//私有的构造函数
	private Singleton() {

	}
	//公共的可访问的静态函数
	public static Singleton getInstance() {
		return InstanceHolder.instance;
	}
	
	/*
	 * 通过枚举实现
	 * public enum Singleton{
	 * 		INSTANCE;
	 * }
	 * */

}
