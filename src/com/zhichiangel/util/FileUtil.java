package com.zhichiangel.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * 文件操作类
 * @author weijiabin
 *
 */
public class FileUtil {
	/**
	 * 写入名片字符流
	 * @param str 名片内容
	 * @param path 名片路径
	 * @param name 名片名称
	 * @return
	 */
	public boolean createFile(String str,String path,String name){
		boolean flag = true;
		FileWriter fw;
		try {
			fw = new FileWriter(new File(path+name+".vcf"));
			fw.write(str);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			flag = false;
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * 根据文件目录读取文件返回字符串
	 * @param fileName
	 * @return
	 */
	public String readFile(String fileName){
		  File file = new File(fileName);
	        BufferedReader reader = null;
	        String str = "";
	        StringBuffer strbuff = new StringBuffer();
	        try {
	           
	            reader = new BufferedReader(new FileReader(file));
	            String tempString = null;
	            
	            int line = 1;
	            // 一次读入一行，直到读入null为文件结束
	            while ((tempString = reader.readLine()) != null) {
	                
	               strbuff.append(tempString);
	            }
	            str = strbuff.toString();
	            reader.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (reader != null) {
	                try {
	                    reader.close();
	                } catch (IOException e1) {
	                }
	            }
	        }
	        return str;
	}
}
