package com.expamle.design.model.adapter.demo;

import com.expamle.design.model.adapter.support.FileIo;
import org.junit.Test;

/**
 * 文件键值对操作测试
 * @author hzh 2018/8/27 下午11:48
 */
public class FilePropertiesTest {

	@Test
	public void test() throws Exception {
		FileIo fileIo = new FileProperties();
		String path = this.getClass().getClassLoader().getResource("a.txt").getPath();
		fileIo.readFromFile(path);
		System.out.println(((FileProperties) fileIo).get("year"));

		fileIo.setValue("name", "hongzh");
		fileIo.setValue("age", "26");

		fileIo.writeToFile(path.replace("a.txt", "b.txt"));
	}
}
