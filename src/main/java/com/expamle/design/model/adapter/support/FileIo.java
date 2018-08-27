package com.expamle.design.model.adapter.support;

import java.io.IOException;

/**
 * 文件操作接口
 * @author hzh 2018/8/27 下午11:36
 */
public interface FileIo {

	/**
	 * 从文件读取数据
	 * @param fileName 文件名称
	 * @throws IOException IO异常
	 */
	void readFromFile(String fileName) throws IOException;

	/**
	 * 写入数据到文件中
	 * @param fileName 文件名称
	 * @throws IOException IO异常
	 */
	void writeToFile(String fileName) throws IOException;

	/**
	 * 设置键值对
	 * @param key 键
	 * @param value 值
	 */
	void setValue(String key, String value);

	/**
	 * 获取键对应的值
	 * @param key 键
	 * @return 返回键对应的值
	 */
	String getValue(String key);
}
