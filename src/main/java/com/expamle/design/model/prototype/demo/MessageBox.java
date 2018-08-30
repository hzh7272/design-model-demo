package com.expamle.design.model.prototype.demo;

import com.expamle.design.model.prototype.support.AbstractProduct;

/**
 * @author hzh 2018/8/30 下午10:11
 */
public class MessageBox extends AbstractProduct {

	private String charString;

	public MessageBox(String charString) {
		this.charString = charString;
	}

	/**
	 * 使用方法
	 *
	 * @param s 需要打印的字符串
	 */
	@Override
	public void use(String s) {
		for (int i = 0, size = s.length() + 4; i < size; i++) {
			System.out.print(this.charString);
		}
		System.out.println("");

		System.out.println(charString + " " + s + " " + charString);

		for (int i = 0, size = s.length() + 4; i < size; i++) {
			System.out.print(this.charString);
		}
		System.out.println("");
	}
}
