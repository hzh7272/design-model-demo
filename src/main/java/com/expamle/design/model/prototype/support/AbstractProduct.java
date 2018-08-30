package com.expamle.design.model.prototype.support;

/**
 * @author hzh 2018/8/30 下午10:09
 */
public abstract class AbstractProduct implements Product {

	/**
	 * 使用
	 * @param s 需要打印的字符串
	 */
	@Override
	public abstract void use(String s);

	@Override
	public Product createClone() {
		Product product = null;
		try {
			product = (Product) clone();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return product;
	}
}
