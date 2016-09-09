package com.zhichiangel.util;

import java.util.ArrayList;
import java.util.List;

import com.zhichiangel.entity.Vcard;
import com.zhichiangel.entity.VcardWrite;





public class Util extends FileUtil{
	/**
	 * 创建一个包含一人的名片文件
	 * @param vc 输出名片类
	 * @param path 名片文件保存地址
	 * @param name 名片文件保存名称
	 */
	 public void createVcrad(Vcard vc,String path,String name){
		this.createFile(this.vcAndVcw(vc).toString(), path, name);
	 }
	 /**
	  * 创建一个包含多个名片的名片文件
	  * @param list
	  * @param path
	  * @param name
	  */
	 public void createVcradAll(List<Vcard> list,String path,String name){
		 List<VcardWrite> listWrite = new ArrayList<VcardWrite>();
		 for(Vcard vc:list){
			 listWrite.add(this.vcAndVcw(vc));
		 }
		 StringBuffer strbuff = new StringBuffer();
		 for(VcardWrite vcw:listWrite){
			strbuff.append(vcw.toString()+"\n\r");
		 }
		 this.createFile(strbuff.toString(), path, name);
	 }
	 /**
	  * 名片类转化为输出名片类
	  * @param vc
	  * @return
	  */
	 public VcardWrite vcAndVcw(Vcard vc){
		 VcardWrite vcw = new VcardWrite();
		 if(vc.getAddress() != null){
			 vcw.setAddress(vc.getAddress());
		 }
		if(vc.getCompany() != null){
				vcw.setCompany(vc.getCompany());
		}
		if(vc.getEmail() != null){
			vcw.setEmail(vc.getEmail());
		}
		if(vc.getName() != null){
			 vcw.setName(vc.getName());
		}
		if(vc.getPhone() != null){
			 vcw.setPhone(vc.getPhone());
		}
		if(vc.getTell() != null){
			 vcw.setTell(vc.getTell());
		}
		return vcw;
	 }
	 
	 public List<Vcard> readVcard(String fileName){
		 List<Vcard> list = new ArrayList<Vcard>();
		 //文件内容字符串
		 String strList = this.readFile(fileName);
		 String[] arr = strList.split("BEGIN:VCARDVERSION:2.1");
		// for(String s:arr){
			
			// String[] vcard = str.split("\n\r");
		
				for(String s:arr){
					Vcard vc = new Vcard();
					//名字
					if(s.contains("FN:")&&s.contains("TEL;CELL:")){
						vc.setName(s.substring(s.indexOf("FN:")+3,s.indexOf("TEL;CELL:")));
						
						
					}else if(s.contains("FN:")){
						vc.setName(s.substring(s.indexOf("FN:")+3,s.indexOf("END:VCARD")));
					}
					//电话
					if(s.contains("TEL;CELL:")&&s.contains("TEL;HOME:")){
						vc.setPhone(s.substring(s.indexOf("TEL;CELL:")+9,s.indexOf("TEL;HOME:")));
					}else if(s.contains("TEL;CELL:")){
						vc.setPhone(s.substring(s.indexOf("TEL;CELL:")+9,s.indexOf("END:VCARD")));
					}
					//固话
					if(s.contains("TEL;HOME:")&&s.contains("EMAIL;HOME:")){
						vc.setTell(s.substring(s.indexOf("TEL;HOME:")+9,s.indexOf("EMAIL;HOME:")));
					}else if(s.contains("TEL;HOME:")){
						vc.setTell(s.substring(s.indexOf("TEL;HOME:")+9,s.indexOf("END:VCARD")));
					}
					//email
					if(s.contains("EMAIL;HOME:")&&s.contains("ADR;HOME:")){
						vc.setEmail(s.substring(s.indexOf("EMAIL;HOME:")+11,s.indexOf("ADR;HOME:")));
					}else if(s.contains("EMAIL;HOME:")){
						vc.setEmail(s.substring(s.indexOf("EMAIL;HOME:")+11,s.indexOf("END:VCARD")));
					}
					//地址
					if(s.contains("ADR;HOME:")&&s.contains("ADR;WORK:")){
						vc.setAddress(s.substring(s.indexOf("ADR;HOME:")+9,s.indexOf("ADR;WORK:")));
					}else if(s.contains("ADR;HOME:")){
						vc.setAddress(s.substring(s.indexOf("ADR;HOME:")+9,s.indexOf("END:VCARD")));
					}
					//工作
					if(s.contains("ADR;WORK:")){
						vc.setCompany(s.substring(s.indexOf("ADR;WORK:")+9,s.indexOf("END:VCARD")));
					}
					list.add(vc);

				}
		// }
		 
		 return list;
	 }
}
