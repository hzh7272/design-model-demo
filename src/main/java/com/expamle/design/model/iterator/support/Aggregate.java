package com.expamle.design.model.iterator.support;

/**
 * 集合接口
 * @author hzh 2018/8/27 下午10:45
 */
public interface Aggregate {

	/**
	 * 获取集合迭代器
	 * @return 返回集合迭代器
	 */
	Iterator iterator();

	/**
	 * 获取集合大小
	 * @return 返回集合大小
	 */
	int length();
}
