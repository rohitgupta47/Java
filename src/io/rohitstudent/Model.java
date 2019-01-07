package io.rohitstudent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Model 
{

	public void add(Student s) throws IOException 
	{
		BufferedWriter bw=null;
		try
		{
			bw=new BufferedWriter(new FileWriter(Constants.FILE_PATH,true));
			bw.write(s.toString());
			bw.newLine();
		}
		finally 
		{
			if(bw!=null)
				bw.close();
			
		}
	}

	public List<Student> getStudents() throws IOException 
	{
		BufferedReader br=null;
		List<Student>list=new ArrayList<Student>();
		try
		{
			br=new BufferedReader(new FileReader(Constants.FILE_PATH));
			
			String line=null;
			while((line=br.readLine())!=null)
			{
				String[] sa=line.split(":");
				Student s=new Student(sa[0], sa[1], sa[2], LocalDate.parse(sa[3]));
				list.add(s);
				
			}
			return list;
		}
		finally 
		{
			if(br!=null)
			br.close();
			
		}
	}

	public void update(List<Student> list) throws IOException 
	{
		BufferedWriter bw=null;
		try
		{
			for(Student s:list)
			{
			bw=new BufferedWriter(new FileWriter(Constants.FILE_PATH));
			bw.write(s.toString());
			bw.newLine();
			}
		}
		finally 
		{
			if(bw!=null)
				bw.close();
			
		}
		
	}

}
