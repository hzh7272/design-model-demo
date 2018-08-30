package com.expamle.design.model.prototype.support;

/**
 * 原型接口
 * @author hzh 2018/8/30 下午10:01
 */
public interface Product extends Cloneable {

	/**
	 * 使用方法
	 * @param s 需要打印的字符串
	 */
	public abstract void use(String s);

	/**
	 * 克隆
	 * @return 返回克隆实例
	 */
	Product createClone();
}
