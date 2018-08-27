package com.expamle.design.model.iterator.demo;

import org.junit.Test;

/**
 * 迭代小组学生案例
 * @author hzh 2018/8/27 下午11:07
 */
public class IteratorGroupDemoTest {

	@Test
	public void iteratorTest() {
		var group = new Group();
		group.appendStudent(new Student("张三"));
		group.appendStudent(new Student("李四"));
		group.appendStudent(new Student("王五"));
		group.appendStudent(new Student("刘六"));

		var iterator = group.iterator();
		while (iterator.hasNext()) {
			System.out.println(((Student) iterator.next()).getName());
		}
	}
}
