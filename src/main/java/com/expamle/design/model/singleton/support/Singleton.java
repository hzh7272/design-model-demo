package com.expamle.design.model.singleton.support;

/**
 * 单例实例
 * @author hzh 2018/8/30 下午9:00
 */
public class Singleton {

	private static Singleton singleton;

	private Singleton() {
		System.out.println("实例化 Singleton");
	}

	public static Singleton getInstance() {
		return null == singleton ? singleton = new Singleton() : singleton;
	}
}
