package com.rohit;

import java.io.*;

public class RootPath {

	public static void main(String[] args)  {
			File f=new File("/home/uttara/Desktop/rohit");
			System.out.println(f.isFile());
			System.out.println(f.isDirectory());
			BufferedReader br=null;
			try{
				if(f.exists()&&f.isFile()&&f.getName().contains(".txt")) {
				br=new BufferedReader(new FileReader(f));
				String line;
				while((line=br.readLine())!=null) {
					System.out.println(line);
				}
			
				}
				//try {
				else	if(f.exists()&&f.isDirectory()) {
						File[] f1=f.listFiles();
						for(File f0:f1) {
							System.out.println(f0.getAbsolutePath());
							br=new BufferedReader(new FileReader(f0.getAbsolutePath()));
							String line;
							if(f0.getName().contains(".txt")) {
								while((line=br.readLine())!=null) {
									System.out.println(line);
								}
							}
						}
					}}
				//}
				/*catch(IOException e) {
					e.printStackTrace();
				}
				finally {
					br.close();
				}
			}*/
			catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
						}

}
