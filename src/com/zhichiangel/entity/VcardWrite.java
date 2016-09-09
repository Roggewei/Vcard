package com.zhichiangel.entity;
/**
 * 名片输中间类
 * @author weijiabin
 *
 */
public class VcardWrite {
	/**
	 * 姓名
	 */
	private java.lang.String name;
	/**
	 * 手机
	 */
	private java.lang.String phone;
	/**
	 * 电话
	 */
	private java.lang.String tell;
	/**
	 * email
	 */
	private java.lang.String email;
	/**
	 * 住址
	 */
	private java.lang.String address;
	/**
	 * 公司
	 */
	private java.lang.String company;
	/**
	 * 姓名
	 * @return
	 */
	public java.lang.String getName() {
		return name;
	}
	public void setName(java.lang.String name) {
		this.name = "FN:"+name;
	}
	/**
	 * 手机号
	 * @return
	 */
	public java.lang.String getPhone() {
		return phone;
	}
	public void setPhone(java.lang.String phone) {
		this.phone = "TEL;CELL:" +phone;
	}
	/**
	 * 固定电话号
	 * @return
	 */
	public java.lang.String getTell() {
		return tell;
	}
	public void setTell(java.lang.String tell) {
		this.tell = "TEL;HOME:"+tell;
	}
	/**
	 * 邮件地址
	 * @return
	 */
	public java.lang.String getEmail() {
		return email;
	}
	public void setEmail(java.lang.String email) {
		this.email = "EMAIL;HOME:"+email;
	}
	/**
	 * 住址
	 * @return
	 */
	public java.lang.String getAddress() {
		return address;
	}
	public void setAddress(java.lang.String address) {
		this.address = "ADR;HOME:"+address;
	}
	public java.lang.String getCompany() {
		return company;
	}
	public void setCompany(java.lang.String company) {
		this.company = "ADR;WORK:"+company;
	}
	/**
	 *名片输出形式字符串
	 */
	@Override
	public String toString() {
		return "BEGIN:VCARD"+"\n\r"+"VERSION:2.1"+ "\n\r"+name +"\n\r"+  phone + "\n\r"
				+ tell + "\n\r"+ email + "\n\r"+ address
				+ "\n\r"+ company + "\n\r"+"END:VCARD";
	}
	
	
}
