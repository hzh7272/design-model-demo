package com.expamle.design.model.template.method.demo;

import com.expamle.design.model.template.method.support.AbstractDisplay;

/**
 * 字符串打印方法
 * @author hzh 2018/8/28 下午10:04
 */
public class StringDisplay extends AbstractDisplay {

	private String content;

	public StringDisplay(String content) {
		this.content = content;
	}

	/**
	 * 开启资源抽象方法
	 */
	@Override
	public void open() {
		System.out.println("------ begin -----");
	}

	/**
	 * 打印数据抽象方案
	 */
	@Override
	public void print() {
		for (int i = 0; i < 5; i++) {
			System.out.println(content);
		}
	}

	/**
	 * 关闭资源抽象方案
	 */
	@Override
	public void close() {
		System.out.println("------ end -----");
	}
}
