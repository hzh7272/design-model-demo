package com.expamle.design.model.template.method.support;

/**
 * 抽象模板方法类 - 定义模板方法和抽象方法
 * @author hzh 2018/8/28 下午9:59
 */
public abstract class AbstractDisplay {

	/**
	 * 开启资源抽象方法
	 */
	public abstract void open();

	/**
	 * 打印数据抽象方案
	 */
	public abstract void print();

	/**
	 * 关闭资源抽象方案
	 */
	public abstract void close();

	/**
	 * 最终方法，模板方法，规定处理流程，使处理逻辑通用化
	 */
	public final void display() {
		this.open();
		this.print();
		this.close();
	}
}
