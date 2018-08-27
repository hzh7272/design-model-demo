package com.expamle.design.model.iterator.demo;

import com.expamle.design.model.iterator.support.Iterator;

/**
 * 学生集合迭代器，实现Iterator接口
 * @author hzh 2018/8/27 下午10:52
 */
public class StudentIterator implements Iterator<Student> {

	private Group group;
	private Integer index;

	public StudentIterator(Group group) {
		this.group = group;
		this.index = 0;
	}

	/**
	 * 判断是否有下一个元素
	 * @return 返回true则有下一个元素，false则没有
	 */
	@Override
	public boolean hasNext() {
		return index < this.group.length();
	}

	/**
	 * 获取当前元素，并指向下一个元素
	 * @return 返回当前元素
	 */
	@Override
	public Student next() {
		return this.group.getStudentAt(this.index++);
	}
}
