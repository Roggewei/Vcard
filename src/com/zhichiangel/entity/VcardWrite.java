package com.zhichiangel.entity;
/**
 * ��Ƭ���м���
 * @author weijiabin
 *
 */
public class VcardWrite {
	/**
	 * ����
	 */
	private java.lang.String name;
	/**
	 * �ֻ�
	 */
	private java.lang.String phone;
	/**
	 * �绰
	 */
	private java.lang.String tell;
	/**
	 * email
	 */
	private java.lang.String email;
	/**
	 * סַ
	 */
	private java.lang.String address;
	/**
	 * ��˾
	 */
	private java.lang.String company;
	/**
	 * ����
	 * @return
	 */
	public java.lang.String getName() {
		return name;
	}
	public void setName(java.lang.String name) {
		this.name = "FN:"+name;
	}
	/**
	 * �ֻ���
	 * @return
	 */
	public java.lang.String getPhone() {
		return phone;
	}
	public void setPhone(java.lang.String phone) {
		this.phone = "TEL;CELL:" +phone;
	}
	/**
	 * �̶��绰��
	 * @return
	 */
	public java.lang.String getTell() {
		return tell;
	}
	public void setTell(java.lang.String tell) {
		this.tell = "TEL;HOME:"+tell;
	}
	/**
	 * �ʼ���ַ
	 * @return
	 */
	public java.lang.String getEmail() {
		return email;
	}
	public void setEmail(java.lang.String email) {
		this.email = "EMAIL;HOME:"+email;
	}
	/**
	 * סַ
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
	 *��Ƭ�����ʽ�ַ���
	 */
	@Override
	public String toString() {
		return "BEGIN:VCARD"+"\n\r"+"VERSION:2.1"+ "\n\r"+name +"\n\r"+  phone + "\n\r"
				+ tell + "\n\r"+ email + "\n\r"+ address
				+ "\n\r"+ company + "\n\r"+"END:VCARD";
	}
	
	
}
