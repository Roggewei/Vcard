package com.zhichiangel.demo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.zhichiangel.entity.Vcard;
import com.zhichiangel.util.Util;


/**
 * 测试demo文件
 * @author weijiabin
 *
 */
public class CreateVcardTest {
	Util util = new Util();
	/**
	 * 创建一个名片文件
	 */
	@Test
	public void createVcardtest() {
		Vcard vc = new Vcard();
		vc.setAddress("China beijing");
		vc.setCompany("shenzhoushuma");
		vc.setEmail("1160060542@qq.com");
		vc.setName("weijiabin");
		vc.setPhone("18249238943");
		vc.setTell("66666666");
		//本地地址C:/Users/tr/Desktop/vc/
		util.createVcrad(vc,"C:/Users/tr/Desktop/vc/","test");
	}
	
	@Test
	public void createVcardList() {
		Vcard vc1 = new Vcard();
		vc1.setAddress("China beijing");
		vc1.setCompany("shenzhoushuma");
		vc1.setEmail("1160060542@qq.com");
		vc1.setName("weijiabin");
		vc1.setPhone("18249238943");
		vc1.setTell("66666666");
		Vcard vc2 = new Vcard();
		vc2.setAddress("China beijing");
		vc2.setCompany("shenzhoushuma");
		vc2.setEmail("1160060542@qq.com");
		vc2.setName("weijiabin");
		vc2.setPhone("18249238943");
		vc2.setTell("66666666");
		List<Vcard> list = new ArrayList<Vcard>();
		list.add(vc1);
		list.add(vc2);
		//本地地址C:/Users/tr/Desktop/vc/
		util.createVcradAll(list,"C:/Users/tr/Desktop/vc/","testlist");
	}
	@Test
	public void readFileTest(){
		List<Vcard> list = util.readVcard("C:/Users/tr/Desktop/vc/00002.vcf");
		for(Vcard v:list){
			System.out.println("姓名"+v.getName());
			System.out.println("电话"+v.getTell());
			System.out.println("手机"+v.getPhone());
			
		}
	}
}
