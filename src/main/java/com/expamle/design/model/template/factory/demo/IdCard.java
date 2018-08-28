package com.expamle.design.model.template.factory.demo;

import com.expamle.design.model.template.factory.support.Product;
import lombok.Data;

/**
 * ID卡产品类
 * @author hzh 2018/8/28 下午10:28
 */
@Data
public class IdCard extends Product {

	private String cardNo;
	private String name;

	IdCard(String name) {
		this.name = name;
		this.cardNo = System.currentTimeMillis() + "";
	}

	/**
	 * 使用产品抽象方法
	 */
	@Override
	public void use() {
		System.out.println("使用ID卡，name: " + this.name + ", 卡号: " + this.cardNo);
	}
}
