package com.expamle.design.model.iterator.demo;

import com.expamle.design.model.iterator.support.Aggregate;
import com.expamle.design.model.iterator.support.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 学生小组模型，，实现集合接口
 * @author hzh 2018/8/27 下午10:55
 */
public class Group implements Aggregate {

	private List<Student> students;

	public Group() {
		this.students = new ArrayList<>();
	}

	/**
	 * 添加学生
	 * @param student
	 */
	public void appendStudent(Student student) {
		students.add(student);
	}

	/**
	 * 根据下标获取学生
	 * @param index 学生集合下表
	 * @return 返回学生实例
	 */
	public Student getStudentAt(int index) {
		return index >= this.length() ? null : this.students.get(index);
	}

	/**
	 * 获取学生数量
	 * @return 返回学生数量
	 */
	@Override
	public int length() {
		return this.students.size();
	}

	/**
	 * 获取集合迭代器
	 * @return 返回集合迭代器
	 */
	@Override
	public Iterator iterator() {
		return new StudentIterator(this);
	}
}
