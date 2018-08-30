package com.expamle.design.model.factory.method.demo;

import com.expamle.design.model.factory.method.support.Factory;
import com.expamle.design.model.factory.method.support.Product;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ID卡生产工厂
 * @author hzh 2018/8/28 下午10:32
 */
public class IdCardFactory extends Factory {

	private Map<String, String> map = new ConcurrentHashMap<>();

	/**
	 * 创建产品
	 *
	 * @param name 产品名称
	 * @return 返回产品实例
	 */
	@Override
	public Product createProduct(String name) {
		return new IdCard(name);
	}

	/**
	 * 注册产品
	 *
	 * @param product 产品实例
	 */
	@Override
	public void registerProduct(Product product) {
		IdCard idCard = (IdCard) product;
		if (!map.containsKey(idCard.getCardNo())) {
			map.put(idCard.getCardNo(), idCard.getName());
		}
	}

	public String get(String cardNo) {
		return map.get(cardNo);
	}
}
