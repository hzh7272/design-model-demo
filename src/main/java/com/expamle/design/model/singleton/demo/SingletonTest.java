package com.expamle.design.model.singleton.demo;

import com.expamle.design.model.singleton.support.Singleton;
import org.junit.Test;

/**
 * 单例模式测试
 * @author hzh 2018/8/30 下午9:02
 */
public class SingletonTest {

	@Test
	public void test() {
		Singleton instance = Singleton.getInstance();
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();

		System.out.println(instance == instance1);
		System.out.println(instance == instance2);
		System.out.println(instance1 == instance2);
	}
}
