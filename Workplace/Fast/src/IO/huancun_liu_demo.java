package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class huancun_liu_demo {
	public static void main(String[] args) {
		File file = new File("E:\\��ʱ�ļ�Ŀ¼\\payday2�����ļ�\\demo_2.txt");
		try(
				FileReader reader = new FileReader(file);
				BufferedReader buff = new BufferedReader(reader);
		   ) {
			while(true) {
				String tmp = buff.readLine();
				if(tmp==null)
					break;
				print(tmp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}



class demo_xieru{
	public static void main(String[] arguments) {
		File file = new File("E:\\��ʱ�ļ�Ŀ¼\\payday2�����ļ�\\demo_2.txt");
		try (
				FileWriter writer = new FileWriter(file);
				PrintWriter pr = new PrintWriter(writer);
			){
			pr.write("�й����������");
			pr.write("����������ϢѧԺ");
			pr.write("������л���������ҵ��");
			pr.write("��������  �����   �����");
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			FileReader out = new FileReader(file);
			BufferedReader buffer = new BufferedReader(out);
			while(true) {
				String tmp = buffer.readLine();
				if(tmp==null) {
					break;
				}
				print(tmp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}