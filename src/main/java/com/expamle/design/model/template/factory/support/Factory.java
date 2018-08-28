package com.expamle.design.model.template.factory.support;

/**
 * 用户生成产品相关实例的工厂
 * @author hzh 2018/8/28 下午10:24
 */
public abstract class Factory {

	/**
	 * 创建产品
	 * @param name 产品名称
	 * @return 返回产品实例
	 */
	public abstract Product createProduct(String name);

	/**
	 * 注册产品
	 * @param product 产品实例
	 */
	public abstract void registerProduct(Product product);

	/**
	 * 创建产品是咧
	 * @param name 产品名称
	 * @return 返回产品实例
	 */
	public Product create(String name) {
		Product product = this.createProduct(name);
		this.registerProduct(product);
		return product;
	}
}
