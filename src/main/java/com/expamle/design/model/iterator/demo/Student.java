package com.expamle.design.model.iterator.demo;

import lombok.Data;

/**
 * 学生模型
 * @author hzh 2018/8/27 下午10:47
 */
@Data
public class Student {

	private String name;

	public Student(String name) {
		this.name = name;
	}
}
