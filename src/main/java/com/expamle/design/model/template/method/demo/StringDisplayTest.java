package com.expamle.design.model.template.method.demo;

import com.expamle.design.model.template.method.support.AbstractDisplay;
import org.junit.Test;

/**
 * 模板方法模式测试
 * @author hzh 2018/8/28 下午10:07
 */
public class StringDisplayTest {

	@Test
	public void test() {
		AbstractDisplay abstractDisplay = new StringDisplay("Hello World!");
		abstractDisplay.display();
	}
}
