package com.expamle.design.model.template.factory.demo;

import com.expamle.design.model.template.factory.support.Factory;
import com.expamle.design.model.template.factory.support.Product;
import org.junit.Test;

/**
 * 模板工厂模式测试
 * @author hzh 2018/8/28 下午10:37
 */
public class FactoryTest {

	@Test
	public void test() {
		Factory factory = new IdCardFactory();
		Product product1 = factory.create("张三");
		Product product2 = factory.create("李四");
		Product product3 = factory.create("王五");

		product1.use();
		product2.use();
		product3.use();

		System.out.println(((IdCardFactory) factory).get(((IdCard) product1).getCardNo()));
	}
}
