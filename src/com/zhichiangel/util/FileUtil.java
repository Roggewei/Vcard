package com.zhichiangel.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * �ļ�������
 * @author weijiabin
 *
 */
public class FileUtil {
	/**
	 * д����Ƭ�ַ���
	 * @param str ��Ƭ����
	 * @param path ��Ƭ·��
	 * @param name ��Ƭ����
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
	 * �����ļ�Ŀ¼��ȡ�ļ������ַ���
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
	            // һ�ζ���һ�У�ֱ������nullΪ�ļ�����
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
