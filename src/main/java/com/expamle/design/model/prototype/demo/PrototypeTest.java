package com.expamle.design.model.prototype.demo;

import com.expamle.design.model.prototype.support.Manager;
import com.expamle.design.model.prototype.support.Product;
import org.junit.Test;

/**
 * 原型模式测试
 * @author hzh 2018/8/30 下午10:19
 */
public class PrototypeTest {

	@Test
	public void test() {
		MessageBox hello = new MessageBox("*");
		MessageBox world = new MessageBox("-");

		Manager manager = new Manager();
		manager.register("hello", hello);
		manager.register("world", world);

		Product product = manager.create("hello");
		Product product2 = manager.create("world");
		Product product3 = manager.create("hello");

		product.use("my name");
		product2.use("you name");
		product3.use("she name");

		System.out.println(product== product3);
	}
}
