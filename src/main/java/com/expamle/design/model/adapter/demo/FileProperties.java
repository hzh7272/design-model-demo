package com.expamle.design.model.adapter.demo;

import com.expamle.design.model.adapter.support.FileIo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 文件键值对操作
 * @author hzh 2018/8/27 下午11:44
 */
public class FileProperties extends Properties implements FileIo {

	/**
	 * 从文件读取数据
	 *
	 * @param fileName 文件名称
	 * @throws IOException IO异常
	 */
	@Override
	public void readFromFile(String fileName) throws IOException {
		load(new FileInputStream(new File(fileName)));
	}

	/**
	 * 写入数据到文件中
	 *
	 * @param fileName 文件名称
	 * @throws IOException IO异常
	 */
	@Override
	public void writeToFile(String fileName) throws IOException {
		store(new FileOutputStream(new File(fileName)), "written by FileProperties");
	}

	/**
	 * 设置键值对
	 *
	 * @param key   键
	 * @param value 值
	 */
	@Override
	public void setValue(String key, String value) {
		setProperty(key, value);
	}

	/**
	 * 获取键对应的值
	 *
	 * @param key 键
	 * @return 返回键对应的值
	 */
	@Override
	public String getValue(String key) {
		return getProperty(key);
	}
}
