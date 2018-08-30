package com.expamle.design.model.prototype.support;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 使用者
 * @author hzh 2018/8/30 下午10:06
 */
public class Manager {

	public Map<String, Product> cache = new ConcurrentHashMap<>(16);

	public void register(String name, Product product) {
		cache.put(name, product);
	}

	public Product create(String name) {
		Product product = cache.get(name);
		return product.createClone();
	}
}
