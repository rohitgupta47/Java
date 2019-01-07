package com.rohit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Duplct {

	public static void main(String[] args) {//"[^a-zA-Z]+"
		BufferedReader br=null;
		String line;
		try {
			br=new BufferedReader(new FileReader("/home/uttara/Desktop/rohit.txt"));
			while((line=br.readLine())!=null) {
				System.out.println(line+"  yess");
			String s=line.replaceAll("[^a-zA-Z]+", " ");
			System.out.println(s);}
		}catch(IOException e) {
			
			e.printStackTrace();
		}finally {
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
