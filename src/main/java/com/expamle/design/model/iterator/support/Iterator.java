package com.expamle.design.model.iterator.support;

/**
 * 迭代器接口
 * @author hzh 2018/8/27 下午10:49
 */
public interface Iterator<T> {

	/**
	 * 判断是否有下一个元素
	 * @return 返回true则有下一个元素，false则没有
	 */
	boolean hasNext();

	/**
	 * 获取当前元素，并指向下一个元素
	 * @return 返回当前元素
	 */
	T next();
}
